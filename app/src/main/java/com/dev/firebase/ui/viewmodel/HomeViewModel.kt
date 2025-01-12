package com.dev.firebase.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dev.firebase.model.Mahasiswa
import com.dev.firebase.repository.MahasiswaRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import java.io.IOException

sealed class HomeUiState {
    data class Success(val mahasiswa: List<Mahasiswa>) : HomeUiState()
    data class  Error(val message: Throwable):HomeUiState()
    object Loading : HomeUiState()
}

class HomeViewModel (private val mhs: MahasiswaRepository)
    : ViewModel(){
    var mhsUiState: HomeUiState by mutableStateOf(HomeUiState.Loading)
        private set

    init {
        getMhs()
    }

    fun getMhs() {
        viewModelScope.launch {
          mhs.getMahasiswa()
              .onStart {
                  mhsUiState = HomeUiState.Loading
              }
              .catch {
                  mhsUiState = HomeUiState.Error(it)
              }
              .collect {
                  mhsUiState = if (it.isEmpty()) {
                      HomeUiState.Error(Exception("Belum ada daftar mahasiswa"))
                  }
                  else{
                      HomeUiState.Success(it)
                  }
              }
            }
        }
    }


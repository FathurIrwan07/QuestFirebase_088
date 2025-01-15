package com.dev.firebase.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.dev.firebase.MahasiswaApplications

object PenyediaViewModel {
    val Factory = viewModelFactory {

        initializer {
            HomeMhsViewModel(
                aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
        initializer {
            InsertViewModel(
                aplikasiMahasiswa().container.mahasiswaRepository
            )
        }


    }
}

fun CreationExtras.aplikasiMahasiswa(): MahasiswaApplications =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplications)
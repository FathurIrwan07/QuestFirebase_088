package com.dev.firebase.repository

import com.dev.firebase.model.Mahasiswa
import kotlinx.coroutines.flow.Flow
import java.io.IOException

interface MahasiswaRepository{
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    suspend fun getMahasiswa(): Flow<List<Mahasiswa>>

    suspend fun getMahasiswabyNim(nim: String): Flow<Mahasiswa>

    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)

    suspend fun deleteMahasiswa(nim: String)


}




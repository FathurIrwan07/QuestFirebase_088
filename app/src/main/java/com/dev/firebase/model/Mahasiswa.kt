package com.dev.firebase.model



data class Mahasiswa (
    val nim: String,
    val nama: String,
    val jenis_kelamin: String,
    val alamat: String,
    val kelas: String,
    val angkatan: String,
    val judul_skripsi: String,
    val dospem1: String,
    val dospem2: String

)
{
    constructor():this("", "", "", "", "", "", "", "", "")
}



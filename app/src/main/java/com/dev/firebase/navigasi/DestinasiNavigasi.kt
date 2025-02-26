package com.dev.firebase.navigasi

interface DestinasiNavigasi {
    val route: String
    val titleRes: String
}

object DestinasiHome : DestinasiNavigasi {
    override val route: String = "home"
    override val titleRes: String = "Home"
}

object DestinasiInsert : DestinasiNavigasi {
    override val route: String = "insert"
    override val titleRes: String = "Insert"
}

object DestinasiDetail : DestinasiNavigasi {
    override val route: String = "detail"
    override val titleRes: String = "Detail"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}

object DestinasiUpdate : DestinasiNavigasi {
    override val route: String = "update"
    override val titleRes: String = "Update"
    const val NIM = "nim"
    val routeWithArg = "$route/{$NIM}"
}

/*
object DestinasiUpdate : DestinasiNavigasi {
    override val route: String = "update"
    override val titleRes: String = "Update"
    const val NIM = "nim" // Jika Anda ingin menggunakan NIM sebagai argumen
    val routeWithArg = "$route/{$NIM}" // Format rute dengan argumen
}
*/
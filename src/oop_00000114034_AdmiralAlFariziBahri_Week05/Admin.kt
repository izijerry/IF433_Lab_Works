package oop_00000114034_AdmiralAlFariziBahri_Week05

class Admin(nama : String) : Pegawai(nama) {
    override fun berkerja() {
        println("[$nama] sedang berkerja di depan komputer melayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap database mahasiswa.")
    }
}
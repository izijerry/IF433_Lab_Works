package oop_00000114034_AdmiralAlFariziBahri_Week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun berkerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan revisi RPKSP.")
    }

    fun mengjar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}
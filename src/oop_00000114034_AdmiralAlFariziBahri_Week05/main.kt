package oop_00000114034_AdmiralAlFariziBahri_Week05

fun main(){
    val dosen1 = Dosen("gavin", "12345")
    val admin1 = Admin("budi")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.berkerja()

        when(pegawai){
            is Dosen -> {
                println("terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
            }
            is Admin -> {
                println("terdeteksi sebagai admin")
                pegawai.doAdminWork()
            }
        }
        println("----------------------------------")
    }

}
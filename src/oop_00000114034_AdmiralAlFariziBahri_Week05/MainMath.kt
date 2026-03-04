package oop_00000114034_AdmiralAlFariziBahri_Week05

fun main(){
    val mathHelper = MathHelper()

    val persegi = mathHelper.hitungLuas(2)
    println("persegi: $persegi")

    val persegiPanjang = mathHelper.hitungLuas(3, 4)
    println("persgi panjang: $persegiPanjang")

    val lingkaran = mathHelper.hitungLuas(7.5)
    println("lingkaran: $lingkaran")
}
package oop_00000114034_AdmiralAlFariziBahri_Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMB ---")

    print("masukan nama")
    val name = scanner.nextLine()

    print("masukan NIM (wajib 5 karakter)")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: NIM harus 5 karakter!!!")
    }else{
        print("Pilih jalur (1.Reguler, 2.Umum)")
        val type = scanner.nextInt()
        scanner.nextLine()

        if (type == 1){
            print("masukan jurusan: ")
            val major = scanner.nextLine()
//          pake primary constructor
            val s1 = student(name, nim, major)
            println("terdaftar di ${s1.major} dengan gpa awal ${s1.gpa}")
        }else if (type == 2){
//          pake sec constructor
            val s2 = student(name, nim)
            println("terdaftar di ${s2.major} dengan gpa awal ${s2.gpa}")
        }else{
            println("pendaftaran batal. silahkan input lagi dengan benar")
        }
    }


}
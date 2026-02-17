package oop_00000114034_AdmiralAlFariziBahri_Week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLILASO PMB UMB ---")

    print("masukan nama")
    val name = scanner.nextLine()

    print("masukan NIM (wajib 5 karakter)")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("ERROR: NIM harus 5 karakter!!!")
    }else{
        print("masukan jurusan:")
        val major = scanner.nextLine()

        val s1 = student(name, nim, major)
        println("Status: pendaftaran berhasil")
    }
}
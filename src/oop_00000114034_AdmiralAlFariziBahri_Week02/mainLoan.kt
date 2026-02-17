package oop_00000114034_AdmiralAlFariziBahri_Week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    println("--- APLIKASI LOAN ---")

    print("masukan judul buku: ")
    val judul = scanner.nextLine()

    print("masukan peminjaman: ")
    val peminjaman = scanner.nextLine()

    print("lama peminjaman: ")
    var lama_peminjaman = scanner.nextInt()

    scanner.nextLine()

    if (lama_peminjaman < 0) {
        lama_peminjaman = 1
    }

    val pinjam = Loan(judul, peminjaman, lama_peminjaman)

    println("Judul Buku : ${pinjam.bookTitle}")
    println("Peminjam   : ${pinjam.borrower}")
    println("Durasi     : ${pinjam.loanDuration} hari")

    println("Total denda: ${pinjam.calculateFine()}")
}
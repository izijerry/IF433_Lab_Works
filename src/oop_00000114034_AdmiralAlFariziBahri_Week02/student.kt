package oop_00000114034_AdmiralAlFariziBahri_Week02

class student(val name: String, val nim: String, val major: String){
    init{
        if (nim.length != 5){
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem")
        }else{
            println("LOG: Objek student $name berhasil dialokasian di memory.")
        }
    }

    constructor(name: String, nim: String):this(name, nim, major = "Non-Matriculated"){
        println("LOG: menggunakan constructor jalur umum tanpa jurusan")
    }
}
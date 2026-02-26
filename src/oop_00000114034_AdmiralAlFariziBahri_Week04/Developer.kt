package oop_00000114034_AdmiralAlFariziBahri_Week04

class Developer (name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {
    override fun work(){
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}
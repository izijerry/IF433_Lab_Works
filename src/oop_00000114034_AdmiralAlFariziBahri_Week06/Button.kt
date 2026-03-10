package oop_00000114034_AdmiralAlFariziBahri_Week06

class Button(override val name: String): Clickable {
    override fun click() {
        println("tombol '$name' berhasil di click")
    }
}
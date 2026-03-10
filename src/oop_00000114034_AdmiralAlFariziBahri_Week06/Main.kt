package oop_00000114034_AdmiralAlFariziBahri_Week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== testing checkout ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

//    tugas
    val lamp = SmartLamp("123", "Ruang Tamu")
    val speaker = SmartSpeaker("123", "Google Nest Dapur")
    val cctv = SmartCCTV("123", "Ezviz Garasi")

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n=== Activate Security Mode ===")
    hub.activateSecurityMode()
    println("\n=== Turn Off All Switches ===")
    hub.turnOffAllSwitches()

}
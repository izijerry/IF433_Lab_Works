package oop_00000114034_AdmiralAlFariziBahri_Week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if(devices is Switchable){
                devices.turnOff()
            }
        }
    }
}
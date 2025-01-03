class Ambulance(name: String, phone: String) : EmergencyServices(name, phone), Description {

    override fun getDescription() {
        println("Выезжает на срочные медицинские вызовы")
    }
}
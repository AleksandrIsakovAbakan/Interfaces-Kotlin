class FireService(name: String, phone: String) : EmergencyServices(name, phone), Description  {

    override fun getDescription() {
        println("Тушит пожары")
    }
}
package id.ac.polbeng.fiza.test_kelas

//child class
class LaptopB: Computer{
    val batteryLife: Double

//    calss super() to initialize the parent class
    constructor(name: String, brand: String, batteryLife: Double): super(name, brand){
        this.batteryLife = batteryLife
    }

//    calls another constructor
    constructor(name: String, brand: String): this(name, brand, 0.0){

    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main() {
    val myLaptop = LaptopB("Asus Think Pad", "Asus")
    println(myLaptop.info())
}
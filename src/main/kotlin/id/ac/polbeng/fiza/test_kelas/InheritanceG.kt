package id.ac.polbeng.fiza.test_kelas

open class Base(val name: String){
    init{
        println("Initializing Base")
    }

    open val size: Int = name.length.also{
        println("Initializig size in Base: $it")
    }
}
class Derived(name: String, val lastName: String): Base(name.capitalize().also {
    println("Argument for Base: $it")
}) {
    init{
        println("Initializing Derived")
    }

    override val size: Int = (super.size + lastName.length).also {
        println("Initializing size in Derrived: $it")
    }
}

fun main() {
    val turunan = Derived("Siti", "Nurhafizah")
    turunan.size
}
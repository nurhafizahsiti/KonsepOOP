package id.ac.polbeng.fiza.test_kelas

class Outer{
    val a = "Outside Nested Class."
    class Nested{
        val b = "Inside Nested Class."
        fun calMe() = "Function call from inside Nested Class."
    }
}

fun main(args: Array<String>) {
//    accessing member of Nested class
    println(Outer.Nested().b)

//    creating object
    val nested = Outer.Nested()
    println(nested.calMe())
}
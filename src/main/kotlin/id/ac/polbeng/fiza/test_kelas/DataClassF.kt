package id.ac.polbeng.fiza.test_kelas

fun main() {
    val meri = Student("Meri", 20)
//    destructuring declaration with componentN() method
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}
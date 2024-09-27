package id.ac.polbeng.fiza.test_kelas

fun main() {
    val meri = Student("Meri", 20)
//    destructuring declaration
    val (name, age) = meri
    println("Name = $name")
    println("Age = $age")
}
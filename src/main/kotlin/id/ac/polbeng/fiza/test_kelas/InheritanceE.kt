package id.ac.polbeng.fiza.test_kelas

open class NewPerson{
    open var age: Int = 1
}

class CheckPerson: NewPerson(){
    override var age: Int = 1
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age can't be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5 //works

    val checkPerson = CheckPerson()
    checkPerson.age = -5 //throws IllegalArgumentException : Age can not be negative
}
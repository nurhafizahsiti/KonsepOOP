package id.ac.polbeng.fiza.test_kelas

open class MyBase{
//    must use "open" modifier to allow child classes to override it
    open fun think(){
        println("Heyy!!! I am thinking ")
    }
}

class MyDerived: MyBase(){
//    mustuse "override" modifier to override a base class function
    override fun think() {
        println("I am from Child")
    }
}

fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}
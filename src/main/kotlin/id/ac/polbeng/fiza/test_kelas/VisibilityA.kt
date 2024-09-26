package id.ac.polbeng.fiza.test_kelas

private class privateExample{
    private val i = 1

    private fun doSomething(){
        println("Welcome to Private access!")
        println("Private access : $i")
    }
    fun calldoSomething(){
        doSomething();
    }
}
//protected
open class C(){
    protected val i = 1
}
class D: C(){
    fun getValue(): Int{
        println("Welcome to Protected access!")
        return i
    }
}
//internal
class internalExample {
    internal val i = 1
    internal fun doSomething() {
        println("Welcome to Internal access!")
        println("Internal access : $i")
    }
}
//public
class publicExample{
    val i = 1
    fun doSomething(){
        println("Welcome to Public access!")
        println("Public access : $i")
    }
}

fun main() {
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}
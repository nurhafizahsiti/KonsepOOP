package id.ac.polbeng.fiza.test_kelas

open class Rectangle{
    open fun draw(){
        println("From Base Class Rectangle")
    }
}

interface Polygon{
    fun draw(){
        println("From interface Polygon")
    }
}

class Square(): Rectangle(), Polygon{
//    the compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

fun main() {
    val square = Square()
    square.draw()
}
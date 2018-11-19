package vii_realworld._2__Static

class KotlinClassWithCompanionObject {

    companion object {
         private val foobar = "foobar"
    }

    fun doSomething() : String = foobar
}
package org.example

open class SomeClass {
    fun doThing1() {
        doThing2()
    }

    fun doThing2() {
        println("Hey")
    }
}
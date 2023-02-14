package com.libary.maths

object ArithmeticalUtilty {

    public fun add(a: Int, b: Int): Int {
        return a + b
    }

    public fun add(a: Double, b: Double): Double {
        return a + b
    }

    public fun subtraction(a: Double, b: Double): Double {
        return a - b
    }

    public fun subtraction(a: Int, b: Int): Int {
        return a - b
    }

    public fun multiplication(a: Int, b: Int): Int {
        return a * b
    }

    public fun multiplication(a: Double, b: Double): Double {
        return a * b
    }

    public fun division(a: Double, b: Double): Double {
        return a / b
    }

    public fun division(a: Int, b: Int): Int {
        return a / b
    }
}

fun main() {
    val addValue = ArithmeticalUtilty.add(1.2, 2.2).toFloat()
    val addValue1 = ArithmeticalUtilty.add(1, 2)
    println(addValue.toString())
}
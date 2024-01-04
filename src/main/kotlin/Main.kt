package org.atech

fun main() {
    val a = 5
    val b = 2
    val intCalculator = IntCalculator()
    println("IntCalculator:")
    println("  $a + $b = ${intCalculator.add(a, b)}")
    println("  $a - $b = ${intCalculator.subtract(a, b)}")
    println("  $a * $b = ${intCalculator.multiply(a, b)}")
    println("  $a / $b = ${intCalculator.divide(a, b)}")
    println()

}

/**
 * A simple calculator interface
 * @param T the type of the number
 * @property add the addition function
 * @property subtract the subtraction function
 * @property multiply the multiplication function
 * @property divide the division function
 * @see IntCalculator
 */
interface Calculator<T : Number> {
    /**
     * Adds two numbers
     * @param a the first number
     * @param b the second number
     * @return the sum of the two numbers
     */
    fun add(a: T, b: T): T

    /**
     * Subtracts two numbers
     * @param a the first number
     * @param b the second number
     * @return the difference of the two numbers
     */
    fun subtract(a: T, b: T): T

    /**
     * Multiplies two numbers
     * @param a the first number
     * @param b the second number
     * @return the product of the two numbers
     */
    fun multiply(a: T, b: T): T

    /**
     * Divides two numbers
     * @param a the first number
     * @param b the second number
     * @return the quotient of the two numbers
     * @throws ArithmeticException if the second number is zero
     */
    @Throws(ArithmeticException::class)
    fun divide(a: T, b: T): T
}

/**
 * A simple calculator for integers
 * @see Calculator
 */
class IntCalculator : Calculator<Int> {
    override fun add(a: Int, b: Int): Int = a + b
    override fun subtract(a: Int, b: Int): Int = a - b
    override fun multiply(a: Int, b: Int): Int = a * b
    override fun divide(a: Int, b: Int): Int = a / b
}

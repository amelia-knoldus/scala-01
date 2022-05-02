import scala.math._

object Calculator {

    def add(x: Int, y: Int): Int = {
        x + y
    }

    def subtract(x: Int, y: Int): Int = {
        x - y
    }

    def multiply(x: Int, y: Int): Int = {
        x * y
    }
    def divide(x: Double, y: Int): Double = {
        require(y != 0)
        x / y
    }

    def power(x: Int, y: Int): Double = {
        pow(x, y)
    }

    def absolute(x: Int): Int = {
        if (x < 0) (x * -1) else x        
    }

    def modulo(x: Int, y: Int): Int = {
        require(y != 0)
        x % y
    }

    def maxOf(x: Int, y: Int): Int = {
        if (x > y) x else y 
    }

    def minOf(x: Int, y: Int): Int = {
        if (x < y) x else y 
    }

}
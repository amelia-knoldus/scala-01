import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CalculatorSpec extends AnyFlatSpec with Matchers {

  "Add (8, 70)" should "return 8" in {

    Calculator.add(8, 0) shouldEqual 8
  }

  "Add (0, 0)" should "return 0" in {

    Calculator.add(0, 0) shouldEqual 0
  }
  
  "Add (6, 7)" should "return 13" in {

    Calculator.add(6, 7) shouldEqual 13
  }

  "Add (24, -56)" should "return -32" in {

    Calculator.add(24, -56) shouldEqual -32
  }

  "Add (-21, 10)" should "return -11" in {

    Calculator.add(-21, 10) shouldEqual -11
  }

  "Add (-3, -9)" should "return -12" in {

    Calculator.add(-3, -9) shouldEqual -12
  }

  /* --------------------------------------------- */

  "Subtract (0, 2)" should "return -2" in {

    Calculator.subtract(0, 2) shouldEqual -2
  }

  "Subtract (0, 0)" should "return 0" in {

    Calculator.subtract(0, 0) shouldEqual 0
  }

  "Subtract (20, 0)" should "return 20" in {

    Calculator.subtract(20, 0) shouldEqual 20
  }

  "Subtract (20, 2)" should "return 18" in {

    Calculator.subtract(20, 2) shouldEqual 18
  }

  "Subtract (1, 8)" should "return -7" in {

    Calculator.subtract(1, 8) shouldEqual -7
  }

  "Subtract (-15, -20)" should "return 5" in {

    Calculator.subtract(-15, -20) shouldEqual 5
  }

  "Subtract (-4, 6)" should "return -10" in {

    Calculator.subtract(-4, 6) shouldEqual -10
  }

  /* --------------------------------------------- */

  "Multiply (6, 0)" should "return 0" in {

    Calculator.multiply(6, 0) shouldEqual 0
  
  }

  "Multiply (0, 0)" should "return 0" in {

    Calculator.multiply(0, 0) shouldEqual 0
  
  }

  "Multiply (6, 4)" should "return 24" in {

    Calculator.multiply(6, 4) shouldEqual 24
  
  }

  "Multiply (-3, 9)" should "return -27" in {

    Calculator.multiply(-3, 9) shouldEqual -27
  
  }

  "Multiply (10, -9)" should "return -90" in {

    Calculator.multiply(10, -9) shouldEqual -90
  
  }

  "Mulpily (-12, -7)" should "return 84" in {

    Calculator.multiply(-12, -7) shouldEqual 84
  
  }

  /* --------------------------------------------- */

  "Divide (64, 4)" should "return 16" in {

    Calculator.divide(64, 4) shouldEqual 16
  
  }

  "Divide (13, 2)" should "return 6.50" in {

    Calculator.divide(13, 2) shouldEqual 6.50
  
  }

  "Divide (-55, 11)" should "return -5" in {

    Calculator.divide(-55, 11) shouldEqual -5
  
  }

  "Divide (-3, -15)" should "return 0.20" in {

    Calculator.divide(-3, -15) shouldEqual 0.20
  
  }

  "Divide (0, -15)" should "return 0" in {

    Calculator.divide(0, -15) shouldEqual 0
  
  }

  /* --------------------------------------------- */
    
  "Power (2, 3)" should "return 8" in {

    Calculator.power(2, 3) shouldEqual 8
  
  }

  "Power (-6, 5)" should "return -7776" in {

    Calculator.power(-6, 5) shouldEqual -7776
  
  }

  "Power (-3, 2)" should "return 9" in {

    Calculator.power(-3, 2) shouldEqual 9
  
  }

  "Power (5, -2)" should "return 0.04" in {

    Calculator.power(5, -2) shouldEqual 0.04
  
  }

  "Power (-20, -2)" should "return -0.05" in {

    Calculator.power(-20, -2) shouldEqual 0.0025
  
  }

  "Power (125, 0)" should "return 1" in {

    Calculator.power(125, 0) shouldEqual 1
  
  }

  "Power (0, 0)" should "return 1" in {

    Calculator.power(0, 0) shouldEqual 1
  
  }

  "Power (0, 3000)" should "return 0" in {

    Calculator.power(0, 300) shouldEqual 0
  
  }

  /* --------------------------------------------- */

  "Absolute (34)" should "return 34" in {

    Calculator.absolute(34) shouldEqual 34
  
  }

  "Absolute (-34)" should "return 34" in {

    Calculator.absolute(-34) shouldEqual 34
  
  }

  "Absolute (0)" should "return 0" in {

    Calculator.absolute(0) shouldEqual 0
  
  }

  /* --------------------------------------------- */

  "Modulo (26, 5)" should "return 1" in {

    Calculator.modulo(26, 5) shouldEqual 1
  
  }

  "Modulo (-25, 7)" should "return -4" in {

    Calculator.modulo(-25, 7) shouldEqual -4
  
  }

  "Modulo (-60, 15)" should "return 0" in {

    Calculator.modulo(-60, 15) shouldEqual 0
  
  }

  "Modulo (100, -25)" should "return 0" in {

    Calculator.modulo(100, -25) shouldEqual 0
  
  }

  "Modulo (102, -25)" should "return 2" in {

    Calculator.modulo(102, -25) shouldEqual 2
  
  }

  "Modulo (-2547, -500)" should "return 47" in {

    Calculator.modulo(-2547, -500) shouldEqual -47
  
  }

  "Modulo (0, 45)" should "return 0" in {

    Calculator.modulo(0, 45) shouldEqual 0
  
  }

  /* --------------------------------------------- */

  "Maximum of (2, 4000)" should "return 4000" in {

    Calculator.maxOf(2, 4000) shouldEqual 4000
  
  }

  "Maximum of (-500, 13)" should "return 13" in {

    Calculator.maxOf(-500, 13) shouldEqual 13
  
  }

  "Maximum of (9, -1)" should "return 9" in {

    Calculator.maxOf(9, -1) shouldEqual 9
  
  }

  "Maximum of (-256, -16)" should "return -16" in {

    Calculator.maxOf(-256, -16) shouldEqual -16
  
  }

  "Maximum of (0, 24)" should "return 24" in {

    Calculator.maxOf(0, 24) shouldEqual 24
  
  }

  "Maximum of (7, 7)" should "return 7" in {

    Calculator.maxOf(7, 7) shouldEqual 7
  
  }

  "Maximum of (0, -624)" should "return 0" in {

    Calculator.maxOf(0, -624) shouldEqual 0
  
  }

  /* --------------------------------------------- */

  "Minimum of (2, 4000)" should "return 4000" in {

    Calculator.minOf(2, 4000) shouldEqual 2
  
  }

  "Minimum of (-500, 13)" should "return 13" in {

    Calculator.minOf(-500, 13) shouldEqual -500
  
  }

  "Minimum of (9, -1)" should "return 9" in {

    Calculator.minOf(9, -1) shouldEqual -1
  
  }

  "Minimum of (-256, -16)" should "return -16" in {

    Calculator.minOf(-256, -16) shouldEqual -256
  
  }

  "Minimum of (0, 24)" should "return 24" in {

    Calculator.minOf(0, 24) shouldEqual 0
  
  }

  "Minimum of (7, 7)" should "return 7" in {

    Calculator.minOf(7, 7) shouldEqual 7
  
  }

  "Minimum of (0, -624)" should "return 0" in {

    Calculator.minOf(0, -624) shouldEqual -624
  
  }

}
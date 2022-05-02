import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ReverseSpec extends AnyFlatSpec with Matchers {

  "Reverse of list of ints (1, 2, 3)" should "equal (3, 2, 1)" in {

    Reverse.toList(List(1, 2, 3)) shouldEqual List(3, 2, 1)

  }

  "Reverse of list of strings (\"three\", \"two\", \"one\", \"zero\", \"minus one\")" should "equal (\"minus one\", \"zero\", \"one\", \"two\", \"three\")" in {

    Reverse.toList(List("three", "two", "one", "zero", "minus one")) shouldEqual List("minus one", "zero", "one", "two", "three")

  }

  "Reverse of list with two elements (987, 265)" should "equal (265, 987)" in {

    Reverse.toList(List(987, 265)) shouldEqual List(265, 987)

  }

  "Reverse of list with one element ((\"A\" -> 1))" should "equal ((\"A\" -> 1))" in {

    Reverse.toList(List(("A" -> 1))) shouldEqual List("A" -> 1)

  }

  "Reverse of empty list ()" should "be an empty list ()" in {

    Reverse.toList(List()) shouldEqual List()

  }

}
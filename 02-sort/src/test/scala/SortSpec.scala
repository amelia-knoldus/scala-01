import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SortSpec extends AnyFlatSpec with Matchers {

  "Quick sort list of ints (5, 2, 6, 11, 8)" should "return (2, 5, 6, 8, 11)" in {

    Sort.quickSort(List(5, 2, 6, 11, 8)) shouldEqual List(2, 5, 6, 8, 11)

  }

  "Quick sort list of ints with negative numbers (5, 2, -1, 6, 11, -7, 8, 0)" should "return (-7, -1, 0, 2, 5, 6, 8, 11)" in {

    Sort.quickSort(List(5, 2, -1, 6, 11, -7, 8, 0)) shouldEqual List(-7, -1, 0, 2, 5, 6, 8, 11)

  }

  "Quick sort list of sorted ints (1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)" should "return (1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)" in {

    Sort.quickSort(List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)) shouldEqual List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)

  }

  "Quick sort list of ints sorted in reverse order (7, 6, 5, 4, 3, 2, 1, 0, -1, -2)" should "return (-2, -1, 0, 1, 2, 3, 4, 5, 6, 7)" in {

    Sort.quickSort(List(7, 6, 5, 4, 3, 2, 1, 0, -1, -2)) shouldEqual List(-2, -1, 0, 1, 2, 3, 4, 5, 6, 7)

  }


  "Quick sort list of ints with repeating numbers (5, 3, 3, 3, 0, 3, 3)" should "return (0, 3, 3, 3, 3, 3, 5)" in {

    Sort.quickSort(List(5, 3, 3, 3, 0, 3, 3)) shouldEqual List(0, 3, 3, 3, 3, 3, 5)

  }


  "Quick sort list of ints with one repeating element (2, 2, 2, 2, 2, 2, 2, 2)" should "return (2, 2, 2, 2, 2, 2, 2, 2)" in {

    Sort.quickSort(List(2, 2, 2, 2, 2, 2, 2, 2)) shouldEqual List(2, 2, 2, 2, 2, 2, 2, 2)

  }

  "Quick sort list of two elements (7, -15)" should "return (-15, 7)" in {

    Sort.quickSort(List(7, -15)) shouldEqual List(-15, 7)

  }

  "Quick sort list of one element (256)" should "return (256)" in {

    Sort.quickSort(List(256)) shouldEqual List(256)

  }

  "Quick sort empty list ()" should "return ()" in {

    Sort.quickSort(List()) shouldEqual List()

  }

  
  /* ------------------------------------------------------------------- */


  "Insertion sort list of unsorted ints (5, 2, 6, 11, 23, 15, 9)" should "return (2, 5, 6, 9, 11, 15, 23)" in {

    Sort.insertionSort(List(5, 2, 6, 11, 23, 15, 9)) shouldEqual List(2, 5, 6, 9, 11, 15, 23)

  }

  "Insertion sort list of sorted ints (1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)" should "return (1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)" in {

    Sort.insertionSort(List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)) shouldEqual List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)

  }

  "Insertion sort list of ints sorted in reverse order (7, 6, 5, 4, 3, 2, 1, 0, -1, -2)" should "return (-2, -1, 0, 1, 2, 3, 4, 5, 6, 7)" in {

    Sort.insertionSort(List(7, 6, 5, 4, 3, 2, 1, 0, -1, -2)) shouldEqual List(-2, -1, 0, 1, 2, 3, 4, 5, 6, 7)

  }

  "Insertion sort list of unsorted ints with negatives (0, -4, 5, -2, -5, 2, -3, 1, -1, 4, 3)" should "return (-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)" in {

    Sort.insertionSort(List(0, -4, 5, -2, -5, 2, -3, 1, -1, 4, 3)) shouldEqual List(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)

  }

  "Insertion sort list of two elements (32, 15)" should "return (15, 32)" in {

    Sort.insertionSort(List(32, 15)) shouldEqual List(15, 32)

  }

  "Insertion sort list with repeating elements (40, 20, 30, 40, 40, 50, 40)" should "return (20, 30, 40, 40, 40, 40, 50)" in {

    Sort.insertionSort(List(40, 20, 30, 40, 40, 50, 40)) shouldEqual List(20, 30, 40, 40, 40, 40, 50)

  }

  "Insertion sort list with one repeating element (42, 42, 42, 42, 42, 42, 42, 42)" should "return (42, 42, 42, 42, 42, 42, 42, 42)" in {

    Sort.insertionSort(List(42, 42, 42, 42, 42, 42, 42, 42)) shouldEqual List(42, 42, 42, 42, 42, 42, 42, 42)

  }

  "Insertion sort list of one element (-64)" should "return (-64)" in {

    Sort.insertionSort(List(-64)) shouldEqual List(-64)

  }

  "Insertion sort empty list ()" should "return ()" in {

    Sort.insertionSort(List()) shouldEqual List()

  }
}
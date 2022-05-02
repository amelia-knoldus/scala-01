object Sort {

    def quickSort(list: List[Int]): List[Int] = {

        def quickSortHelper(list: List[Int], pivot: Int, left: List[Int], right: List[Int]): List[Int] = {

            if (list.isEmpty) quickSort(right) ++: pivot +: quickSort(left)
            else if (list.tail.isEmpty)
                if (list.head >= pivot) quickSortHelper(List(), pivot, list.head +: left, right)
                else quickSortHelper(List(), pivot, left, list.head +: right)
            else
                if (list.head >= pivot) quickSortHelper(list.tail, pivot, list.head +: left, right)
                else quickSortHelper(list.tail, pivot, left, list.head +: right)

        }

        if (list.isEmpty || list.tail.isEmpty) list
        else quickSortHelper(list.tail, list.head, List(), List())


    }

    /** ----------------------------------------- **/
    /** Insertion Sort solution from Rock the JVM **/
    //    tail recursion (last call of the function is recursive)

    def insertionSort(list: List[Int]): List[Int] = {

        def insertionSortHelper(pivot: Int, list: List[Int]): List[Int] = {
            if (list.isEmpty || pivot <= list.head) pivot +: list
            else list.head +: insertionSortHelper(pivot, list.tail)
        }

        if (list.isEmpty || list.tail.isEmpty) list
        else insertionSortHelper(list.head, insertionSort(list.tail))

    }

    /** Insertion Sort solution from Rock the JVM **/
    /** ----------------------------------------- **/

}
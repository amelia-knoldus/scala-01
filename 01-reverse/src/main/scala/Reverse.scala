object Reverse {

    def toList(list: List[Any]): List[Any] = {

        def reverseListIter(list: List[Any], currentList: List[Any]): List[Any] = {
            if (list.isEmpty) currentList else reverseListIter(list.tail, list.head +: currentList)
        } 
    
        reverseListIter(list, List())
    }

}
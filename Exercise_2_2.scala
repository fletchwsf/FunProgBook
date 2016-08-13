/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/

// Implement isSorted, which checks whether an Array[A] is sorted according
//    to a given comparision function
// def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean
//

object myModule {

  def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean): Boolean = {

    // design strategy - Array A is sort if for each element from 0 to
    //                   arrary.length element n is greater than n-1.
    //                   An empty arrary is sorted
    //                   An array of length 1 is sorter

    if (as == null) true
    else if (as.length == 1) true
    else false

  }

  def main(args: Array[String]): Unit = {
    isSorted( Array(1,2,3), true)

  }

}

/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/

// Implement isSorted, which checks whether an Array[A] is sorted according
//    to a given comparision function
// def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean

object Exercise_2_2 {

  def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    // design strategy - an array is sort if for each element from 0 to
    //                   arrary.length element n is greater than n-1.
    //                   An empty arrary is sorted
    //                   An array of length 1 is sorted

    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if (as.length == 0 ) true
      else if (as.length == 1 ) true
      else if ( n >= as.length - 1 ) true
      else if ( ordered( as(n), as(n+1) )) loop(n+1)  // continue loop as long as ordered is true
      else false
    }
    loop(0)
  }

  def main(args: Array[String]): Unit = {
    println("true = " + isSorted( Array(), (key:Int, value:Int) => key == true))  // true
    println("true = " + isSorted( Array(1), (key:Int, value:Int) => key == true ))  // true
    println("true = " + isSorted( Array(1,2,3,5,10), (key:Int, value:Int) => key < value ))  // true
    println("false = " + isSorted( Array(1,2,3,4,5), (key:Int, value:Int) => key > value ))  // false
    println("true = " + isSorted( Array(1,2,3,4,5), (key:Int, value:Int) => key < value ))   // true
    println("false = " + isSorted( Array(1,2,-3,4,5), (key:Int, value:Int) => key < value ))   // false

  }

}

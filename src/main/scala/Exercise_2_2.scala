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
    // design strategy - an array is sorted if for each element from 0 to
    //                   arrary.length element n is greater (ascending sort)
    //                   than n-1 (descending sort is lessor).
    //                   An empty array is sorted
    //                   An array of length 1 is sorted

  @annotation.tailrec
  def loop(n: Int): Boolean ={
    if ( n >= as.length - 1) true                  // all comparisions passed
    else if (!ordered(as(n), as(n+1))) false      // n compared with n+1
    else loop(n+1)
  }

  if(as.length <= 1) true   // An empty array or array of 1 is sorted
  else loop(0)
  }

  def main(args: Array[String]): Unit = {

    var anArray = Array(1,2,3,4,5)     // ordered function is less than or equal
    println("Array: " + anArray.mkString(",") + " is sorted ascending is: "
              + isSorted(anArray , (n:Int, nPlus1:Int) => n <= nPlus1 ))

    anArray = Array(1,2,-3,4,5)        // ordered function is less than or equal
    println("Array: " + anArray.mkString(",") + " is sorted ascending is: "
              + isSorted(anArray , (n:Int, nPlus1:Int) => n <= nPlus1 ))

    anArray = Array(5,4,3,2,1,0)    // ordered function is greater than or equal
    println("Array: " + anArray.mkString(",") + " is sorted descending is: "
            + isSorted(anArray , (n:Int, nPlus1:Int) => n >= nPlus1 ))

    anArray = Array(-5,4,3,2,1,0)   // ordered function is greater than or equal
    println("Array: " + anArray.mkString(",") + " is sorted descending is: "
            + isSorted(anArray , (n:Int, nPlus1:Int) => n >= nPlus1 ))

    anArray = Array()               // ordered function is greater than or equal
    println("Array: " + anArray.mkString(",") + " is sorted descending is: "
            + isSorted(anArray , (n:Int, nPlus1:Int) => n >= nPlus1 ))

    anArray = Array(12)                // ordered function is less than or equal
    println("Array: " + anArray.mkString(",") + " is sorted ascending is: "
            + isSorted(anArray , (n:Int, nPlus1:Int) => n <= nPlus1 ))

  }

}

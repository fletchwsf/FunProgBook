/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/


object Listing_2_3 {

// findFirst - return the first index of an array where
//             the key occurs. Return -1 if the key is not found
def findFirst(ss: Array[String], key: String): Int  = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n + 1)
loop(0)
}



  def main(args: Array[String]): Unit = {
    println(findFirst(Array("one", "two", "three", "four"), "three": String))
  }

}

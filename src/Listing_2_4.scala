/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/


// This listing demonstrates the useage of polymorphic functions. The first
//    version of findFirst only takes an arrary of strings while in the
//    second version findFirst will accept any data type [A] and a HOF
//    of type [A] that defines the search parameter and a logial test
//    for that search parameter.

object myModule {

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

// findFirst - a polymorphic version of findFirst that works with any data
//             data type. Returns the index number if successful or -1 if not
def findFirst[A](as: Array[A], p:A => Boolean) : Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if( n >= as.length ) -1
    else if( p(as(n))) n
    else loop(n+1)
  loop(0)
}


def main(args: Array[String]): Unit = {
  // example call using the mono-morphic findFirst
  println(findFirst(Array("one", "two", "three", "four"), "three": String))

  // Examples for the polymorphic call, note the convention for the HOF call
  println(findFirst(Array("one", "two", "three", "four"), (x:String) => x == "three" ))
  println(findFirst(Array(0,10,20,30,40), (x:Int) => x == 40 ))

 }

}

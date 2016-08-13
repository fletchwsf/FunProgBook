object myModule {

// findFirst - return the first index of an array where
//             the key occurs. Return -1 if the key is not found
def findFirstOld(ss: Array[String], key: String): Int  = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n + 1)
loop(0)
}


def findFirst[A](as: Array[A], p:A => Boolean) : Int = {
  @annotation.tailrec
  def loop(n: Int): Int =
    if( n >= as.length ) -1
    else if( p(as(n))) n
    else loop(n+1)
  loop(0)
}


  def main(args: Array[String]): Unit = {
    println(findFirstOld(Array("one", "two", "three", "four"), "three": String))

    println(findFirst(Array("one", "two", "three", "four"), (x:String) => x == "three" ))

    println(findFirst(Array(0,10,20,30,40), (x:Int) => x == 40 ))

 }

}

/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/

object MyModule {
  def abs (n: Int): Int =
    if ( n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "The |%d| = %d"
    msg.format(x,abs(x))
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n,1)
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-43))
    println("factorial(10):" + factorial(10))
}

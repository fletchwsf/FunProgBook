/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/

// Listing 2.2 shows how a Higher-Order-Function can be used to
//    combine seperate modules into a single function.

object Listing_2_2 {
  def abs (n: Int): Int =
    if ( n < 0) -n
    else n

  // note the code similarities between the two format functions
  private def formatAbs(x: Int) = {
    val msg = "Absolute value: |%d| = %d"
    msg.format(x,abs(x))
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec               // set compiler to enforce tail recursion
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n,1)
  }

  // note the code similarities between the two format functions
  private def formatFactorial(n: Int) = {
    val msg = "Factorial: %d! = %d"
    msg.format(n, factorial(n))
  }

  // formatResult - the two format functions share a common structure
  //    so a Higher-Order-Function (HOF) can provide the common functional
  //    elements. The function f when called provides the name of an existing
  //    function, in this case "abs" or "factorial". The term "f(n)" is then
  //    expanded, for "abs" the call becomes abs(n).
  //
  //    Usage Example: formatResult("absolute value", -42, abs)

  def formatResult(name:String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit =
    formatResult("absolute value", -42, abs)
    formatResult("factorial", 7, factorial)
}

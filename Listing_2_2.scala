// A comment
/* Another comment */
/** A documentation comment */
object MyModule {
  def abs (n: Int): Int =
    if ( n < 0) -n
    else n

  private def formatAbs(x: Int) = {
    val msg = "Absolute value: |%d| = %d"
    msg.format(x,abs(x))
  }

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)
    go(n,1)
  }

  def formatResult(name:String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))
  }


  private def formatFactorial(n: Int) = {
    val msg = "Factorial: %d! = %d"
    msg.format(n, factorial(n))
  }

  def main(args: Array[String]): Unit =
    formatResult("absolute value", -42, abs)
    formatResult("factorial", 7, factorial)
}

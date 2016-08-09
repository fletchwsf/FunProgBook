
object FibNumber{

def fib(n: Int): Double ={
  //@annotation.tailrec
  def go(n: Int, acc: Double): Double = {
    if(n <= 0) acc
    else if (n == 1) 1
    else go(n-1, acc) + go(n-2, acc)
  }
  go(n,0)
}


def main(args: Array[String]): Unit =
  println("Fibonnaci of 0 is:" + fib(0))
  println("Fibonnaci of 1 is:" + fib(1))
  println("Fibonnaci of 2 is:" + fib(2))
  println("Fibonnaci of 3 is:" + fib(3))
  println("Fibonnaci of 4 is:" + fib(4))
  println("Fibonnaci of 5 is:" + fib(5))
  println("Fibonnaci of 10 is:" + fib(10))
}

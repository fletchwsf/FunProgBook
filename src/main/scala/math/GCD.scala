package math

/**
  * Created by Will on 9/3/2016.
  */

// Euclid's method for calculating the Greatest Common Division (GCD) of two
//    integers. This implementation uses successive subtractions
//
object GCD {

  def gcd(a: Int, b: Int): Int =
  if ( a > 0 && b > 0 ) gcdCalc(a,b)
  else {
    sys.error("gcd function requires positive integers")
    - 1
  }
  @annotation.tailrec
    def gcdCalc(a: Int, b:Int): Int = {
      if (a > b && b > 0) gcdCalc(a - b, b)
      else if (b > a && a > 0) gcdCalc(a, b - a)
      else a
    }
  }



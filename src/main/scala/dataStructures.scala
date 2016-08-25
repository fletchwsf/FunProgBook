/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/



//------------------------------------------------------------------------------
// Singly linked list data structure
//------------------------------------------------------------------------------
package FunProgBook.dataStructures

// define the abstract interfaces first
sealed trait List[+A]                                           // a sealed trait must have all
                                                                //   implementations in the same file
case object Nil extends List[Nothing]                           // construct an empty List
case class Cons[+A](head: A, tail: List[A]) extends List[A]     // construct a List, note the recurisve
                                                                //    definition for the tail

// define functions for working with List objects
object List {

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x,xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x,xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
}

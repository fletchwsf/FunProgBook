package dataStructures

/**
  * Created by Will on 8/27/2016.
  */

/**---------------------------------------------------------------------------------------------------------------------
  Singly linked list

  Data structures
    List[+A] constructed with a head:[A] and a tail: List[A].  This is a recursive data structure
    where the list contains a head, and the tail if it exists is another entry of the original list type.


  Usage
    val newList = List[Int](1, 2, 3, 4)     // creates a new linked list of type integers
    List.sum(newList)                       // calculates the sum of  linked list of type integers

    In the REPL newList evaluates to the following:
    > Cons(1, Cons(2, Cons(3, Cons(4))))
----------------------------------------------------------------------------------------------------------------------*/
// define the constructors and abstract interfaces
sealed trait List[+A]                                         // sealed traits require all method functions
                                                              //    be defined in one file, +A indicates that
                                                              //    List will be covariant with the type provided

case object Nil extends List[Nothing]                         // create an empty list

case class Cons[+A](head: A, tail: List[A]) extends List[A]   // create a linked list, note the
                                                              //    recursive definition

// define functions for working with List objects
object List {

  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0                                               // zero is the identify function for addition
    case Cons(x,xs) => x + sum(xs)
  }

  def product(ds: List[Double]): Double = ds match {
    case Nil => 1.0                                             //  one is the identity function for multiplication
    case Cons(0.0, _) => 0.0
    case Cons(x,xs) => x * product(xs)
  }

  def apply[A](as: A*): List[A] =                               // Variadic function syntax accept zero or more of
    if (as.isEmpty) Nil                                         //    arguments of type A
    else Cons(as.head, apply(as.tail: _*))

  def tail[A](t: List[A]): List[A] = t match {
    case Nil => Nil
    case Cons( _ , listTail) => listTail
  }

  def head[A](h: List[A]): A = h match {
    case Nil => Nil
    case Cons(listHead, _ ) => listHead
  }


}
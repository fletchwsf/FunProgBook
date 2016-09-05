package dataStructures

/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
Original code sections - Copyright (c) 2012, Manning Publications, Co.
*/



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
    > Cons(1, Cons(2, Cons(3, Cons(4))))                // methods apply, head, and tail, use Cons in the pattern match
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
    case Nil => 0                                              // zero is the identify function for addition
    case Cons(x,xs) => x + sum(xs)                             // match a linked list and recursive call to sum
  }

  def product(ds: List[Int]): Double = ds match {
    case Nil =>  1.0                                          //  one is the identity function for multiplication
    case Cons(0.0, _) => 0.0                                  //  if an entry is zero the product is zero
    case Cons(x,xs) => x * product(xs)                        //  match a linked list and recursive call product
  }

  def apply[A](as: A*): List[A] =                              // Variadic function syntax accept zero or more of
    if (as.isEmpty) Nil                                        //    arguments of type A
    else Cons(as.head, apply(as.tail: _*))

  def tail[A](t: List[A]): List[A] = t match {
    case Nil => sys.error("tail of an empty list")
    case Cons( _ , tail) => tail                                // match a linked list, head is the wild card and
                                                                //  the tail of the list is returned
  }

  def head[A](h: List[A]): A = h match {
    case Nil => sys.error("head of empty list")
    case Cons(head, _ ) => head                                 //  pattern a linked list, tail is the wild card
                                                                //    and the head of the list is returned
  }

  // replace the first item of the list with a new item
  def setHead[A](newHead: A, existingList: List[A]): List[A] = newHead match {
    case Nil => sys.error("cannot insert an empty head")
    case _ => Cons(newHead, List.tail(existingList))           // match any item and construct a list with a new head
                                                               // and the tail of the original list
  }

  // drop the first n items of the list
  def drop[A](aList: List[A], n: Int): List[A] = n match {
    case 0 => aList                                                  // n items removed return the list
    case _ => drop(List.tail(aList), n-1)                            // recursive call with the tail of the list

  }

  // dropWhile - removes from the list elements that match a predicate
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Cons(h,t) if f(h) => dropWhile(t,f)                      // Match the head of the list, test function f if
                                                                  //   true, recursive call with the list tail
    case _ => l                                                   // Wildcard match, just pass the list unchanged
  }

  //-----------------------------------------------------------------
  // Add all the items one list to the end of the first list
  def append[A](a1: List[A], a2: List[A]): List[A] =
    a1 match {
      case Nil => a2
      case Cons(h,t) => Cons(h, append(t, a2))
    }

  //------------------------------------------------------------------------
  // init - returns a list of all items in the list except for the last item
  def init[A](l: List[A]): List[A] =
    l match {
      case Cons(h,t) if (t == Nil) => Nil
      case Cons(h,t) => Cons(h, init(t))
    }


  //---------------------------------------------------------------------------
  // foldRight - apply the function f over all members of a list
  def foldRight[A,B](as: List[A], z: B)(f: (A, B) => B) : B =
    as match{
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }


  def sum2(ns: List[Int]) =
   foldRight(ns, 0)((x,y) => x + y )

  def product2(ns: List[Int]) =
    foldRight(ns, 1)((x,y) => x * y )

  def length[A](as: List[A]): Int =
    foldRight(as, 0)((x,y) => y +1 )

}
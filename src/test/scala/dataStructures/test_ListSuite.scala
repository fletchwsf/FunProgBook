package dataStructures

/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
*/

import org.scalatest._

class test_ListSuite extends FunSuite {

  test("List test summing a list in Ints ") {
    val list01 = List[Int](1, 2, 3, 4)
    println(list01)
    assert(List.sum(list01) === 10, "sum is incorrect for list:" + list01)
  }

  test("List test product of the list entries"){
    val list02 = List[Double](1,2,3,4)
    assert( List.product(list02) === 24, "product is incorrect for list:" + list02)
  }

  test("Create an empty list"){
    val emptyList = List[Int]()
    assert(emptyList === Nil, "a empty list has nothing")
    assert(List.sum(emptyList) === 0, "zero is the identity for addition")
  }

  test("get the tail  and head of the list"){
    val list01 = List[Int](1,2,3)
    assert(List.tail(list01) === List[Int](2,3), "tails don't match")

    assert(List.head(list01) === 1, "head is the wrong entry")
  }



}

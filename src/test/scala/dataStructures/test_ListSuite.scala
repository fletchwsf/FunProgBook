package dataStructures

/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
*/

import org.scalatest._

class test_ListSuite extends FunSuite {

  trait TestLists {
    val emptyList = List[Int]()
    val list01 = List[Int](1, 2, 3, 4)
    val list02 = List[Int](1, 2, 3, 4)
    val list03 = List[Int](2, 3, 4)
    val list10 = List[Int](1,2,3,4,5,6,7,8,9,10)
  }

  test("Sum a list of Ints ") {
    new TestLists {
      assert(List.sum(list01) === 10, "sum is incorrect for list:" + list01)
    }
  }

  test("List test product of the list entries") {
    new TestLists {
      assert(List.product(list02) === 24, "product is incorrect for list:" + list02)
    }
  }

  test("Create an empty list") {
    new TestLists {
      assert(emptyList === Nil, "a empty list has nothing")
      assert(List.sum(emptyList) === 0, "zero is the identity for addition")
      assert(List.product(emptyList) === 1.0, "one is the identity for multiplication")
    }
  }

  test("get the tail and head of the list") {
    new TestLists {
      assert(List.tail(list01) === List[Int](2, 3, 4), "tails don't match")
      assert(List.head(list01) === 1, "head is the wrong entry")
    }
  }

  test("insert a new head into another list") {
    new TestLists {
      assert(List.setHead(1, list03) === List[Int](1, 3, 4), "failed to insert 1 into" + list01)
    }
  }

  test("drop the first n items") {
    new TestLists {
      assert(List.drop(list10, 5) === List[Int](6, 7, 8, 9, 10))
    }
  }

}



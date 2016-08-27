package dataStructures

/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
*/

import org.scalatest._

class test_ListSpec extends FunSuite {

  test("List data structure tests"){
    val list01 =  List[Int](1,2,3,4)
    assert( List.sum(list01) === 10, "sum is incorrect for list:" +  list01)
    val list02 = List[Double](1,2,3,4)
    assert( List.product(list02) === 24, "product is incorrect for list:" + list02)
  }

}

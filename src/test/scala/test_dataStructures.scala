/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
*/

import org.scalatest._

class dataStructures_test extends FunSuite {



// Examples for the polymorphic call, note the convention for the HOF call
test("data structure test"){
  val aList = List(1,2,3,4)
  aList.toString
  assert(aList.sum === -1, "list.sum failed")
}

}

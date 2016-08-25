/* Comments, test cases, and other code changes are
The MIT License (MIT)
Copyright (c) 2016 wsf.fletcher
*/


import org.scalatest._

class Listing_2_4_test extends FunSuite {



// Examples for the polymorphic call, note the convention for the HOF call
test("Test-01 Array(0,1,2,3) has 0 at n=0"){
  assert(Listing_2_4.findFirst(Array(0,1,2,3), (x:Int) => x == 0 ) === 0)
}

test("Test-02 Array(one,two,three,four) contain three at n=2") {
  assert(Listing_2_4.findFirst(Array("one", "two", "three", "four"), (x:String) => x == "three" ) === 2)
}

test("Test-03: Check findFirst returns correct element in the nth position"){
  assert(Listing_2_4.findFirst(Array(0,10,20,30,40), (x:Int) => x == 40 ) === 4)
}

test("Test-04: findfirst doesn't find 0 in (1,2,3,4)") {
  val inArrayOne = Array (1,2,3,4)
  val lookFor = 0
  assert(Listing_2_4.findFirst(inArrayOne, (x:Int) => x == lookFor ) === -1,
          "Array " + inArrayOne.mkString + " has no entry equal to " + lookFor )

}


}

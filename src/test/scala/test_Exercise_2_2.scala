import org.scalatest.FlatSpec

class Exercise_2_2_Spec extends FlatSpec{

"A result" should "have a value of true" in {
  val result = true
  assert(result === true)
}

 "A sorted increasing array" should "have a true value in isSorted" in {
   var anArray = Array(1,2,3,4,5)     // ordered function is less than or equal
   assert ( Exercise_2_2.isSorted(anArray , (n:Int, nPlus1:Int) => n <= nPlus1 ) === true)
 }

"A unsorted increasing array" should "have a false value in isSorted" in {
   var anArray = Array(1,2,-3,4,5)        // ordered function is less than or equal
   assert( Exercise_2_2.isSorted(anArray , (n:Int, nPlus1:Int) => n <= nPlus1 ) === false)
 }

}

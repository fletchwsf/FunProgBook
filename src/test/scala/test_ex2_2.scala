//import org.scalatest.Suite
//import org.junit.runner.RunWith
//import org.scalatest.junit.JUnitRunner
//import src.Exercise_2_2._
import org.scalatest.FlatSpec

//@RunWith(classOf[JUnitRunner])

//class Excercise_2_2 extends FlatSpec with Matchers {

class FirstSpec extends FlatSpec{


"A result" should "have a value of true" in {
  val result = true
  assert(result === true)
}
 //val result = isSorted( Array(), (key:Int, value:Int) => key == true) === true)
 //a [result] should be returned

 }
//class ExSuite extends Suite {

//  def testOne() {
//    println("Test says hello world")
//    assert( isSorted( Array(), (key:Int, value:Int) => key == true) === true)

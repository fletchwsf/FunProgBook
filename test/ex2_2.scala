import org.scalatest.Suite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import src.Exercise_2_2._

@RunWith(classOf[JUnitRunner])

class TestSetSuite extends scalatest{

//class ExSuite extends Suite {

  def testOne() {
    println("Test says hello world")
    assert( isSorted( Array(), (key:Int, value:Int) => key == true) === true)
  }

}

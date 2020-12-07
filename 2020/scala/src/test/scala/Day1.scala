import org.scalatest.funsuite.AnyFunSuite

class Day1Test extends AnyFunSuite {
  test("First") {
    assert(646779 == Day1.first())
  }

  test("Second") {
    assert(246191688 == Day1.second())
  }
}

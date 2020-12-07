import scala.io.Source

object Day1 {
  lazy val lines =
    Source.fromResource("day1.txt").getLines().map(_.toInt).toVector

  def first(): Int = process(lines, 2)

  def second(): Int = process(lines, 3)

  private[this] def process(lines: Vector[Int], combinations: Int): Int =
    lines.combinations(combinations).find(_.sum == 2020).get.product
}

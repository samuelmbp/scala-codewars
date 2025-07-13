/*
Description:
To complete this Kata you need to make a function
multiplyAll/multiply_all which takes an array of integers
as an argument. This function must return another function,
which takes a single integer as an argument and returns
a new array.

The returned array should consist of each of the elements
from the first array multiplied by the integer.

Example:

multiplyAll(Seq(1, 2, 3))(2); // => Seq(2, 4, 6)
You must not mutate the original array.
 */

object MultiplyAll extends App {

  def multiplyAll(numbers: Seq[Int]): Int => Seq[Int] = {
    (num: Int) => (numbers.map(y => y  * num))
  }

  val numbers = Seq(1,2,3)
  println(multiplyAll(numbers)(2))
}

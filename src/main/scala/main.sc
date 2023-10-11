import scala.util.Random

val numbers = (1 to 10).map(_ => Random.nextInt)
println(numbers)

val count = countDef(numbers)
print(s"Кол-во нечетных элементов: $count")

def countDef(nums:  IndexedSeq[Int]): Int = {
	nums.filter(_ % 2 != 0).length
}

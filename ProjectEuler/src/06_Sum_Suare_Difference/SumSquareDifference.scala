/*
Objective: 
Find the difference of:
    a. The sum the squares
    b. The square of the sum
for the first 100 natural numbers
*/

object SumSquareDifference {
    def main (args: Array[String]) {
        val max_value = args(0).toInt
        var square_sum: Long = 0L
        var base_sum: Long = 0L
        var result: Long = 0L
        println("Finding sum square difference for first " + max_value + " natural numbers...")
        for (i <- 1 to max_value) {
            square_sum += (i*i)
            base_sum += i
        }
        println("Sum Squared: " + base_sum * base_sum)
        println("Square_sum: " + square_sum)
        result = (base_sum * base_sum) - square_sum
        println("Result: " + result)
    }
}

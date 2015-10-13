/*
Objective:
Find the sum of the even numbers in the fibonacci sequence under 4 million.
*/

object EvenFibonacci {
    def main(args: Array[String]) {
        val max_val = 4000000
        var prev_val = 1
        var curr_val = 1
        var tmp_curr_val = 1
        var sum = 0
        var val_flag = true
        println("Summing even fibonacci numbers up to " + max_val)
        while (val_flag) {
            tmp_curr_val = curr_val + prev_val
            prev_val = curr_val
            curr_val = tmp_curr_val
            if (curr_val > max_val) {
                val_flag = false
            }
            else if (curr_val % 2 == 0) {
                sum = sum + curr_val
                //println("Curr_val is even:" + curr_val)
            }
        }
        println("Sum: " + sum)
    }
}

/*
Objective:
Find the smallest number that is divisible evenly by numbers from 1 to 20
*/

object SmallestMultiple {
    def main (args: Array[String]) {
        // usage: scala SmallestMultiple min_value max_value
        val min_value = args(0).toInt
        val max_value = args(1).toInt
        val max_bound = 10000000000L // Set a max in case no multiple is found
        var multiple_found = false
        var bound_crossed = false
        var current_value = max_value
        while (multiple_found == false) {
            multiple_found = true
            for (n <- min_value to max_value) {
                if (current_value%n != 0) {
                    multiple_found = false
                }
            }
            current_value += 1
            if (current_value > max_bound) {
                multiple_found = true
                bound_crossed = true
            }
        }
        if (bound_crossed == true) {
            println("Error: No multiple found from 1 to " + max_bound + "... Quitting")
        }
        else {
            println("Multiple found: " + (current_value -1))
        }
    }
}

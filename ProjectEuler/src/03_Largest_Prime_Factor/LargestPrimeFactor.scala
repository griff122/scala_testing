/*
Objective:
Find the largest prime factor for the number: 600851475143
*/

object LargestPrimeFactor {
    def isPrime(n: Long): Boolean = {
        // Function to return if the number is prime or not
        if (n%2 == 0) {
            return false
        }
        else {
            var i = 3L
            while (i < (n-1L)) { 
                if ((n/(i/1.0))%1.0 == 0) {
                    return false
                }
                i += 2L
            }
            return true
        }
    }
    def isFactorOf(n: Long, main_val: Long): Boolean = {
        // Function to return a boolean if the number is a factor of the main value
        return (main_val%n == 0)
    }
    def main(args: Array[String]) {
        // Main function
        val main_value: Long = 600851475143L
        //val main_value: Long = 537601L 
        var max_prime_factor: Long = 0L
        var i: Long = 1L
        while (i < (main_value - 1L)) {
            if (i%1000000001L == 0) {
                println("Working on i: " + i + " Current max: " + max_prime_factor)
            }
            if (isFactorOf(i,main_value) == true) {
                if (isPrime(i) == true) {
                    max_prime_factor = i
                }
            }
            i += 2L
        }
        println("Max Prime Factor is: " + max_prime_factor)
    }
}

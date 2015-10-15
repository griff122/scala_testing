/*
Objective:
Get the 10001st prime number
*/

object GetNthPrime {
    def isPrime(n: Long): Boolean = {
        if (n%2 == 0) {
            return false
        }
        else {
            var i = 3L
            while (i < (n-1L)) {
                if ((n/(i/1.0))%1.0 == 0) {
                    return false
                }
                i += 2
            }
            return true
        }
    }

    def main (args: Array[String]) {
        val target_prime = args(0).toInt
        var target_found = false
        var i = 1
        var prime_counter = 0
        while (target_found == false) {
            if (isPrime(i)) {
                prime_counter += 1
            }
            if (prime_counter == target_prime) {
                target_found = true
            }
            i += 1
        }
        println("The " + target_prime + " prime number is: " + (i - 1))
    }
}

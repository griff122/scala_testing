object Multiples {
    def isMultiple(a: Int): Boolean = {
        if ((a%3 == 0) | (a%5 == 0)) {
            return true
        }
        return false
    }
    def main(args: Array[String]) {
        var max_number = 1000
        var i = 0
        var sum = 0
        println("Finding sum of multiples of 3 and 5 for all numbers below: " + max_number)
        for( i <- 1 to (max_number-1)) {
            if (isMultiple(i)) {
                //println("Multiple of 3 or 5: " + i)
                sum = sum + i
            }
        }
        println("Total Sum: " + sum)
    }
}

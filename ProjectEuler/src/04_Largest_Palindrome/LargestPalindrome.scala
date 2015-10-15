/*
Objective:
Find the largest palindrome number from the product of two 3 digit numbers
*/

object LargestPalindrome {
    def getMaxPalindrome(max_number: Int,min_number: Int): Int = {
        var result = 0
        var result_string = ""
        var product = 0
        var i = 0
        var j = 0
        for ( i <- max_number to (min_number - 1) by -1) {
            for ( j <- max_number to (min_number - 1) by -1) {
                product = i*j 
                result_string = product.toString
                if (result_string.slice(0,result_string.size/2) == result_string.slice(result_string.size/2,result_string.size).reverse) {
                    //println("Found a palindrome: " + result_string + " at i = " + i + " and j = " + j)
                    if (product > result) {
                        result = product
                    }
                }
            }
        }
        return result
    }
    def main (args: Array[String]) {
        // usage: scala LargestPalindrome <min_value> <max_value>
        val min_value = args(0).toInt
        val max_value = args(1).toInt
        println("Finding max palindrome of the product of two numbers in range of " + min_value + " and " + max_value + ".")
        var result_palindrome = getMaxPalindrome(max_value,min_value)
        println(" Result: " + result_palindrome)
    }
}

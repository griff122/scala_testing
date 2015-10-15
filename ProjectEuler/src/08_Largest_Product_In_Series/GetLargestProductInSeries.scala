/*
Objective:
Get Largest Product of thirteen adjacent digits in a 1000-digit number
*/

import scala.io.Source

object GetLargestProductInSeries {
    def loadInputDataAsString(input_file: String): String = {
        var main_string = ""
        for(line <- Source.fromFile(input_file).getLines()) {
            main_string = main_string.concat(line)
        }
        return main_string
    }    
    def main (args: Array[String]) {
        val offset = args(0).toInt
        var max_product = 0L
        var tmp_product = 0L
        var input_string = loadInputDataAsString("input_digit.txt")
        var current_max_string = ""
        println(input_string)
        for(i <- 0 to input_string.size - offset) {
            tmp_product = input_string.slice(i,i+offset).split("").tail.map(_.toLong).product
            if (tmp_product > max_product) {
                max_product = tmp_product
                current_max_string = input_string.slice(i,i+offset)
            }
        }
        println("Max Product found was: " + max_product)
    }
}

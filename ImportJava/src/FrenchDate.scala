import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
    def main(args: Array[String]) {
        val now = new Date
        val df = getDateInstance(LONG, Locale.FRANCE)
        // Note: Expressions requiring only one argument can be used with an infix syntax:
        //      That is, df format now, is equivalent to df.format(now)
        println("Infix notation:" + (df format now))
        println("Regular notation:" + df.format(now))
    }
}

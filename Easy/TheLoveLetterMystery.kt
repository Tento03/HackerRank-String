import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'theLoveLetterMystery' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun theLoveLetterMystery(s: String): Int {
    // Write your code here
    var total=0
    var n=s.length
  
    for(i in 0 until n/2){
        val left=s[i]
        val right=s[n-i-1]
        
        total+=kotlin.math.abs(left-right)
    }
    return total
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s = readLine()!!

        val result = theLoveLetterMystery(s)

        println(result)
    }
}

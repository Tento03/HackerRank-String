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
 * Complete the 'funnyString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun funnyString(s: String): String {
    // Write your code here
    var n=s.length
    var sReversed=s.reversed()
    
    for(i in 1 until n){
        val sDiff=kotlin.math.abs(s[i].code - s[i-1].code)
        var sRevDiff=kotlin.math.abs(sReversed[i].code - sReversed[i-1].code)
        
        if(sDiff != sRevDiff){
            return "Not Funny"
        }    
    }
    return "Funny"
}

fun main(args: Array<String>) {
    val q = readLine()!!.trim().toInt()

    for (qItr in 1..q) {
        val s = readLine()!!

        val result = funnyString(s)

        println(result)
    }
}

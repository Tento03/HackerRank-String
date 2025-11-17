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
 * Complete the 'beautifulBinaryString' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING b as parameter.
 */

fun beautifulBinaryString(b: String): Int {
    // Write your code here
    var target="010"
    var total=0
    var i=0
    
    while(i<=b.length -3){
        if(b.substring(i,i+3)==target){
            total++
            i+=3
        }
        else{
            i++
        }
    }
    return total
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val b = readLine()!!

    val result = beautifulBinaryString(b)

    println(result)
}

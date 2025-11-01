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
 * Complete the 'marsExploration' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun marsExploration(s: String): Int {
    // Write your code here
    var message="SOS"
    var change=0
    
    for (i in s.indices){
        if(s[i]!=message[i%3]){
            change++
        }
    }
    return change
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = marsExploration(s)

    println(result)
}

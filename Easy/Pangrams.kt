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
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun pangrams(s: String): String {
    // Write your code here
    var totalAlphabet=26
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var strLower=s.lowercase()
    var strSet=strLower.toSet()
    var total=0
    
    for(c in alphabet){
        if(strSet.contains(c)){
            total++
        }
    }
    
    return if(total==totalAlphabet){
        "pangram"
    }
    else{
        "not pangram"
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = pangrams(s)

    println(result)
}

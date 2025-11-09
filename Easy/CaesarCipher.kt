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
 * Complete the 'caesarCipher' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. INTEGER k
 */

fun caesarCipher(s: String, k: Int): String {
    // Write your code here
    var shift=k%26
    val result=StringBuilder()
    
    for(c in s){
        if(c in 'a'..'z'){
            val newChar='a' + (c - 'a' + shift)%26
            result.append(newChar)
        }
        else if(c in 'A' .. 'Z'){
            val newChar='A' + (c - 'A' + shift)%26
            result.append(newChar)
        }
        else{
            result.append(c)
        }
    }
    return result.toString()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = caesarCipher(s, k)

    println(result)
}

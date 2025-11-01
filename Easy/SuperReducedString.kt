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
 * Complete the 'superReducedString' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun superReducedString(s: String): String {
    // Write your code here
    var stack=mutableListOf<Char>()
    
    for (c in s){
        if(stack.isNotEmpty() && stack.last()==c){
            stack.removeAt(stack.size-1)
        }
        else{
            stack.add(c)
        }
    }
    return if(stack.isEmpty()) "Empty String" else stack.joinToString("") 
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = superReducedString(s)

    println(result)
}

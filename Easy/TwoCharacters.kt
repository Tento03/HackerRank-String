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
 * Complete the 'alternate' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

fun alternate(s: String): Int {
    // Write your code here
    var uniqueCharacter=s.toSet().toList()
    var maxLength=0
    
    for (i in 0 until uniqueCharacter.size){
        for (j in i+1 until uniqueCharacter.size){
            var c1=uniqueCharacter[i]
            var c2=uniqueCharacter[j]
            
            var filtered=s.filter { it ==c1 || it==c2 }
            
            if (isAlternating(filtered)){
                if (filtered.length > maxLength){
                    maxLength=filtered.length
                }
            }
        }
    }
    return maxLength
}

fun isAlternating(str:String):Boolean{
    if(str.length<2){
        return false 
    }
    
    for (i in 0 until str.length-1){
        if(str[i]==str[i+1]){
            return false 
        }
    }
    return true
}
fun main(args: Array<String>) {
    val l = readLine()!!.trim().toInt()

    val s = readLine()!!

    val result = alternate(s)

    println(result)
}

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
 * Complete the 'minimumNumber' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. STRING password
 */

fun minimumNumber(n: Int, password: String): Int {
    // Return the minimum number of characters to make the password strong
    var numbers = "0123456789"
    var lower_case = "abcdefghijklmnopqrstuvwxyz"
    var upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    var special_characters = "!@#$%^&*()-+"
    
    var hasNumbers=false
    var hasLower=false
    var hasUpper=false 
    var hasSpecial=false 
    
    for (c in password){
        if (numbers.contains(c)){
            hasNumbers=true
        }
        else if(lower_case.contains(c)){
            hasLower=true
        }
        else if(upper_case.contains(c)){
            hasUpper=true
        }
        else if(special_characters.contains(c)){
            hasSpecial=true
        }
    }
    
    var missingTypes=0
    if(!hasNumbers){
        missingTypes++
    }
    if(!hasLower){
        missingTypes++
    }
    if(!hasUpper){
        missingTypes++
    }
    if(!hasSpecial){
        missingTypes++
    }
    
    var minLength=6
    return if(n+missingTypes < minLength){
        minLength-n
    }
    else{
        missingTypes
    }
    
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val password = readLine()!!

    val answer = minimumNumber(n, password)

    println(answer)
}

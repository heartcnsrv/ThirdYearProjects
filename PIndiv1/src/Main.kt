/*
Class Code:
Team
Name:
Online Translator: https://onecompiler.com/kotlin
*/

fun main() {
    // ask the user for input
    print("Enter an integer (+): ")
    val input = readLine()

    if (input == null || input == "") {
        println("No number was given.")
        return
    }

    val number = input.toInt()

    if (number <= 0) {
        println("Enter an integer that is greater than 0.")
        return
    }

    // reverse the number
    var originalNumber = number
    var reversedNumber = 0
    while (originalNumber > 0) {
        val digit = originalNumber % 10
        reversedNumber = reversedNumber * 10 + digit
        originalNumber = originalNumber / 10
    }

    // count even and odd
    var tempNumber = reversedNumber
    var evenCount = 0
    var oddCount = 0
    while (tempNumber > 0) {
        val digit = tempNumber % 10
        if (digit % 2 == 0) {
            evenCount = evenCount + 1
        } else {
            oddCount = oddCount + 1
        }
        tempNumber = tempNumber / 10
    }

    // if reversed number is even or odd
    var reversedType = ""
    if (reversedNumber % 2 == 0) {
        reversedType = "Even"
    } else {
        reversedType = "Odd"
    }

    // print
    println("Original number: " + number)
    println("Reversed number: " + reversedNumber)
    println("Even digits in reversed number: " + evenCount)
    println("Odd digits in reversed number: " + oddCount)
    println("Reversed number is " + reversedType)
}

// Kotlin supports all common arithmetic operators:
// + for addition
// - for subtraction
// * for multiplication
// / for division
// % for modulus

// You can use them for variables and values in your code:
fun main(args : Array<String>) {
    var num1 = 8
    var num2 = 34

    println(num1+num2)  // 42
    println(num2-num1)  // 26
    println(num1*num2)  // 272
    println(num2/num1)  // 4
    println(num2%num1)  // 2
} 

// The plus operator + can also be used to add together two strings, for example "Hey "+"there" results in "Hey there". This process is called concatenation.
// Aritmetik operatörler Kotlin, tüm yaygın aritmetik operatörleri destekler: + ekleme için - çıkarmak için * çarpma için / bölme için modül için % 
// Bunları kodunuzdaki değişkenler ve değerler için kullanabilirsiniz:
// Artı operatörü + iki dize eklemek için de kullanılabilir, örneğin, "Hey" + "orada" "Hey orada" olacaktır. Bu işleme birleştirme/birbirine bağlama adı verilir.

// Concatenation with operator "+" is bad practice in Kotlin. Batter use field.plus("some string") or "${value} ${value2}"

// Example:
fun main(args: Array<String>) {
    var num1 = 32
    var num2 = 8
    println(num1+num2)  //addition          // 40
    println(num1-num2)  //substraction      // 24
    println(num1*num2)  //multiplication    // 256
    println(num1/num2)  //division          // 4
    println(num1%num2)  //remainder         // 0
    
    var s1 = "hi "
    var s2 = "Kotlin"
    // println(num2+s1) //concat Int+String error
    println(s1+num2)    //concat String+Int       // hi 8
    println(s1+s2)      //concat String+String    // hi Kotlin
    
    var c1 = 'c'
    var c2 = 'm'
    // println(c1+c2)  //error
    println(c1+num2)                      // c8
    // println(num2+c1)  //error
    println(c1+s1)                        // chi
}                                         // Variable 'c2' is never used


// Example:
var num1 = 3
var num2 = 6
var x = num2 / num1
println(num2 / x) // output: 3


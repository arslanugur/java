// Kotlin supports a useful feature called type inference, which allows it to guess the type of the variable from the value it is assigned to.
// For example, when you assign the value "Kotlin" to a variable, Kotlin infers that the value is a String and automatically sets the type of the variable.

// This allows us to skip the type definition in variable declarations: 
fun main(args : Array<String>) {
    val name = "Kotlin"
    var num = 42
    println(name)
    println(num)
} 

// In the code above, name is a String and num is an Int.

// var is used to store a value. You can assign a value using this syntax: var name : type = value; The value can be changed later too.
// For make it unchangeable just assign it to a val. Kotlin recognize automatically the type of the value, so you can just use var/val name = value

// It takes the data type of the variable through the data type of the value inside the variable

// the type of the "test" variable --> string
val test = "88"

// String is quoted 
// Int is a whole number 
// Double/floating is decimals 
// Char is single letter or symbol where as String is a sequence of characters. 
// Char is primitive datatype where as String is a class. 
// A Char holds a single character, while a String holds lots of characters.



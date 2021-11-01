// Variables are used to store data.
// Each variable has a type that defines the type of the data that it holds.
// Variables are declared using the var keyword:
var num: Int = 42 

// We have declared a variable called num of type Int, and assigned the value 42 to it.
// Now we can use num in our code, for example output its value using println():
fun main(args: Array<String>) {
    var num: Int = 42
	println(num)
}

// You can reassign a variable in your code, for example: num = 8

// You can re-assign your variable without var or data type eg var num: Int = 42 num = 12 println (num) ***answer: 12***

// Example:
fun main(args: Array<String>) { 
    var num: Int = 42
  println (num) 
    num = num/6 
  println (num) 
    num = num + 3 
  println (num)
}   // Output: 42 7 10

// Variable are Mutable at any time

// Example:
fun main(args: Array<String>) { 
    var num: Int=14 
    num=14*2 
  println(num) 
} 


// to declare a variable called name and assign the value "James" to it.
var name: String = "Kotlin"
// var variable_name : Variable type = value:  to declare a variable(a name) which is a string and assign the value "Kotlin" to it.



// You can also declare variables using the val keyword: 
fun main(args : Array<String>) {
    val course: String = "Kotlin"
    println(course)
} 
// The difference with var is that variables declared using val cannot be changed.
// If a variable must be changeable, then declare it as a var. Otherwise, use val.
// val is used to declare constant variables, while var is used to declare variables that are not constant. 
// val = constant and immutable and unchangeable, var != not constant and mutable and changeable
// Variables declared using the val keyword are immutable. Variables declared using the var keyword are mutable

// to declare a variable named "color" and assign the value 42 to it. The variable should not be changeable.
val color: Int = 42

// Mostly, there is no need to tell the type of the variable using colon for local variables, 
// because kotlin does the type inference by itself, and it has a very strong type system.









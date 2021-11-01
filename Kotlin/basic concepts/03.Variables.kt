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

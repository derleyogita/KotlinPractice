/**  Higher order function - is a function that
 *  1. take function as a parameter
 *  2. return function as parameter
 */
fun add(a:Int,b:Int): Int{
    return a+b
}

fun higherOrder(scope: (Int, Int) ->Int){
    var result = scope(2,3)
    println(result)
}

/* lambda expression which takes two int as arguments and returns a single int as sum of both
 */
var sum = {a: Int , b: Int -> a + b }


fun higherOrderFun( summation: (Int, Int) -> Int) {      // accepting lambda as argument
    // call function received in arguments. Note that "summation" is name of argument.
    var result = summation(2,4)    // invokes the lambda expression from arguments
    println("The sum of two numbers is: $result")
}

fun main() {
    higherOrder(::add)
    higherOrderFun(sum)
}
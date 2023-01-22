
fun main(){

    /**
     * Ref. taken from https://kapilvij.medium.com/kotlin-interview-cheat-sheet-c62e7850ba73
     * An infix function is used to call the function without using any bracket or parenthesis.
     */
    infix fun Int.add(b:Int):Int = this+b
      val addition = 10 add 20
}
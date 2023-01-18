/**
 * Companion Object example
 * if you want to write a function or any member of the class
 * that can be called without having the instance of the class
 * then you can write the same as a member of a companion object inside the class.
 */

fun main() {
    User.callMe()
}

class User{
    //declare companion object
    companion object Test{
        fun callMe()=println("Hey, you are calling me?")
    }
}

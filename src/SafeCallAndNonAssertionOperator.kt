import java.time.Instant

fun main(){

    /** Safe call Operator (?.)
     * Is used to check if the value of the variable is null or not.
     * If it is null then null will be returned otherwise it will return the desired value.
     * Check below example
     */

     var name:String? = "Yogita"
     name = null
     println(name?.length)

    /*--------------------------------------------------------*/

    var timestamp: Instant? = null
    val isTimeStamp = timestamp?.toString()
    if (isTimeStamp == null) {
        println("Timestamp is null.")
    }

    /**
     * NonAssertion or null check operator (!!)
     * If you want to throw NullPointerException when the value of the variable is null,
     * then you can use the null check or !! operator.
     */
    var varMessage:String? =null;
    //varMessage!!.replace("Hi","Bye") // KotlinNullPointerException
    println(varMessage)

}
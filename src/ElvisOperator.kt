/**
 * Elvis operator (?:) is used to return the not null value even the conditional expression is null.
 * It is also used to check the null safety of values.
 */

class ElvisOperator (var name:String?, var age:Int?)

fun main(args: Array<String>) {

    /*val person : ElvisOperator? = ElvisOperator("Yogita", 26)
    var name = person?.name
    name = null
    var name1= name?.length ?: -1*/

    /*--------------------------------------------------*/

    var name:String?= "Yogita"   //or pass null
    var name1= name?.length ?: -1
    println(name1)


    /*--------------------------------------------------*/

    var elvis:String?=null
    if(elvis!=null)
        elvis.length
    else
        println("Null")

    /*--------------------------------------------------*/

    val person : ElvisOperator? = ElvisOperator("Yogita", 25)
    val age = person?.age ?: throw IllegalArgumentException("age is null")
    println(age)
}
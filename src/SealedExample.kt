/**
 * Sealed classes give us the flexibility of having different types of subclasses
 * and also containing the state
 */
sealed class Days {
    class Monday(string:String):Days()
    class Tuesday(int:Int):Days()
    class Wednesday(string:String,int:String):Days()

    open fun test(){
        println("Hello, I'm calling from sealed class")
    }
}

sealed class Employee(var name:String):Days()

{
    class Address:Employee("ABC")
    class Id:Employee("1111")

    override fun test() {
        super.test()
    }

}

fun display(value:Employee)
{
    when(value)
    {
        is Employee.Address-> println("${value.name}")
        is Employee.Id -> println("${value.name}")
    }
}

fun main(){
    val obc=Employee.Address()
    val obf=Employee.Id()
    display(obc)
    display(obf)
}

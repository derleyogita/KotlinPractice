/**
 * Sealed classes give us the flexibility of having different types of subclasses
 * and also containing the state
 */
sealed class Days {
    class Monday(string:String):Days()
    class Tuesday(int:Int):Days()
    class Wednesday(string:String,int:String):Days()
}

sealed class Employee(var name:String)
{
    class Address:Employee("ABC")
    class Id:Employee("1111")
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

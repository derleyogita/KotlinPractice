/**
 *  By using extension functions,
 *  you can add some methods or functionalities to an existing class even without inheriting the class.
 */

/**
 * Extension function - added method in string class without inheriting the class
 */
fun String.getAllWords():List<String>{
    return this.split("")
}

class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}

/**
 * Extension function-added method in student class without inheriting
 */
fun Student.isScholar(marks: Int): Boolean {
    return marks > 95
}
fun main() {
    val name ="My name is yogita"
    val countWords = name.getAllWords()
    println(countWords)

    /*-----------------------------------------*/
    var student = Student()
    println("Pass status: " + student.hasPassed(60))

    println("Scholarship Status: " + student.isScholar(60))
}
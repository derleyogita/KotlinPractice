/**
 * Enum class can be only a constant & it has no state .
 * That is, what if instead of just one hardcoded "Error",
 * there are different dynamic error messages(the states of the objects), it is not possible using Enum.
 */
enum class Result {
    SUCCESS,
    ERROR // Ex: ERROR(val exception:Exception)//Not possible in enum
}
fun main(){
    val success = Result.SUCCESS;
    println(success)

    val name = "Raja".let {
        "$it A"
        }
    print(name)
}


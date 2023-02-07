/**
 * Data class must have at least one primary constructor parameter.
 * we can't create an empty data class.
 * Calling this data classes from -> MainClass
 */
data class DataClassExample(var name:String="Test",var surName:String="Test1") {

    //Mostly asked Question: How to create empty constructor for data class in Kotlin Android
    //Answer: Option 1: Assign a default values to parameters
}

data class AnotherDataClass(var name:String,var surName: String){
    //Answer: Option 2: Create a secondary constructor
    constructor():this("Test","Test1")
}

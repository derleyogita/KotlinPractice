/**
 *  Mostly asked scenario based question
 *  Below Main class, I'm testing scenario when two interfaces have same method name with same parameter
 *  how it works
 */
class MainClass: InterfaceOne,InterfaceTwo {

    /**
     * Firstly, we will get compile time error when we override both methods
     * We have to remove any one method then it will work.
     */
    override fun add(a: Int, b: Int) {
        TODO("Not yet implemented")
    }

    val myDataClassExample = DataClassExample()
    val anotherDataClass = AnotherDataClass()
}
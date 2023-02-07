/**
 * Kotlin Scope functions
 * -----------------------------------------------------
 * Function  ||  Context object  || Return value
 * -----------------------------------------------------
 *   let     ||      it          ||   lambda result
 *   run     ||      this        ||   lambda result
 *   with    ||      this        ||   lambda result
 *   apply   ||      this        ||   context object
 *   also    ||      it          ||   context object
 * -------------------------------------------------------
 */
class ScopeFunctions {
    var name: String? = "Yogita"
    var surName: String? = "Derle"
}

fun main() {

    var scopeFunctions = ScopeFunctions()
   /*1. let scope function
   * Use 'let' to avoid null pointer exception'
   * Refer to context object by using 'it'
   * We use safe call ?. operator whenever we use let*/

    scopeFunctions.let {
        it.name
        it.surName
        println(it.name)
        println(it.surName)
    }

    /*val name: String?=null
    name?.let {
        println(it.reversed())
        println(it.length)
    }*/

    /*var a: Int? = null
    // using let function
    a?.let {
        // statement(s) will
        // not execute as a is null
        print(it)
    }*/


    /*2. run scope function
    * Using run you can leverage the power of both 'with' 'let' function*/

    scopeFunctions.run {
        this.name
        this.surName
        println(this.name)
        println(this.surName)
    }

    /*3. apply scope function
     * 1. Refer to context object by using 'this'
     * 2. The return value is the 'context object'*/

    scopeFunctions.apply {
        this.name
        this.surName
        println("apply scope " + this.name)
        println("apply scope " + this.surName)
    }

    /*4. also scope function
     * 1. Refer to context object by using 'it'
     * 2. The return value is the 'context object'*/

    scopeFunctions.also {
        it.name
        it.surName
        println(it.name)
    }

    /*val list = mutableListOf<Int>(1, 3, 5, 9, 45, 50)
    list.also {
        it.add(4)
        it.remove(2)
    }
    println(list)*/

    /*5. with scope function
     * 1. Refer to context object by using 'this'
     * 2. The return value is the 'lambda result'*/
    with(scopeFunctions) {
        this.name
        this.surName
        println("with scope " + this.name)
        println("with scope " + this.surName)
    }
}
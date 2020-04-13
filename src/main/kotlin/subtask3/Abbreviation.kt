package subtask3

import kotlin.reflect.KClass

class Abbreviation {



    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        //throw NotImplementedError("Not implemented")
        val aU=a.toUpperCase()

        val str=StringBuilder()
       /* if (a.contains(b))
        { return "YES"}
        else {
            return "NO"
        }*/

        for(char in aU){
            if(b.contains(char)){

                str.append(char)
            }
        }
        val str1=str.toString()
        if (str1.compareTo( b)==0){
            return "YES"
        }
        else{
            return "NO"
        }
    }

}


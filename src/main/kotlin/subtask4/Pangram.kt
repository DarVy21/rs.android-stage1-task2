package subtask4

class Pangram {

    var count=0
    // TODO: Complete the following function
    fun getResult(inputString: String): String {
       // throw NotImplementedError("Not implemented")
        val strToLow=inputString.toLowerCase()
        val vowels= arrayOf('A', 'E', 'I', 'O', 'U', "Y", 'a', 'e', 'i', 'o', 'u', 'y')
        var resultStr=StringBuilder()
        val res= ArrayList<String>()

        val str = inputString.split(" ").filter { it.isNotEmpty() && it[0] !='\n' }.sortedBy {
            if(isPangram(strToLow)) numberOfVowels(it, vowels)
            else consonants(it, vowels)
        }
        if (isPangram(strToLow)){
            str.forEach {
                val temp = StringBuilder()
                var counter = 0
                for (c in it) {
                    if (vowels.contains(c)) {
                        counter++
                        temp.append(c.toUpperCase())
                    } else temp.append(c)
                }
                temp.insert(0, counter.toString())
                res.add(temp.toString())
            }


        }
        else{
            str.forEach {
                val temp = StringBuilder()
                var counter = 0
                for (c in it) {
                    if (c.isLetter() && !vowels.contains(c)) {
                        counter++
                        temp.append(c.toUpperCase())
                    } else temp.append(c)
                }
                temp.insert(0, counter.toString())
                res.add(temp.toString())
            }
        }


        return res.joinToString(" ")

    }
    private fun isPangram(statement: String): Boolean {
        val letters = "abcdefghijklmnopqrstuvwxyz".split("")
        return statement.toLowerCase().split("").containsAll(letters)
    }
    private fun consonants(str: String, vowels: Array<*>): Int {
        var counter = 0
        for(letter in str){
            if(letter.isLetter() && !vowels.contains(letter)){
                counter++
            }
        }
        return counter
    }

    private fun numberOfVowels(str: String, vowels: Array<*>):Int{
        var counter = 0
        for(letter in str){
            if(vowels.contains(letter)){
                counter++
            }
        }
        return counter
    }
}

package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {

        val arr= mutableListOf<Int>(1,1)
        var sum=0

        while (arr[0]*arr[1] < n) {

             sum = arr[0] + arr[1]
            arr[0] = arr[1]
            arr[1] = sum

        }
        if (arr[0]*arr[1] ==n){
            arr.add(1)
            return arr.toIntArray()
        }
        else{
            arr.add(0)
            return arr.toIntArray()
        }

    }

}

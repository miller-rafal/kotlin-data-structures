fun main() {

    var stackCapacity = 5

    var stack = Stack<String>(stackCapacity)

    var stackElements: ArrayList<String> = arrayListOf("first", "second", "third", "fourth", "fifth")

    testStringStack(stack, stackElements)
}

fun testStringStack(stackUnderTest: Stack<String>, testStrings: ArrayList<String>){

    println("testing push() and peek()...")

    for(testString in testStrings){
        println("push('$testString')")
        stackUnderTest.push(testString)

        var peek = stackUnderTest.peek()
        println("peek()='$peek'")

        if(peek == testString){
            println("push('$testString') test successful! :D")
        }else{
            println("push('$testString') test failed! :/")
        }
    }

    println("isEmpty=${ stackUnderTest.isEmpty }")

    var count: Int = stackUnderTest.count
    println("count=$count")

    if(count == testStrings.size) {
        println("successfully pushed all test strings! :D")
    }

    println("testing attempt to invoke push() on a full stack...")

    var testResult = stackUnderTest.push("sixth")
    var countAfterTest = stackUnderTest.count

    var testSuccessful = (!testResult) && (countAfterTest == count)

    if(testSuccessful){
        println("test successful! :D")
    }else{
        println("test failed! :/")
    }

    println("testing peek() and pop()...")

    for(i in 1..testStrings.size){
        var peek = stackUnderTest.peek()
        println("peek()='$peek'")

        var pop = stackUnderTest.pop()
        println("pop()='$pop'")

        if(pop == peek){
            println("pop() test successful! :D")
        }else{
            println("pop() test failed! :/")
        }
    }

    println("isEmpty=${ stackUnderTest.isEmpty }")

    count = stackUnderTest.count
    println("count=$count")

    if(count == 0){
        println("successfully popped all test strings! :D")
    }

    println("testing attempt to invoke pop() on an empty stack..")

    testResult = stackUnderTest.pop() != null
    countAfterTest = stackUnderTest.count

    testSuccessful = (!testResult) && (countAfterTest == count)

    if(testSuccessful){
        println("test successful! :D")
    }else{
        println("test unsuccessful! :/")
    }
}
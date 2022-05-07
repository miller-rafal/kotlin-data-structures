fun main() {

    val stackCapacity = 5

    val stack = Stack<String>(stackCapacity)

    val stackElements: ArrayList<String> = arrayListOf("first", "second", "third", "fourth", "fifth")

    testStringStack(stack, stackElements)
}

fun testStringStack(stackUnderTest: Stack<String>, testStrings: ArrayList<String>){

    println("testing push() and peek()...")

    for(testString in testStrings){
        println("push('$testString')")
        stackUnderTest.push(testString)

        val peek = stackUnderTest.peek()
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

    println("testing contains()...")

    for(testString in testStrings){
        val containsTestString = stackUnderTest.contains(testString)
        println("contains('$testString')=$containsTestString")
    }

    val stringNotPresentInStack = "sixth"

    println("testing contains('$stringNotPresentInStack') (string not present in stack)")

    val containsStringNotPresent = stackUnderTest.contains(stringNotPresentInStack)

    println("contains('$stringNotPresentInStack')=$containsStringNotPresent")

    if(!containsStringNotPresent){
        println("test successful! :D")
    }else{
        println("test failed! :/")
    }

    println("testing peek() and pop()...")

    for(i in 1..testStrings.size){
        val peek = stackUnderTest.peek()
        println("peek()='$peek'")

        val pop = stackUnderTest.pop()
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

    println("testing clear()...")

    for(testString in testStrings){
        println("push('$testString')")
        stackUnderTest.push(testString)
    }

    count = stackUnderTest.count
    println("count=$count")

    println("clear()")
    stackUnderTest.clear()

    count = stackUnderTest.count

    val isEmpty = stackUnderTest.isEmpty

    println("count=$count")
    println("isEmpty=$isEmpty")

    if(count == 0 && isEmpty) {
        println("test successful! :D")
    }else{
        println("test failed! :/")
    }
}
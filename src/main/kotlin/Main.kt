fun main() {

    var myStack = Stack<String>(5)

    myStack.push("first")
    myStack.push("second")
    myStack.push("third")
    myStack.push("fourth")
    myStack.push("fifth")

    println("count=${myStack.count}")

    println("isEmpty=${ myStack.isEmpty() }")

    println("peek=${ myStack.peek() }")

    myStack.pop()
    println("peek=${ myStack.peek() }")

    myStack.pop()
    println("peek=${ myStack.peek() }")

    myStack.pop()
    println("peek=${ myStack.peek() }")

    myStack.pop()
    println("peek=${ myStack.peek() }")

    myStack.pop()
    println("peek=${ myStack.peek() }")

    println("count=${myStack.count}")

    println("isEmpty=${ myStack.isEmpty() }")
}
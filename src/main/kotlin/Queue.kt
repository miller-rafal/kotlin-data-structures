class Queue<T>(var capacity: Int) {

    val isEmpty: Boolean
        get() { return head == 0 && tail == 0 }

    private var elements: ArrayList<T> = arrayListOf<T>()

    private var tail: Int = 0
    private var head: Int = 0

    fun enqueue(element: T){
        TODO("not implemented yet")
    }

    fun dequeue(): T?{
        TODO("not implemented yet")
    }

    fun peek(): T?{
        TODO("not implemented yet")
    }

    fun contains(other: T): Boolean{
        TODO("not implemented yet")
    }

    fun clear(){
        TODO("not implemented yet")
    }

    private fun shiftElements(){
        TODO("not implemented yet")
    }
}
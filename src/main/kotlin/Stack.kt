class Stack<T>(var capacity: Int) {

    val count: Int
        get() = elements.count()

    val isEmpty: Boolean
        get() { return pointer == 0 }

    private var elements: ArrayList<T> = arrayListOf<T>()
    private var pointer: Int = 0

    fun push(element: T): Boolean{
        if(pointer < capacity){
            elements.add(pointer, element)
            pointer++
            return true
        }
        return false
    }

    fun pop(): T?{
        if(pointer > 0){
            pointer--
            return elements.removeAt(pointer)
        }
        return null
    }

    fun peek(): T?{
        if(pointer > 0){
            val elementIndex = pointer - 1
            return elements[elementIndex]
        }
        return null
    }

    fun contains(other: T?): Boolean{
        for(element in elements){
            if(element == other){
                return true
            }
        }
        return false
    }

    fun clear(){
        elements.clear()
        pointer = 0
    }
}
class Stack<T>(var capacity: Int) {

    val count: Int
        get() = elements.count()

    private var elements: ArrayList<T> = arrayListOf<T>()
    private var pointer: Int = 0

    fun push(element: T){
        if(pointer < capacity){
            elements.add(pointer, element)
            pointer++
        }
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
            return elements[pointer - 1]
        }
        return null
    }

    fun isEmpty(): Boolean{
        return elements.isEmpty()
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

    fun print(){
        for(element in elements){
            println(element)
        }
    }
}
package t01

class Caretaker {
    private val history: MutableList<Memento> = mutableListOf()
    private val orig: Originator = Originator()
    fun addMemento(text: String) {
        val m = Memento(text)
        orig.setMemento(m)
        history.add(m)
    }

    fun vanish() {
        history.clear()
    }

    fun undo() {
        if (history.size < 2) {
            println("No previous versions found")
        } else {
            val m = history.removeLast()
            orig.setMemento(m)
        }

    }

    fun getMemento(): Memento {
        if (history.size > 0) {
            return history.get(history.size - 1)
        }
        return throw Exception("no text in history")
    }
}
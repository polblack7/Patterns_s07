package t0

import t01.Caretaker
import t01.Originator

fun input() {
    val create: Originator = Originator()
    val edit: Caretaker = Caretaker()
    println("Доступные команды: \n +add \n +edit \n +watch \n +cancel \n +exit")

    while (true) {
        println("Enter input: ")
        val input = readlnOrNull()
        if (input == null) {
            println("Incorrect input")
        }
        else if (input == "add") {
            println("Введите текст: ")
            edit.vanish()
            edit.addMemento(readln())
        }
        else if (input == "edit") {
            println("Редактируйте текст: ")
            edit.addMemento(readln())
        }
        else if (input == "watch") {
            println(edit.getMemento().toString())
        }
        else if (input == "cancel") {
            edit.undo()
        }
        else if (input == "exit") {
            break
        }
        else {
            println("Incorrect input")
        }
    }
}

fun main(args: Array<String>) {
    input()
}
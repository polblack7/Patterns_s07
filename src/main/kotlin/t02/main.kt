package t02

import java.util.*


fun main(args: Array<String>) {

    val photos = Photos(mutableListOf(Photo("Test1"), Photo("Test2"), Photo("Test3"), Photo("Test4")))
    photos.forEach { println(it.name) }
}
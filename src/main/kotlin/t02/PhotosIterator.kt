package t02

import java.util.concurrent.TimeUnit

class PhotosIterator(val photos: MutableList<Photo> = mutableListOf(), var current: Int = 0) : Iterator<Photo> {
    override fun hasNext(): Boolean {
        if (photos.size > current) {
            return true
        }
        else {
            current = 0
            return true
        }
    }
    override fun next(): Photo {
        val photo = photos[current]
        current++
        TimeUnit.SECONDS.sleep(1)
        return photo
    }
}
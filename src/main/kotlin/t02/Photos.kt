package t02

class Photos(val photos: MutableList<Photo> = mutableListOf()) : Iterable<Photo> {
    override fun iterator(): Iterator<Photo> = PhotosIterator(photos)
}
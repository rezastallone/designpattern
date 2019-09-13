package observer

interface VisualSubject{
    fun subscribe(observer: VisualObserver)
    fun unsubscribe(observer: VisualObserver)
    fun updateData(videoStream: VisualData)
}
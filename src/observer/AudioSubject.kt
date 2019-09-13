package observer

interface AudioSubject{
    fun subscribe(observer: AudioObserver)
    fun unsubscribe(observer: AudioObserver)
    fun updateData(soundStream: AudioData)
}
package observer

class Radio: AudioObserver{
    override fun update(audioData: AudioData) {
        println("Radio menghasilkan suara " + audioData.data)
    }
}
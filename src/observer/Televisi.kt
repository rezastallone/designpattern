package observer

class Televisi: AudioObserver , VisualObserver{
    override fun update(audioData: AudioData) {
        println("Televisi menghasilkan suara " + audioData.data)
    }

    override fun update(visualData: VisualData) {
        println("Televisi menampilan gambar " + visualData.data)
    }
}
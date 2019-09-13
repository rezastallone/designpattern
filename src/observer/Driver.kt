package observer

fun main() {
    val sctv = StasiunTv()
    val tvSamsung = Televisi()
    val audioTvSamsungObserver = tvSamsung as AudioObserver
    val visualTvSamsungObserver = tvSamsung as VisualObserver
    val spotifyPodcast = Radio()

    sctv.updateData(AudioData(1))
    sctv.updateData(VisualData(3))

    sctv.subscribe(audioTvSamsungObserver)
    sctv.subscribe(visualTvSamsungObserver)
    sctv.subscribe(spotifyPodcast)

    sctv.updateData(AudioData(5))
    sctv.updateData(AudioData(1))
    sctv.updateData(AudioData(3))

    sctv.updateData(VisualData(10))

    sctv.unsubscribe(visualTvSamsungObserver)

    sctv.updateData(VisualData(15))
    sctv.updateData(VisualData(20))

    sctv.unsubscribe(audioTvSamsungObserver)
    sctv.unsubscribe(spotifyPodcast)

    sctv.updateData(AudioData(6))
    sctv.updateData(VisualData(25))
}
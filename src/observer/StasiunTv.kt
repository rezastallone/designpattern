package observer

class StasiunTv : AudioSubject, VisualSubject {

    private var audioObservers = ArrayList<AudioObserver>()

    private val visualObserver = ArrayList<VisualObserver>()

    private var audioData = AudioData(0)

    private var visualData = VisualData(0)

    override fun subscribe(observer: AudioObserver) {
        audioObservers.add(observer)
        println("Subscribed Audio ${observer::class.simpleName}")
        observer.update(audioData)
    }

    override fun subscribe(observer: VisualObserver) {
        visualObserver.add(observer)
        println("Subscribed Visual ${observer::class.simpleName}")
        observer.update(visualData)
    }

    override fun unsubscribe(observer: AudioObserver) {
        audioObservers.removeIf { item ->
            item == observer
        }
        println("Unsubscribed Audio ${observer::class.simpleName} ")
    }

    override fun unsubscribe(observer: VisualObserver) {
        visualObserver.removeIf { item ->
            item == observer
        }
        println("Unsubscribed Visual ${observer::class.simpleName}")
    }

    override fun updateData(audioData: AudioData) {
        println(">>>> Stasiun TV update audio ${audioData.data}")
        this.audioData = audioData
        if ( audioObservers.isNotEmpty() ){
            for ( observer in audioObservers){
                observer.update(this.audioData)
            }
        }
    }

    override fun updateData(visualData: VisualData) {
        println(">>>> Stasiun TV update visual ${audioData.data}")
        this.visualData = visualData
        if ( visualObserver.isNotEmpty() ){
            for ( observer in visualObserver ){
                observer.update(this.visualData)
            }
        }
    }
}
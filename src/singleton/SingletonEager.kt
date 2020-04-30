package singleton

class SingletonEager private constructor() {

    companion object {

        val singletonEager = SingletonEager()

        fun getInstance(): SingletonEager{
            return singletonEager
        }
    }
}
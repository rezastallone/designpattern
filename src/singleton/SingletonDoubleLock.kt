package singleton

class SingletonDoubleLock private constructor() {

    companion object {

        @Volatile lateinit var singletonDoubleLock: SingletonDoubleLock

        fun getInstance(): SingletonDoubleLock{
            if (!this::singletonDoubleLock.isInitialized){
                synchronized(this){
                    singletonDoubleLock = SingletonDoubleLock()
                }
            }
            return singletonDoubleLock
        }
    }
}
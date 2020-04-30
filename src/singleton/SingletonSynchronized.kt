package singleton

class SingletonSynchronized private constructor() {

    companion object {

        lateinit var singletonLazy: SingletonSynchronized

        @Synchronized fun getInstance(): SingletonSynchronized{
            if (!this::singletonLazy.isInitialized){
                singletonLazy = SingletonSynchronized()
            }
            return singletonLazy
        }
    }
}
package singleton

class SingletonLazy private constructor() {

    companion object {

        lateinit var singletonLazy: SingletonLazy

        fun getInstance(): SingletonLazy{
            if (!this::singletonLazy.isInitialized){
                singletonLazy = SingletonLazy()
            }
            return singletonLazy
        }
    }
}
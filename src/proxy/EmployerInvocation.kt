package proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class EmployerInvocation(private val employment: Employment): InvocationHandler{

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
        if ( proxy == null || method == null ){
            return Any()
        }

        if ( method.name.startsWith("work") ){
            return method.invoke(employment)
        }

        if (employment is Employee){
            throw IllegalAccessException()
        }

        if ( method.name.startsWith("fire") ){
            return method.invoke(employment)
        }

        if ( method.name.startsWith("hire") ){
            return method.invoke(employment)
        }
        return  Any()
    }

    companion object {
        fun createEmployerProxy(employment: Employment): Employment {
            return Proxy.newProxyInstance(
                employment.javaClass.classLoader,
                employment.javaClass.interfaces,
                EmployerInvocation(employment)
            ) as Employment
        }
    }
}
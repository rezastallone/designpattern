package proxy

fun main() {

    val staff = Employee()

    val employmentProxy = EmployerInvocation.createEmployerProxy(staff)

    try {
        employmentProxy.fire()
    }catch (e: IllegalAccessException){
        println("cant fire as employee")
    }

    try {
        employmentProxy.hire()
    }catch (e: IllegalAccessException){
        println("cant hire as employee")
    }

    employmentProxy.work()

    val manager = Employer()

    val employerProxy = EmployerInvocation.createEmployerProxy(manager)

    employerProxy.fire()
    employerProxy.hire()
    employerProxy.work()
}
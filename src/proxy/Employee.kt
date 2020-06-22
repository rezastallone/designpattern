package proxy

class Employee: Employment{

    override fun fire() {
        println("Firing an employee")
    }

    override fun hire() {
        println("Hiring an employee")
    }

    override fun work() {
        println("Working as employer")
    }

}
package variables
val popcorn = 5
var customers = 10
fun main() {


    println("Quantity of Popcorns: $popcorn")
    println("Number of Customers: $customers")
    val name="Vivek"
    var age=18

    println("Name: $name")
    println("Age: "+age)

    age=22   // can change as it is var variable which is mutable
    println("Present Age: $age")

    //name="Abhishek"   // Compile Time Error, because val type is immutabel can't reassigned
}



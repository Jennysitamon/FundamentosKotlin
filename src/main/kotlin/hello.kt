fun main(){
    println("hello world")

    //Variables
    //val para declarar constantes (solo lectura)
    // var para variables
    val pi = 3.14
    var x = 34

    println(pi)
    x = 24
    x = x + 1
    x++
    x--
    x += 10
    x -= 2
    x *= 2
    x /=5
    println(x)

    val firstName = "Alix"
    val lastName: String = "Mbapee"
    val fullName = firstName + " " + lastName
    println(fullName)

    val age: Int = 19
    val height: Double = 1.65

    var stars = 5

    //String Templates
    // $ para imprimir variables
    // ${} para procesar antes de imprimir

    println("Hola $age years old")
    print("Hola $height de altura")
    println("Obtendre un ${ stars + 5} estrellas")

}

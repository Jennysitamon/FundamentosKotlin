fun main(){
    println("Holi")
    sayHello()
    sayHelloTo("Panesito")
    sayHelloToFrom("Conchita","Panaderia")
    println("El doble de 30 es ${duplicate(30)}")
    val result = divide(99,15.0)
    println("El resultado de 99 / 15 es $result")
    println(fullName("Jeny", "Sita"))

    welcomeToBrazil()
    welcomeToBrazil("Huamantla")

    sayHelloToFrom("MiguelHidalgo", "Apizaco")
    sayHelloToFrom(city="Huamantla", name = "Concho")
}

// funciones sin parametros y sin retorno
fun sayHello(){
    println("Holii:D")
}

//funciones con parametros y sin retorno

fun sayHelloTo(name: String){
    println("Hello $name")
    println("Welcome")
}

fun sayHelloToFrom(name: String, city: String){
    println("Hello $name from $city")
}

//funciones con retorno
//nosotros especificamos el tipo de dato que debe retornar en la funcion
fun duplicate(num: Int): Int {
    return num * 2
}

fun divide(num1: Int, num2: Double): Double {
    return num1 / num2
}

fun fullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}
//Funciones con parametros opcionales
fun welcomeToBrazil(name: String = "Invitado"): Unit{
    println("Welcome to Brazil $name")
}
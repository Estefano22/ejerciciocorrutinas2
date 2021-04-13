import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    val listjugador1 = listOf<Int>(1,2,3,4,5,6)
    val listjugador2 = listOf<Int>(1,2,3,4,5,6)

    var resultadojugador1 = 0
    var resultadojugador2 = 0

    runBlocking {
        this.launch {
            repeat(10) {
                println("Jugador 1 a tirado y ha sacado: ${listjugador1.random()}")
                delay(1000)

                 resultadojugador1 += listjugador1.random()
            }
            println("Jugador 1 ha terminado tirar")
        }

        this.launch {
            repeat(10) {
                println("Jugador 2 a tirado y ha sacado: ${listjugador2.random()}")
                delay(1500)
                resultadojugador2 += listjugador2.random()
            }
            println("Jugador 2 ha terminado tirar")
        }
    }

    println("El resultado del jugador 1 es:$resultadojugador1")
    println("El resultado del jugador 2 es:$resultadojugador2")
}
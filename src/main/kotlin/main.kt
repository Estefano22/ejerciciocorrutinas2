import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*


fun main(args: Array<String>) {

    val random =Random()
    var numsacado = 0

    val listjugador1 = mutableListOf<Int>()
    val listjugador2 = mutableListOf<Int>()

    var resultadojugador1 = 0
    var resultadojugador2 = 0


println("EMPEZAMOS")
    println("3")
    println("2")
    println("1")
    println("GO!")
    runBlocking {
        this.launch {
            repeat(10) {
               // numsacado = random.nextInt(6)+1
                numsacado = (1..6).random()
                println("Jugador 1 a tirado y ha sacado: $numsacado")
                listjugador1.add(numsacado)
                delay(1000)
                resultadojugador1 += numsacado

            }

            println("resultado de las tiradas del Primer Jugador: $listjugador1")
            println("Jugador 1 ha terminado de tirar")
        }

        this.launch {
            repeat(10) {
                //numsacado = random.nextInt(6)+1
                numsacado = (1..6).random()
                println("Jugador 2 a tirado y ha sacado:$numsacado")
                listjugador2.add(numsacado)
                delay(1500)
                resultadojugador2 += numsacado

            }
            println("resultado de las tiradas del Segundo Jugador: $listjugador2")
            println("Jugador 2 ha terminado de tirar")
        }
    }

    println("El resultado del jugador 1 es:$resultadojugador1")
    println("El resultado del jugador 2 es:$resultadojugador2")

}
package dev.carloscy

import dev.carloscy.models.*

fun main() {

    val entrenador : Entrenador = Entrenador("Juan", "Fernández", 7)
    entrenador.entrenar()

    println()

    val portero : JugadorPortero = JugadorPortero("José", "Olid", 1, false)
    portero.entrenar()
    portero.jugarPartido()
    portero.parar()
    portero.defender()
    portero.distribuir()
    portero.atacar()

    println()

    val defensa : JugadorDefensa = JugadorDefensa("Alberto", "Martínez", 4, true)
    defensa.entrenar()
    defensa.jugarPartido()
    defensa.parar()
    defensa.defender()
    defensa.distribuir()
    defensa.atacar()

    println()

    val medio : JugadorMedio = JugadorMedio("Adrián", "Lázaro", 8, false)
    medio.entrenar()
    medio.jugarPartido()
    medio.parar()
    medio.defender()
    medio.distribuir()
    medio.atacar()

    println()

    val delantero : JugadorDelantero = JugadorDelantero("Ángel", "San Miguel", 10, false)
    delantero.entrenar()
    delantero.jugarPartido()
    delantero.parar()
    delantero.defender()
    delantero.distribuir()
    delantero.atacar()
}
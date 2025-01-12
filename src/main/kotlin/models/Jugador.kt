package dev.carloscy.models

/**
 * Clase que representa a los jugadores del equipo.
 * @property nombre Nombre del jugador.
 * @property apellidos Apellidos del jugador.
 * @property dorsal Número de dorsal del jugador.
 * @property capitan propiedad que tendrá el valor true si el jugador es el capitán del equipo, false si no lo es.
 * @see MiembroEquipo
 */
open class Jugador (
    nombre: String,
    apellidos: String,
    val dorsal: Int,
    val capitan: Boolean
) : MiembroEquipo (nombre, apellidos) {

    /**
     * Imprime por pantalla un mensaje que informa de que el jugador está entrenando.
     */
    override fun entrenar() {
        println("Entrenando como jugador.")
    }

    /**
     * Función abierta para ser sobreescrita por cada tipo de jugador.
     */
    open fun jugarPartido() {
    }
}
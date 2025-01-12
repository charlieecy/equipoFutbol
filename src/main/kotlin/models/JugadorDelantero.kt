package dev.carloscy.models

/**
 * Clase que representa a los jugadores que son delanteros.
 * @property nombre Nombre del jugador.
 * @property apellidos Apellidos del jugador.
 * @property dorsal Número de dorsal del jugador.
 * @property capitan propiedad que tendrá el valor true si el jugador es el capitán del equipo, false si no lo es.
 * @see Jugador
 * @see IPortero
 * @see IDefensa
 * @see IMedio
 * @see IDelantero
 */
class JugadorDelantero (
    nombre: String,
    apellidos: String,
    dorsal: Int,
    capitan: Boolean
) : Jugador(nombre, apellidos, dorsal, capitan), IPortero, IDefensa, IMedio, IDelantero {

    /**
    * Imprime por pantalla los datos del jugador y un mensaje que informa de que está jugando el partido.
    * @see nombre
    * @see apellidos
    * @see dorsal
    */
    override fun jugarPartido() {
        println("$nombre $apellidos está jugando el partido como DELANTERO, con el dorsal nº $dorsal.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está jugando como portero.
     */
    override fun parar() {
        println("DELANTERO jugando como portero.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está jugando como defensa.
     */
    override fun defender() {
        println("DELANTERO jugando como defensa.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está jugando como medio.
     */
    override fun distribuir() {
        println("DELANTERO jugando como medio.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está atacando con el balón.
     */
    override fun atacar() {
        println("Atacando con el BALÓN.")
    }
}
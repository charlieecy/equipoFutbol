package dev.carloscy.models

/**
 * Clase que representa a los jugadores que son medios.
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
class JugadorMedio (
    nombre : String,
    apellidos : String,
    dorsal : Int,
    capitan : Boolean
) : Jugador(nombre, apellidos, dorsal, capitan), IPortero, IDefensa, IMedio, IDelantero {

    /**
     * Imprime por pantalla los datos del jugador y un mensaje que informa de que está jugando el partido.
     * @see nombre
     * @see apellidos
     * @see dorsal
     */
    override fun jugarPartido() {
        println("$nombre $apellidos está jugando el partido como MEDIO, con el dorsal nº $dorsal.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está jugando como portero.
     */
    override fun parar() {
        println("MEDIO jugando como portero.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está jugando como defensa.
     */
    override fun defender() {
        println("MEDIO jugando como defensa.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está distribuyendo el balón.
     */
    override fun distribuir() {
        println("Distribuyendo el BALÓN.")
    }

    /**
     * Imprime por pantalla un mensaje que informa de que está jugando como delantero.
     */
    override fun atacar() {
        println("MEDIO jugando como delantero.")
    }

}
package dev.carloscy.models

/**
 * Clase que representa el entrenador del equipo.
 * @property nombre Nombre del entrenador.
 * @property apellidos Apellidos del entrenador.
 * @property anosExperiencia Años de experiencia como entrenador.
 * @see MiembroEquipo
 */
class Entrenador (
    nombre : String,
    apellidos : String,
    val anosExperiencia: Int
) : MiembroEquipo (nombre, apellidos) {

    /**
     * Imprime por pantalla los datos del entrenador y un mensaje que informa de que está entrenando al equipo.
     * @see nombre
     * @see apellidos
     * @see anosExperiencia
     */
    override fun entrenar() {
        println("$nombre $apellidos, con $anosExperiencia años de experiencia, está entrenando al equipo.")
    }

}
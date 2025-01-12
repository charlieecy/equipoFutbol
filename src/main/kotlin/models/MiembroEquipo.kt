package dev.carloscy.models

/**
 * Clase abstracta que representa los miembros de un equipo.
 * @property nombre Nombre del miembro del equipo.
 * @property apellidos Apellidos del miembro del equipo.
 */

abstract class MiembroEquipo (
    val nombre: String,
    val apellidos: String,
) {

    /**
     * Función abstracta que representa la acción de entrenar.
     */
    abstract fun entrenar ()
}
package com.dam1.ejercicio2.src.clases

class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double)
    : Persona(nombre, edad, id, "Estudiante") {

    fun mostrarCalificacion() {
        println("La calificación promedio de $nombre es $calificacionPromedio .")
    }

    override fun mostrarRol(): String {
        return "$nombre es un $rol de edad $edad, con el ID $id, en el curso $curso."
    }
}


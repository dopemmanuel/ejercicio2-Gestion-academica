package com.dam1.ejercicio2.src.clases

class Profesor(nombre: String, edad: Int, id: String, val departamento: String, val aniosExperiencia: Int)
    : Persona(nombre, edad, id, "Profesor") {

    fun mostrarExperiencia() {
        println("$nombre tiene $aniosExperiencia años de experiencia en el departamento de $departamento.")
    }

    override fun mostrarRol(): String {
        return "$nombre es un $rol de edad $edad, con el ID $id, en el departamento $departamento."
    }
}

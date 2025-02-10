package com.dam1.ejercicio2.src.clases

open class Persona(val nombre: String, val edad: Int, val id: String, val rol: String) {

    open fun mostrarRol(): String {
        return "$nombre es un $rol de edad $edad."
    }
}


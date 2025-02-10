package com.dam1.ejercicio2.src

import com.dam1.ejercicio2.src.clases.Estudiante
import com.dam1.ejercicio2.src.clases.Profesor



fun main() {
    val estudiante1 = Estudiante("Tester3", 25, "A33333333", "Ingenieria", 7.0)
    val profesor1 = Profesor("Tester5", 35, "P44444444", "Ingenieria", 5)

    estudiante1.mostrarRol()
    estudiante1.mostrarCalificacion()

    profesor1.mostrarRol()
    profesor1.mostrarExperiencia()
}
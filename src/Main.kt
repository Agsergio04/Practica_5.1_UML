fun main() {
    val cursoKotlin = Curso("Programación", "KOT101",)
    val estudiante1 = Estudiante("Paula Tocino", "12345678A")
    val estudiante2 = Estudiante("Coral Ruíz", "87654321B")
    val estudiante3 = Estudiante("Agarrido Rey", "87654321B")

    estudiante1.inscribirse(cursoKotlin)
    estudiante2.inscribirse(cursoKotlin)
    estudiante3.inscribirse(cursoKotlin)

    cursoKotlin.mostrarEstudiantes()
}

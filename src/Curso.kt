class Curso (
    var nombre : String,
    val codigo : String,
    var estudiantes : MutableList<Estudiante> = mutableListOf<Estudiante>()
){

    fun agregarAlumno(estudiante : Estudiante){
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes(){
        for (estudiante in estudiantes){
            println(estudiante.nombre)
        }
    }
}
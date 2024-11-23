package semana12.backend;

import java.util.ArrayList;
import java.util.Date;

public class Alumno extends Persona {
    private String foto;
    private String promedio;
    private String cuenta;
    private Profesor profesor;
    private Curso curso;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Alumno(String nombre, String apPaterno, String apMaterno, Date fechaNacimiento, Genero genero,
                  String foto, String promedio, String cuenta) {
        super(nombre, apPaterno, apMaterno, fechaNacimiento, genero);
        this.foto = foto;
        this.promedio = promedio;
        this.cuenta = cuenta;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /*public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }*/

    public void registrarCurso(Curso curso) {
        this.curso = curso;
    }

    public void eliminarCurso() {
        curso = null;
    }

    public void agregarTutor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void eliminarTutor() {
        profesor = null;
    }
}

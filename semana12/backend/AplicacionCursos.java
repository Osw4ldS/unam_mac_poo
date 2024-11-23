package semana12.backend;

import javax.swing.*;
import javax.xml.crypto.AlgorithmMethod;
import java.util.ArrayList;
import java.util.Date;

public class AplicacionCursos {
    private Integer posicionAlumnoActual;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();;
    private ArrayList<Profesor> profesores = new ArrayList<>();;

    public Alumno getAlumnoAnterior() {
        return alumnos.get(posicionAlumnoActual - 1);
    }

    public Alumno getAlumnoSiguiente() {
        return alumnos.get(posicionAlumnoActual + 1);
    }

    public Alumno getAlumnoActual(){
        return alumnos.get(posicionAlumnoActual);
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public AplicacionCursos() {
        // Llenado de cursos
        Curso cursoTmp = new Curso(101, 100, "Programación I");
        cursos.add(cursoTmp);

        cursoTmp = new Curso(102, 90,"Diseño I");
        cursos.add(cursoTmp);

        cursoTmp = new Curso(103, 80,"Programación II");
        cursos.add(cursoTmp);

        cursoTmp = new Curso(104, 50,"Redes");
        cursos.add(cursoTmp);

        cursoTmp = new Curso(105, 95,"Diseño de Bases de Datos");
        cursos.add(cursoTmp);

        // LLenado de profesores
        profesores = new ArrayList<Profesor>();

        Date fechaNacimiento = new Date(80, 7, 17);
        Profesor profesorTmp = new Profesor(
                "Luis",
                "Chávez",
                "Hernández",
                fechaNacimiento,
                Genero.MASCULINO,
                12236,
                "AB1234567"
        );
        profesores.add(profesorTmp);

        fechaNacimiento = new Date(77, 4, 5);
        profesorTmp = new Profesor(
                "Diana",
                "Cortéz",
                "Ruiz",
                fechaNacimiento,
                Genero.FEMENINO,
                13411,
                "CR1254365"
        );
        profesores.add(profesorTmp);

        fechaNacimiento = new Date(87, 6, 25);
        profesorTmp = new Profesor(
                "Jorge",
                "Ayala",
                "Núñez",
                fechaNacimiento,
                Genero.MASCULINO,
                22451,
                "AN8792362"
        );
        profesores.add(profesorTmp);

        fechaNacimiento = new Date(91, 11, 18);
        profesorTmp = new Profesor(
                "Gerardo",
                "Talavera",
                "Osorio",
                fechaNacimiento,
                Genero.MASCULINO,
                89304,
                "TO5830284"
        );
        profesores.add(profesorTmp);

        fechaNacimiento = new Date(89, 7, 30);
        profesorTmp = new Profesor(
                "Carlos",
                "Montes",
                "Cabrera",
                fechaNacimiento,
                Genero.MASCULINO,
                78742,
                "MC6639285"
        );
        profesores.add(profesorTmp);

        // Llenado de alumnos
        alumnos = new ArrayList<Alumno>();

        fechaNacimiento = new Date(2004, 10, 22);
        Alumno alumnoTmp = new Alumno(
                "Pablo",
                "Cruz",
                "Juárez",
                fechaNacimiento,
                Genero.MASCULINO,
                "hombre.png",
                "8.6",
                "10293857"
        );
        alumnos.add(alumnoTmp);

        fechaNacimiento = new Date(2005, 4, 15);
        alumnoTmp = new Alumno(
                "Laura",
                "García",
                "Sánchez",
                fechaNacimiento,
                Genero.FEMENINO,
                "mujer.png",
                "9.2",
                "10293858"
        );
        alumnos.add(alumnoTmp);

        fechaNacimiento = new Date(2003, 1, 10);
        alumnoTmp = new Alumno(
                "Juan",
                "Pérez",
                "López",
                fechaNacimiento,
                Genero.MASCULINO,
                "hombre.png",
                "7.4",
                "10293859"
        );
        alumnos.add(alumnoTmp);

        fechaNacimiento = new Date(206, 7, 25);
        alumnoTmp = new Alumno(
                "María",
                "González",
                "Rodríguez",
                fechaNacimiento,
                Genero.FEMENINO,
                "mujer.png",
                "9.7",
                "10293860"
        );
        alumnos.add(alumnoTmp);

        fechaNacimiento = new Date(102, 11, 5);
        alumnoTmp = new Alumno(
                "Andrés",
                "Ramírez",
                "Martínez",
                fechaNacimiento,
                Genero.MASCULINO,
                "hombre.png",
                "8.3",
                "10293861"
        );
        alumnos.add(alumnoTmp);

        fechaNacimiento = new Date(2007, 2, 18);
        alumnoTmp = new Alumno(
                "Carmen",
                "Díaz",
                "González",
                fechaNacimiento,
                Genero.FEMENINO,
                "mujer.png",
                "9.1",
                "10293862"
        );
        alumnos.add(alumnoTmp);

        fechaNacimiento = new Date(105, 6, 12);
        alumnoTmp = new Alumno(
                "Ana",
                "López",
                "Morales",
                fechaNacimiento,
                Genero.FEMENINO,
                "mujer.png",
                "9.3",
                "10293864"
        );
        alumnos.add(alumnoTmp);

        fechaNacimiento = new Date(103, 8, 28);
        alumnoTmp = new Alumno(
                "Carlos",
                "Sánchez",
                "Álvarez",
                fechaNacimiento,
                Genero.MASCULINO,
                "hombre.png",
                "7.9",
                "10293865"
        );
        alumnos.add(alumnoTmp);

        posicionAlumnoActual = 0;
    }
}
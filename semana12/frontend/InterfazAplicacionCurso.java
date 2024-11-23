package semana12.frontend;
import semana12.backend.AplicacionCursos;
import semana12.backend.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InterfazAplicacionCurso extends JFrame {
    private AplicacionCursos aplicacionCursos;
    private PanelDatos panelDatos;
    private PanelRegistro panelRegitro;
    private PanelNavegacion panelNavegacion;

    public InterfazAplicacionCurso() {
        // costruye la forma
        setTitle("Aplicación Cursos");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        // crear la instancia de la clase contenedora de profesores, cursos y alumnos
        aplicacionCursos = new AplicacionCursos();

        // construye los paneles
        panelDatos = new PanelDatos();
        panelRegitro = new PanelRegistro(this);
        panelNavegacion = new PanelNavegacion(this);

        // organizar el Panel Principal
        add(panelDatos, BorderLayout.NORTH);
        add(panelRegitro, BorderLayout.CENTER);
        add(panelNavegacion, BorderLayout.SOUTH);

        mostrarInformacionAlumno(aplicacionCursos.getAlumnoActual());
    }

    public static void main(String[] args) {
        InterfazAplicacionCurso interfaz = new InterfazAplicacionCurso();
        interfaz.setVisible(true);
    }

    public void mostrarInformacionAlumno(Alumno alumno) {
        panelDatos.actualizarPanel(alumno);
    }

    public void siguiente() {
        Alumno alumno = aplicacionCursos.getAlumnoSiguiente();
        mostrarInformacionAlumno(alumno);
    }

    public void anterior() {
        Alumno alumno = aplicacionCursos.getAlumnoAnterior();
        mostrarInformacionAlumno(alumno);
    }

    public void agregaCurso(Curso curso) {
        JOptionPane.showMessageDialog(
                this,
                "Se registrará el curso: " + curso.toString()
        );
        aplicacionCursos.getAlumnoActual().registrarCurso(curso);
    }

    public void registrarTutor(Profesor profesor) {
        JOptionPane.showMessageDialog(
                this,
                "Se registrará el tutor: " + profesor.toString()
        );
        aplicacionCursos.getAlumnoActual().agregarTutor(profesor);
    }

    public void borrarCurso() {
        aplicacionCursos.getAlumnoActual().eliminarCurso();
    }

    public void borrarTutor() {
        aplicacionCursos.getAlumnoActual().eliminarTutor();
    }

    public ArrayList<Curso> getCursos() {
        return aplicacionCursos.getCursos();
    }

    public ArrayList<Profesor> getProfesores() {
        return aplicacionCursos.getProfesores();
    }
}

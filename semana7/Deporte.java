package semana7;

import java.util.Vector;

public class Deporte {
    private String nombre;
    private Vector<String> horario;
    private String lugarEntrenamiento;
    private int edadesObjetivo;
    private Nivel nivelEntrenamiento;
    private Entrenador entrenador;

    public Deporte() {
        horario = new Vector<String>();
    }

    public Deporte(String nombre, Vector<String> horario, String lugarEntrenamiento,
                   int edadesObjetivo, Nivel nivelEntrenamiento, Entrenador entrenador) {
        this.nombre = nombre;
        this.horario = horario;
        this.lugarEntrenamiento = lugarEntrenamiento;
        this.edadesObjetivo = edadesObjetivo;
        this.nivelEntrenamiento = nivelEntrenamiento;
        this.entrenador = entrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vector<String> getHorario() {
        return horario;
    }

    public void setHorario(Vector<String> horario) {
        this.horario = horario;
    }

    public String getLugarEntrenamiento() {
        return lugarEntrenamiento;
    }

    public void setLugarEntrenamiento(String lugarEntrenamiento) {
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    public int getEdadesObjetivo() {
        return edadesObjetivo;
    }

    public void setEdadesObjetivo(int edadesObjetivo) {
        this.edadesObjetivo = edadesObjetivo;
    }

    public Nivel getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(Nivel nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String imprimirInfo() {
        String horarios = "";

        for(int i = 0; i < horario.size(); i++) {
            horarios += (i+1) + "° horario: " + horario.get(i) + "\n";
        }

        return "\nHorario(s): \n" + horarios +
               "Lugar de entrenamiento: " + lugarEntrenamiento +
               "\nEdad objetivo: " + edadesObjetivo +
               "\nNivel de entrenamiento: " + nivelEntrenamiento +
               "\nEntrenador: " + (entrenador != null ? entrenador.toString() : "No asignado");
    }
}

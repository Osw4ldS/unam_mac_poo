package semana12.backend;

import java.util.Date;

public class Profesor extends Persona{
    private Integer noTrabajador;
    private String cedula;

    public Profesor(String nombre, String apPaterno, String apMaterno,
                    Date fechaNacimiento, Genero genero, Integer noTrabajador, String cedula) {
        super(nombre, apPaterno, apMaterno, fechaNacimiento, genero);
        this.noTrabajador = noTrabajador;
        this.cedula = cedula;
    }

    public Integer getNoTrabajador() {
        return noTrabajador;
    }

    public void setNoTrabajador(Integer noTrabajador) {
        this.noTrabajador = noTrabajador;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String toString() {
        return nombre + " " + apPaterno + " " + apMaterno;
    }
}

package semana12.backend;

import java.util.Date;

public class Persona {
    protected Date fechaNacimiento;
    protected Genero genero;
    protected String nombre;
    protected String apPaterno;
    protected String apMaterno;

    public Persona(String nombre, String apPaterno, String apMaterno, Date fechaNacimiento, Genero genero) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String imprimirDatos() {
        return "Nombre: " + nombre +
               "Género: " + genero +
               "\n Apellido paterno: " + apPaterno +
               "\n Apellido materno: " + apMaterno;
    }
}

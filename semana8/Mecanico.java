package semana8;

import java.util.ArrayList;

public class Mecanico {
    private String nombre;
    private String apodo;
    private String noEmpleado;
    private double salario;
    private ArrayList<Auto> autos = new ArrayList<>();

    public Mecanico(String nombre, String apodo, String noEmpleado, double salario, ArrayList<Auto> autos) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.noEmpleado = noEmpleado;
        this.salario = salario;
        this.autos = autos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer totalDeAutosReparadosXMes(int mes) {
        int total = 0;

        for(Auto auto: autos) {
            if(auto.getFechaSalida().getMonth() == mes) total++;
        }

        return total;
    }

    public double obtenerComision(Auto auto) {
        return auto.getCostoReparacion() * 0.10;
    }

    public ArrayList<Auto> mostrarAutosNoReparados() {
        ArrayList<Auto> noReparados = new ArrayList<>();

        for(Auto auto: autos) {
            if(auto.getFechaSalida() == null) noReparados.add(auto);
        }

        return noReparados;
    }

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }
}

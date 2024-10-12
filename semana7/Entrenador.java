package semana7;

public class Entrenador {
    private double salario;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int numEmpleado;

    public Entrenador() {

    }

    public Entrenador(double salario, String nombre, String apellidoPaterno,
                      String apellidoMaterno, int numEmpleado) {
        this.salario = salario;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.numEmpleado = numEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String imprimirInfo() {
        return "Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno +
               "\nNúmero de Empleado: " + numEmpleado +
               "\nSalario: " + salario;
    }
}

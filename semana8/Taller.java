package semana8;

public class Taller {
    private String razonSocial;
    private String direccion;

    public Taller(String direccion, String razonSocial) {
        this.direccion = direccion;
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
*/

package semana6.cafetera;

public class Cafetera {
    private int cantidadCafeMaxima;
    private int cantidadCafeActual;

    public int getCantidadCafeMaxima() {
        return cantidadCafeMaxima;
    }

    public void setCantidadCafeMaxima(int cantidadCafeMaxima) {
        this.cantidadCafeMaxima = cantidadCafeMaxima;
    }

    public int getCatidadCafeActual() {
        return cantidadCafeActual;
    }

    public void setCatidadCafeActual(int catidadCafeActual) {
        this.cantidadCafeActual = catidadCafeActual;
    }

    public void llenarCafetera() {
        cantidadCafeActual = cantidadCafeMaxima;
    }

    public void servirCafe(int cafeServido) {
        if(cantidadCafeActual < cafeServido) cantidadCafeActual = 0;
        else cantidadCafeActual -= cafeServido;
    }

    public void vaciarCafe() {
        cantidadCafeActual = 0;
    }

    public void agreagarCafe(int cantidadCafeAgregado) {
        if(cantidadCafeActual <= cantidadCafeMaxima) cantidadCafeActual += cantidadCafeAgregado;
    }
}

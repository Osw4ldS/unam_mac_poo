/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
 */

package semana5;

import javax.swing.*;
import java.util.Date;

public class Documento {
    private String titulo;
    private Date fecha;
    private String nombreDoc;
    private String ruta;
    private int caracteres;
    private int renglones;
    private String contenido;
    private int parrafos;
    private int paginas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(int caracteres) {
        this.caracteres = caracteres;
    }

    public int getRenglones() {
        return renglones;
    }

    public void setRenglones(int renglones) {
        this.renglones = renglones;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getParrafos() {
        return parrafos;
    }

    public void setParrafos(int parrafos) {
        this.parrafos = parrafos;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void calcularCaracteres() {
        JOptionPane.showMessageDialog(null, "Calculando caraceteres...");
    }

    public void calcularRenglones() {
        JOptionPane.showMessageDialog(null, "Calculando renglones...");
    }

    public void calcularParrafos() {
        JOptionPane.showMessageDialog(null, "Calculando párrafos...");
    }

    public void calcularPags() {
        JOptionPane.showMessageDialog(null, "Calculando número de páginas...");
    }
}

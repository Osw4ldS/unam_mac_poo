/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
*/

package semana9;

import javax.swing.*;

public class Complejo {
    private int real;
    private int imaginario;

    public Complejo(int real, int imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginario() {
        return imaginario;
    }

    public void setImaginario(int imaginario) {
        this.imaginario = imaginario;
    }

    public Complejo suma(Complejo c) {
        Complejo resultado = null;
        resultado = new Complejo(real+c.getReal(),imaginario+c.getImaginario());
        return resultado;
    }

    public Complejo resta(Complejo c) {
        Complejo resultado = null;
        resultado = new Complejo(real-c.getReal(),imaginario-c.getImaginario());
        return resultado;
    }

    public Complejo multiplicacion(Complejo c) {
        Complejo resultado = null;
        resultado = new Complejo(real*c.getReal(),imaginario*c.getImaginario());
        return resultado;
    }

    public Complejo division(Complejo c) {
        Complejo resultado = null;
        resultado = new Complejo(real/c.getReal(),imaginario/c.getImaginario());
        return resultado;
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(
                null,
                "(" + real + " + " + imaginario + "i)",
                "Resultado",
                3
        );
    }
}

/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
*/

package semana5;

import javax.swing.*;

public class Ejecutora {
    public static void main(String[] args) {
        Documento doc1 = new Documento();

        doc1.setTitulo(JOptionPane.showInputDialog("Ingrese el título."));
        doc1.setNombreDoc(JOptionPane.showInputDialog("Ingrese el nombre del documento."));
        doc1.setContenido(JOptionPane.showInputDialog("Ingrese el contenido."));
        doc1.setRuta(JOptionPane.showInputDialog("Ingrese la ruta."));


        doc1.calcularCaracteres();
        doc1.calcularRenglones();
        doc1.calcularParrafos();
        doc1.calcularPags();
    }
}

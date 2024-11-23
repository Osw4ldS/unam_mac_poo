/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
*/

package semana10;

import javax.swing.*;

public class ClaseEjecutoraDibujo {

    public static void main(String[] args) {
        Dibujo dibujo = new Dibujo();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(dibujo);
        frame.setSize(450,450);
        frame.setVisible(true);
    }
}

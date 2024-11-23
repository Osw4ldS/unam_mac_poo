/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
*/

package semana10;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Dibujo extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(245, 245, 245));
        g.fillRect(50, 0, 400, 400);

        g.setColor(new Color(73, 54, 40));
        g.fillRect(150, 50, 50, 75);
        g.fillRect(300, 50, 50, 75);
        g.fillRect(100, 75, 100, 50);
        g.fillRect(300, 75, 100, 50);

        g.setColor(new Color(204, 43, 82));
        g.fillRect(100, 125, 50, 50);
        g.fillRect(200, 125, 100, 200);
        g.fillRect(350, 125, 50, 50);
        g.fillRect(150, 175, 200, 50);

        g.setColor(new Color(175, 23, 64));
        g.fillRect(150, 125, 50, 50);
        g.fillRect(300, 125, 50, 50);
        g.fillRect(100, 175, 50, 50);
        g.fillRect(350, 175, 50, 50);
        g.fillRect(150, 225, 50, 50);
        g.fillRect(300, 225, 50, 50);

        g.setColor(new Color(243, 243, 224));
        g.fillRect(100, 225, 50, 50);
        g.fillRect(300, 275, 50, 50);
        g.fillRect(150, 275, 50, 50);
        g.fillRect(350, 225, 50, 50);
        g.fillRect(200, 325, 100, 25);

        g.setColor(new Color(255, 176, 176));
        g.fillRect(145, 90, 25, 60);
        g.fillRect(330, 90, 25, 60);

        g.setColor(new Color(0,0,0));
        g.fillRect(180, 200, 30, 60);
        g.fillRect(290, 200, 30, 60);
        g.fillRect(225, 330, 50, 15);

    }

}

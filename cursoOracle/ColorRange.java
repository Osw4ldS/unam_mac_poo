package cursoOracle;

import javax.swing.*;

public class ColorRange {

    public static void main(String[] args) {
        double color;

        color = Double.parseDouble(JOptionPane.showInputDialog(null, "Código del color: "));

        if(380 <= color && color < 450) JOptionPane.showMessageDialog(null, "Violeta");
        else if(450 <= color && color < 495) JOptionPane.showMessageDialog(null, "Azul");
        else if(495 <= color && color < 570) JOptionPane.showMessageDialog(null, "Verde");
        else if(570 <= color && color < 590) JOptionPane.showMessageDialog(null, "Amarillo");
        else if(590 <= color && color < 620) JOptionPane.showMessageDialog(null, "Naranja");
        else if(620 <= color && color < 750) JOptionPane.showMessageDialog(null, "Verde");
        else JOptionPane.showMessageDialog(null, "Código de color no válido");
    }
}

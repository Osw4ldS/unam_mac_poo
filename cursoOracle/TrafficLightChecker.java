package cursoOracle;

import javax.swing.*;

public class TrafficLightChecker {

    public static void main(String[] args) {
        int currentColor;

        currentColor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un código de color:"));

        if(currentColor == 1) JOptionPane.showMessageDialog(null, "El siguiente semáforo está verde");
        else if(currentColor == 2) JOptionPane.showMessageDialog(null, "El siguiente semáforo está amarillo");
        else if(currentColor == 3) JOptionPane.showMessageDialog(null, "El siguiente semáforo está rojo");
        else JOptionPane.showMessageDialog(null, "Código de color no válido");

    }

}

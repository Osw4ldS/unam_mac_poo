package cursoOracle;

import javax.swing.*;

public class TrafficLightSwitch {

    public static void main(String[] args) {
        int currentColor;

        currentColor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un código de color:"));

        switch(currentColor) {
            case 1:
                JOptionPane.showMessageDialog(null, "El siguiente semáforo está verde");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El siguiente semáforo está amarillo");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El siguiente semáforo está rojo");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código de color no válido");
        }
    }

}

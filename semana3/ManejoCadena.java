package semana3;

import javax.swing.*;

public class ManejoCadena {
    public static void main(String[] args) {
        String date = "";
        String[] separatedValues = null;

        date = JOptionPane.showInputDialog(null, "Ingresa una fecha con el formato DD/MM/AAAA.");
        separatedValues = date.split("/");
        JOptionPane.showMessageDialog(null,"Tamaño del arreglo: "+separatedValues.length);

        for(int i = 0; i < separatedValues.length; i++) {
            JOptionPane.showMessageDialog(null, "Valores separados ["+i+"]: "+separatedValues[i]);

        }
    }
}

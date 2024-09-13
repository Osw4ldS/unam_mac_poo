package semana4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaPlaneta {
    public static void main(String[] args) {
        double tierraSize;
        double[] tierraPosition = null;
        int numPostions;
        double positionValue;
        String tierraOrbit;
        String tierraColor;
        int tierraNRings;
        String tierraChemicalComp;
        int tierraAthmosphere;
        Double tierraMagneticField;
        boolean creatingPlanet = false;

        List<Planeta> planetas = new ArrayList<Planeta>();

        Planeta tierra = new Planeta();

        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados para el planeta Tierra.");
        // Tamaño Tierra
        tierraSize = Double.parseDouble(JOptionPane.showInputDialog(null, "Tamaño:"));
        tierra.setSize(tierraSize);

        // Posición Tierra
        numPostions = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de posiciones:"));
        tierra.setPosition(new double[numPostions]);

        for(int i = 0; i < tierra.getPosition().length; i++) {
            positionValue = Double.parseDouble(JOptionPane.showInputDialog(null,"Valor de la posición " + (i+1) + ": "));
            tierra.getPosition()[i] = positionValue;
        }

        // Órbita Tierra
        tierraOrbit = JOptionPane.showInputDialog("Tipo de órbita:");
        tierra.setOrbit(tierraOrbit);

        // Color Tierra
        tierraColor = JOptionPane.showInputDialog("Color:");
        tierra.setColor(tierraColor);

        // No. anillos Tierra
        tierraNRings = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de anillos:"));
        tierra.setnRings(tierraNRings);

        // Comp. química Tierra
        tierraChemicalComp = JOptionPane.showInputDialog(null, "Composición química:");
        tierra.setChemicalComp(tierraChemicalComp);

        // Atmósfera Tierra
        tierraAthmosphere = Integer.parseInt(JOptionPane.showInputDialog(null, "Tiene atmósfera\n0)No 1)Sí:"));
        tierra.setAthmosphere(tierraAthmosphere);

        // Campo magnético Tierra
        tierraMagneticField = Double.parseDouble(JOptionPane.showInputDialog(null, "Campo magnético:"));
        tierra.setMagneticField(tierraMagneticField);

        JOptionPane.showMessageDialog(null, tierra.showInfo(), "Tierra", 1);
    }
}

// planetas.add(tierra); agrega un planeta a la lista de planetas


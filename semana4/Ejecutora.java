/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
 */
package semana4;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ejecutora {
    public static void main(String[] args) {
        int option;
        boolean validOption = false;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Seleccione una opción: \n1) Crear objeto nuevo \n2) Imprimir objetos \n3) Salir",
                    "Menú",
                    3
            ));

            if (1 <= option && option <= 3) validOption = true;
            else JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
        } while (!validOption);

        switch (option) {
            case 1:
                option = 0;
                validOption = false;
                do {
                    option = Integer.parseInt(JOptionPane.showInputDialog(null,
                            """
                                    1) Planeta\
                                    
                                    2) Automóvil\
                                    
                                    3) Carrera\
                                    
                                    4) Facultad\
                                    
                                    5) Edificio""",
                            "Crear objeto",
                            3
                            ));

                    if (1 <= option && option <= 5) validOption = true;
                    else JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
                } while(!validOption);

                switch (option) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Creando Planeta...", "Espere", 1);
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

                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Creando Automóvil...", "Espere", 1);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Creando Carrera...", "Espere", 1);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Creando Facultad...", "Espere", 1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Creando Edificio...", "Espere", 1);
                        break;
                }
                break;
            case 2:
                option = 0;
                validOption = false;
                do {
                    option = Integer.parseInt(JOptionPane.showInputDialog(null,
                            """
                                    1) Planeta\
                                    
                                    2) Automóvil\
                                    
                                    3) Carrera\
                                    
                                    4) Facultad\
                                    
                                    5) Edificio""",
                            "Crear objeto",
                            3
                    ));

                    if (1 <= option && option <= 5) validOption = true;
                    else JOptionPane.showMessageDialog(null, "Seleccione una opción válida.");
                } while(!validOption);

                switch (option) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Planeta:...", "Imprimiendo", 1);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Automóvil:...", "Imprimiendo", 1);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Carrera:...", "Imprimiendo", 1);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Facultad:...", "Imprimiendo", 1);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Edificio:...", "Imprimiendo", 1);
                        break;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"Saliendo del programa...");
                break;
        }

    }
}

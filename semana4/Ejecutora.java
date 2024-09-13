/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
 */
package semana4;

import javax.swing.*;

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

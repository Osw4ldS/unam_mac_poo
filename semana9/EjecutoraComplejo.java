/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
*/

package semana9;

import javax.swing.*;

public class EjecutoraComplejo {
    public static void main(String[] args) {
        int opcion;
        int parteReal;
        int parteImaginaria;
        boolean opcionValida = false;
        Complejo a = null;
        Complejo b = null;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
               null,
                    """
                            1) Suma\
                            
                            2) Resta\
                            
                            3) Multiplicación\
                            
                            4) División\
                            
                            5) Salir
                            """,
                    "Menú de opciones",
                    1
            ));

            if(1 <= opcion && opcion <= 5) opcionValida = true;
        } while(!opcionValida);

        parteReal = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Ingrese la parte real del complejo: ",
                "Parte real",
                3
        ));

        parteImaginaria = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Ingrese la parte imaginaria del complejo: ",
                "Parte imaginaria",
                3
        ));

        a = new Complejo(parteReal, parteImaginaria);

        parteReal = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Ingrese la parte real del primer complejo: ",
                "Parte real",
                3
        ));

        parteImaginaria = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Ingrese la parte imaginaria del segundo complejo: ",
                "Parte imaginaria",
                3
        ));

        b = new Complejo(parteReal, parteImaginaria);

        switch(opcion) {
            case 1: // suma
                a.imprimir();
                b.imprimir();
                (a.suma(b)).imprimir();
                break;
            case 2: // resta
                a.imprimir();
                b.imprimir();
                (a.resta(b)).imprimir();
                break;
            case 3: // multiplcación
                a.imprimir();
                b.imprimir();
                (a.multiplicacion(b)).imprimir();
                break;
            case 4: // división
                a.imprimir();
                b.imprimir();
                (a.division(b)).imprimir();
                break;
            case 5: // salir
                JOptionPane.showMessageDialog(
                        null,
                        "Saliendo del programa...",
                        "Saliendo",
                        3
                );
                break;

        } //fin switch(opcion)
    }
}

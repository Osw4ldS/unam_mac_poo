/*
Datos del alumno
Nombre: Osvaldo Silva Rangel
No. cta.: 4240009496
*/

package semana6.cafetera;

import javax.swing.*;

public class menuCafetera {
    public static void main(String[] args) {
        int opcioUsuario;
        int servirCantidadCafe;
        int agregarCantidadCafe;
        boolean cafeteraEncendida = true;
        boolean opcionValida = false;
        Cafetera cafetera = new Cafetera();

        JOptionPane.showMessageDialog(null, "Enciendendo cafetera...", "Cafetera", 1);
        do {
            do {
                opcioUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
                        """
                                Seleccione una opción:\
                                
                                1) Llenar cafetera\
                                
                                2) Servir café\
                                
                                3) Vaciar café\
                                
                                4) Agregar café\
                                
                                5) Apagar cafetera
                                """,
                        "Menú de opciones",
                        1));

                if (1 <= opcioUsuario && opcioUsuario <= 5) opcionValida = true;
                else JOptionPane.showMessageDialog(null, "Seleccione una opción válida.", "Aviso", 1);

            } while (!opcionValida);

            switch (opcioUsuario) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Llenando cafetera...", "Aviso", 1);
                    cafetera.llenarCafetera();
                    JOptionPane.showMessageDialog(null, "La cafetera está llena.", "Aviso", 1);
                    break;
                case 2:
                    servirCantidadCafe = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique cuánto café desea servir.", "Aviso", 1));
                    cafetera.servirCafe(servirCantidadCafe);
                    JOptionPane.showMessageDialog(null, "Se servieron " + servirCantidadCafe + " ml. cantidad de café.", "Aviso", 1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Vaciando cafetera...", "Aviso", 1);
                    cafetera.vaciarCafe();
                    JOptionPane.showMessageDialog(null, "La cafetera está vacía.", "Aviso", 1);
                    break;
                case 4:
                    agregarCantidadCafe = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique cuánto café desea agregar.", "Aviso", 1));
                    cafetera.agreagarCafe(agregarCantidadCafe);
                    JOptionPane.showMessageDialog(null, "Se aregaron " + agregarCantidadCafe + " ml. cantidad de café a la cafetera.", "Aviso", 1);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Apagando cafetera...", "Apagar cafetera", 1);
                    cafeteraEncendida = false;
                    break;
            } // fin switch(opcionUsuario)
        } while(cafeteraEncendida);
    } // fin main()
}

package semana12.frontend;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNavegacion extends JPanel implements ActionListener {
    // atributos
    private final static String SIGUIENTE = "SIGUIENTE";
    private final static String ANTERIOR = "ANTERIOR";

    // Botones
    private JButton btnSiguiente;
    private JButton btnAnterior;

    // instancia de la ventana principal
    private InterfazAplicacionCurso ventanaPrincipal;

    public PanelNavegacion(InterfazAplicacionCurso ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;

        setLayout(new FlowLayout());
        TitledBorder border = BorderFactory.createTitledBorder("Navegación");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        // Creación de los botones
        btnSiguiente = new JButton(">");
        btnAnterior = new JButton("<");

        // Agregando botones
        add(btnAnterior);
        add(btnSiguiente);
    }

    public void actionPerformed(ActionEvent e) {
        String nombreEvento = e.getActionCommand();

        if(nombreEvento.equals(SIGUIENTE)) {
            ventanaPrincipal.siguiente();
        } else {
            ventanaPrincipal.anterior();
        }
    }
}

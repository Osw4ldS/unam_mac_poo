package semana12.frontend;
import semana12.backend.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRegistro extends JPanel implements ActionListener{
    // atributos
    private final static String REGISTRAR_CURSO = "REGISTRAR CURSO";
    private final static String ELIMINAR_CURSO = "ELIMINAR CURSO";
    private final static String REGISTRAR_TUTOR = "REGISTRAR TUTOR";
    private final static String ELIMINAR_TUTOR = "ELIMINAR TUTOR";

    // etiqueta y lista desplegable para el curso
    private JLabel lbCurso;
    private JComboBox<Curso> cbCurso;

    // etiqueta y lista desplegable para el tutor
    private JLabel lbTutor;
    private JComboBox<Profesor> cbTutor;

    // botones
    private JButton btnRegistrarCurso;
    private JButton btnEliminarCurso;
    private JButton btnRegistrarTutor;
    private JButton btnEliminarTutor;

    // instancia de la ventana principal
    private InterfazAplicacionCurso ventanaPrincipal;

    public PanelRegistro(InterfazAplicacionCurso ventaPrincipal) {
        this.ventanaPrincipal = ventaPrincipal;

        setLayout(null);

        TitledBorder border = BorderFactory.createTitledBorder("Registro a cursos");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        // creación de todas las etiquetas
        lbCurso = new JLabel("Curso: ");
        lbTutor = new JLabel("Tutor: ");

        // creación de las listas desplegables
        cbCurso = new JComboBox();
        /*cbCurso.addItem("CURSO 1");
        cbCurso.addItem("CURSO 2");
        cbCurso.addItem("CURSO 3");
        cbCurso.addItem("CURSO 4");*/

        cbTutor = new JComboBox();
        /*cbTutor.addItem("TUTOR 1");
        cbTutor.addItem("TUTOR 2");
        cbTutor.addItem("TUTOR 3");*/

        // creación de botones
        btnRegistrarCurso = new JButton("Registrar Curso");
        btnRegistrarCurso.setActionCommand(REGISTRAR_CURSO);
        btnRegistrarCurso.addActionListener(this);

        btnEliminarCurso = new JButton("Eliminar Curso");
        btnEliminarCurso.setActionCommand(ELIMINAR_CURSO);
        btnRegistrarCurso.addActionListener(this);

        btnRegistrarTutor = new JButton("Registrar Tutor");
        btnRegistrarTutor.setActionCommand(REGISTRAR_TUTOR);
        btnRegistrarCurso.addActionListener(this);

        btnEliminarTutor = new JButton("Eliminar tutor");
        btnEliminarTutor.setActionCommand(ELIMINAR_TUTOR);
        btnRegistrarCurso.addActionListener(this);

        // posición para cada objeto, etiqueta, lista desplegable y botones
        lbCurso.setBounds(5, 50, 50, 20);
        cbCurso.setBounds(60, 50, 200, 20);
        lbTutor.setBounds(5, 100, 500, 20);
        cbTutor.setBounds(60, 100, 200, 20);

        btnRegistrarCurso.setBounds(10, 150, 140, 20);
        btnEliminarCurso.setBounds(160, 150, 140, 20);
        btnRegistrarTutor.setBounds(310, 150, 140, 20);
        btnEliminarTutor.setBounds(460, 150, 140, 20);

        // se agregan las etiquetas y las listas desplegables al panel
        add(lbCurso);
        add(cbCurso);
        add(lbTutor);
        add(cbTutor);
        add(btnRegistrarCurso);
        add(btnEliminarCurso);
        add(btnRegistrarTutor);
        add(btnEliminarTutor);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nombreEvento = e.getActionCommand();

        if(nombreEvento.equals(REGISTRAR_CURSO)) {
            Curso curso = (Curso) cbCurso.getSelectedItem();
            ventanaPrincipal.agregaCurso(curso);
        } else if(nombreEvento.equals(ELIMINAR_CURSO)) {
            ventanaPrincipal.borrarCurso();
        } else if(nombreEvento.equals(REGISTRAR_TUTOR)) {
            Profesor profesor = (Profesor) cbTutor.getSelectedItem();
        } else if(nombreEvento.equals(ELIMINAR_CURSO)) {
            Profesor profesor = (Profesor) cbTutor.getSelectedItem();
            ventanaPrincipal.borrarTutor();
        }

        }

}

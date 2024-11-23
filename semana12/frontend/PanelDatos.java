package semana12.frontend;
import semana12.backend.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.text.SimpleDateFormat;

public class PanelDatos extends JPanel {
    // atributos del panel

    // Etiquetas (JLabel) y zonas de texto (JTextField):
    // nombre
    private JLabel lbNombre;
    private JTextField txtNombre;

    // apellido paterno
    private JLabel lbApPaterno;
    private JTextField txtApPaterno;

    // apellido materno
    private JLabel lbApMaterno;
    private JTextField txtApMaterno;

    // fecha de nacimiento
    private JLabel lbFechaNac;
    private JTextField txtFechaNac;

    // género
    private JLabel lbGenero;
    private JTextField txtGenero;

    // etiqueta para mostrar la imagen
    private JLabel lbImagen;

    public PanelDatos() {
        setLayout(new BorderLayout());

        TitledBorder border = BorderFactory.createTitledBorder("Datos Alumno");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        // Paneles de la info. del alumno
        JPanel panelDatosAlumno = new JPanel();
        JPanel panelFotoAlumno = new JPanel();

        // agregar los paneles al panel de Datos
        add(panelDatosAlumno, BorderLayout.CENTER);
        add(panelFotoAlumno, BorderLayout.EAST);

        // creación de las etiquetas
        lbNombre = new JLabel("Nombre: ");
        lbApPaterno = new JLabel("Apellido paterno: ");
        lbApMaterno = new JLabel("Apellido materno: ");
        lbGenero = new JLabel("Sexo: ");
        lbFechaNac = new JLabel("Fecha de Nacimiento: ");

        // creación y config. de la zona de texto para nombre
        txtNombre = new JTextField();
        txtNombre.setEditable(false);
        txtNombre.setBackground(Color.lightGray);
        txtNombre.setForeground(Color.blue);

        // creación y config. de la zona de texto para ap. paterno
        txtApPaterno = new JTextField();
        txtApPaterno.setEditable(false);
        txtApPaterno.setBackground(Color.lightGray);
        txtApPaterno.setForeground(Color.blue);

        // creación y config. de la zona de texto para ap. materno
        txtApMaterno = new JTextField();
        txtApMaterno.setEditable(false);
        txtApMaterno.setBackground(Color.lightGray);
        txtApMaterno.setForeground(Color.blue);

        // creación y config. de la zona de texto para género
        txtGenero = new JTextField();
        txtGenero.setEditable(false);
        txtGenero.setBackground(Color.lightGray);
        txtGenero.setForeground(Color.blue);

        // creación y config. de la zona de texto para fecha de nacimiento
        txtFechaNac = new JTextField();
        txtFechaNac.setEditable(false);
        txtFechaNac.setBackground(Color.lightGray);
        txtFechaNac.setForeground(Color.blue);

        // distribuidor gráfico
        panelDatosAlumno.setLayout(new GridLayout(7,2));

        // se agregan las etiquetas y las cajas de texto al panelDatosAlumno
        panelDatosAlumno.add(lbNombre);
        panelDatosAlumno.add(txtNombre);
        panelDatosAlumno.add(lbApPaterno);
        panelDatosAlumno.add(txtApPaterno);
        panelDatosAlumno.add(lbApMaterno);
        panelDatosAlumno.add(txtApMaterno);
        panelDatosAlumno.add(lbGenero);
        panelDatosAlumno.add(txtGenero);
        panelDatosAlumno.add(lbFechaNac);
        panelDatosAlumno.add(txtFechaNac);

        // crea etiqueta para mostrar foto
        lbImagen = new JLabel("FOTO ALUMNO");

        // agrega al panel de foto la etiqueta
        panelFotoAlumno.add(lbImagen);
    }

    public void actualizarPanel(Alumno alumno) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        txtNombre.setText(alumno.getNombre());
        txtApPaterno.setText(alumno.getApPaterno());
        txtApMaterno.setText(alumno.getApMaterno());
        txtGenero.setText(alumno.getGenero().toString());
        txtFechaNac.setText(sdf.format(alumno.getFechaNacimiento()));

    }

}

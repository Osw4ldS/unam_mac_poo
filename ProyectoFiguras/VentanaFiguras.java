package ProyectoFiguras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class VentanaFiguras extends JFrame implements ActionListener
{
    private JMenuItem cuadradoItem;
    private JMenuItem circuloItem;
    private JMenuItem rectanguloItem;
    private JMenuItem trianguloItem;
    private VentanaCuadrado ventanaCuadrado;
    private VentanaCirculo ventanaCirculo;
    private VentanaRectangulo ventanaRectangulo;
    private VentanaTriangulo ventanaTriangulo;

    public VentanaFiguras() {

        this.setTitle("Menu");
        this.setSize(400,450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        iniciarComponentes();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void iniciarComponentes()
    {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Creamos el degradado
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(0, 0, Color.ORANGE, getWidth(), getHeight(), Color.RED);
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight()); // Rellenamos el panel con el degradado
            }
        };
    panel.setLayout(null); 
    this.getContentPane().add(panel); 

    JMenuBar menuBar = new JMenuBar();

    
    JMenu archivoMenu = new JMenu("Figuras");

    
    circuloItem = new JMenuItem("Circulo");
    cuadradoItem = new JMenuItem("Cuadrado");
    rectanguloItem = new JMenuItem("Rectangulo");
    trianguloItem = new JMenuItem("Triangulo");

    
    circuloItem.addActionListener(this);
    cuadradoItem.addActionListener(this);
    rectanguloItem.addActionListener(this);
    trianguloItem.addActionListener(this);

    
    archivoMenu.add(circuloItem);
    archivoMenu.add(cuadradoItem);
    archivoMenu.add(rectanguloItem);
    archivoMenu.add(trianguloItem);

        
    menuBar.add(archivoMenu);

    menuBar.setBounds(0, 0, this.getWidth(), 25);
    panel.add(menuBar);
}

  //implementar el Action listener
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource() == cuadradoItem) {
            ventanaCuadrado= new VentanaCuadrado();
            ventanaCuadrado.setVisible(true);
            dispose(); //Cerrar ventana actual
        }
       
        else if (e.getSource() == circuloItem) {
            ventanaCirculo= new VentanaCirculo();
            ventanaCirculo.setVisible(true);
            dispose(); //Cerrar ventana actual
        }
       
        else if (e.getSource() == rectanguloItem) {
            ventanaRectangulo= new VentanaRectangulo();
            ventanaRectangulo.setVisible(true);
            dispose();
        }
        else if (e.getSource() == trianguloItem) {
            ventanaTriangulo= new VentanaTriangulo();
            ventanaTriangulo.setVisible(true);
            dispose();
        }
    }
}



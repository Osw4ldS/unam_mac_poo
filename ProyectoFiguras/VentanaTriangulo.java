package ProyectoFiguras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VentanaTriangulo extends JFrame {
    private JPanel panel;
    private JTextField baseTextField, alturaTextField, ladoTextField, areaTextField, perimetroTextField;
    private JButton calcularButton, borrarButton;
    private JButton botonRegresar;
    private VentanaFiguras ventanaFiguras;

    public VentanaTriangulo() {
        this.setTitle("Triángulo");
        this.setSize(400, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        iniciarComponentes();
        this.getContentPane().add(panel);
        panel.add(botonRegresar);
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;

                // Cambiar colores del degradado
                GradientPaint fondo = new GradientPaint(0, 0, Color.CYAN, getWidth(), getHeight(), Color.MAGENTA);
                g2.setPaint(fondo);
                g2.fillRect(0, 0, getWidth(), getHeight());

                // Dibujar el triángulo
                g2.setColor(Color.PINK.darker());
                g2.setStroke(new BasicStroke(3)); // Línea más gruesa
                int[] x = {100, 150, 50};
                int[] y = {50 + 220, 150 + 220, 150 + 220};
                Polygon p = new Polygon(x, y, 3);
                g2.drawPolygon(p);

                // Relleno con color semitransparente
                g2.setColor(new Color(255, 20, 147, 50));
                g2.fillPolygon(p);

                // Dibujar valores de los lados
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("Arial", Font.BOLD, 14)); // Fuente ligeramente reducida
                g2.drawString("Base: " + baseTextField.getText(), 75, 380); // Base
                g2.drawString("Altura: " + alturaTextField.getText(), 100, 270); // Altura en el centro del triángulo
                g2.drawString("Lado: " + ladoTextField.getText(), 30, 300); // Lado izquierdo
                g2.drawString("Lado: " + ladoTextField.getText(), 130, 300); // Lado derecho
            }
        };
        panel.setLayout(null);

        botonRegresar = new JButton("Regresar");
        botonRegresar.setBounds(230, 210, 100, 30);
        botonRegresar.addActionListener(e -> {
            ventanaFiguras = new VentanaFiguras();
            ventanaFiguras.setVisible(true);
            dispose();
        });

        JLabel baseLabel = new JLabel("Base:");
        baseLabel.setBounds(10, 10, 80, 30);
        panel.add(baseLabel);

        baseTextField = new JTextField();
        baseTextField.setBounds(100, 10, 80, 30);
        panel.add(baseTextField);

        JLabel alturaLabel = new JLabel("Altura:");
        alturaLabel.setBounds(10, 50, 80, 30);
        panel.add(alturaLabel);

        alturaTextField = new JTextField();
        alturaTextField.setBounds(100, 50, 80, 30);
        panel.add(alturaTextField);

        JLabel ladoLabel = new JLabel("Lado:");
        ladoLabel.setBounds(10, 90, 80, 30);
        panel.add(ladoLabel);

        ladoTextField = new JTextField();
        ladoTextField.setBounds(100, 90, 80, 30);
        panel.add(ladoTextField);

        JLabel areaLabel = new JLabel("Área:");
        areaLabel.setBounds(10, 130, 80, 30);
        panel.add(areaLabel);

        areaTextField = new JTextField();
        areaTextField.setBounds(100, 130, 80, 30);
        areaTextField.setEditable(false);
        panel.add(areaTextField);

        JLabel perimetroLabel = new JLabel("Perímetro:");
        perimetroLabel.setBounds(10, 170, 80, 30);
        panel.add(perimetroLabel);

        perimetroTextField = new JTextField();
        perimetroTextField.setBounds(100, 170, 80, 30);
        perimetroTextField.setEditable(false);
        panel.add(perimetroTextField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 210, 100, 30);
        calcularButton.addActionListener(e -> {
            try {
                double base = Double.parseDouble(baseTextField.getText());
                double altura = Double.parseDouble(alturaTextField.getText());
                double lado = Double.parseDouble(ladoTextField.getText());

                double areaTriangulo = base * altura / 2;
                double perimetroTriangulo = (lado * 2) + base;

                areaTextField.setText(Double.toString(areaTriangulo));
                perimetroTextField.setText(Double.toString(perimetroTriangulo));

                panel.repaint(); // Actualizar el panel para redibujar el triángulo
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
            }
        });
        panel.add(calcularButton);

        borrarButton = new JButton("Borrar");
        borrarButton.setBounds(120, 210, 100, 30);
        borrarButton.addActionListener(e -> {
            baseTextField.setText("");
            alturaTextField.setText("");
            ladoTextField.setText("");
            areaTextField.setText("");
            perimetroTextField.setText("");
            panel.repaint(); // Actualizar el dibujo
        });
        panel.add(borrarButton);
    }
}
package ProyectoFiguras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VentanaCirculo extends JFrame {
    private JPanel panel;
    private JTextField radioTextField, areaTextField, perimetroTextField;
    private JButton calcularButton, borrarButton;
    private JButton botonRegresar;
    private VentanaFiguras ventanaFiguras;

    public VentanaCirculo() {
        this.setTitle("Círculo");
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
                GradientPaint fondo = new GradientPaint(0, 0, Color.RED, getWidth(), getHeight(), Color.YELLOW);

                g2.setPaint(fondo);
                g2.fillRect(0, 0, getWidth(), getHeight());

                // Dibujar el círculo
                g2.setColor(Color.BLUE.darker());
                g2.setStroke(new BasicStroke(3)); // Línea más gruesa
                int radio = 100;
                int x = 100, y = 180;
                g2.drawOval(x, y, 2 * radio, 2 * radio);

                // Relleno con color semitransparente
                g2.setColor(new Color(0, 0, 255, 50));
                g2.fillOval(x, y, 2 * radio, 2 * radio);

                // Dibujar valores del radio, área y perímetro
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("Arial", Font.BOLD, 14)); // Fuente ligeramente reducida
                g2.drawString("Radio: " + radioTextField.getText(), x + radio - 25, y - 10); // Superior
                g2.drawString("Área: " + areaTextField.getText(), x + radio - 25, y + 2 * radio + 20); // Inferior
                g2.drawString("Perímetro: " + perimetroTextField.getText(), x + radio - 25, y + radio); // Dentro del círculo
            }
        };
        panel.setLayout(null);

        botonRegresar = new JButton("Regresar");
        botonRegresar.setBounds(240, 130, 100, 30);
        botonRegresar.addActionListener(e -> {
            ventanaFiguras = new VentanaFiguras();
            ventanaFiguras.setVisible(true);
            dispose();
        });

        JLabel radioLabel = new JLabel("Radio:");
        radioLabel.setBounds(10, 10, 80, 30);
        panel.add(radioLabel);

        radioTextField = new JTextField();
        radioTextField.setBounds(100, 10, 80, 30);
        panel.add(radioTextField);

        JLabel areaLabel = new JLabel("Área:");
        areaLabel.setBounds(10, 50, 80, 30);
        panel.add(areaLabel);

        areaTextField = new JTextField();
        areaTextField.setBounds(100, 50, 80, 30);
        areaTextField.setEditable(false);
        panel.add(areaTextField);

        JLabel perimetroLabel = new JLabel("Perímetro:");
        perimetroLabel.setBounds(10, 90, 80, 30);
        panel.add(perimetroLabel);

        perimetroTextField = new JTextField();
        perimetroTextField.setBounds(100, 90, 80, 30);
        perimetroTextField.setEditable(false);
        panel.add(perimetroTextField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 130, 100, 30);
        calcularButton.addActionListener(e -> {
            try {
                double radio = Double.parseDouble(radioTextField.getText());

                double areaCirculo = Math.PI * Math.pow(radio, 2);
                double perimetroCirculo = 2 * Math.PI * radio;

                areaTextField.setText(Double.toString(areaCirculo));
                perimetroTextField.setText(Double.toString(perimetroCirculo));

                panel.repaint(); // Actualizar el panel para redibujar el círculo
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
            }
        });
        panel.add(calcularButton);

        borrarButton = new JButton("Borrar");
        borrarButton.setBounds(120, 130, 100, 30);
        borrarButton.addActionListener(e -> {
            radioTextField.setText("");
            areaTextField.setText("");
            perimetroTextField.setText("");
            panel.repaint(); // Actualizar el dibujo
        });
        panel.add(borrarButton);
    }
}
package ProyectoFiguras;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class VentanaRectangulo extends JFrame {
    private JPanel panel;
    private JTextField baseTextField, alturaTextField, areaTextField, perimetroTextField;
    private JButton calcularButton, borrarButton;
    private JButton botonRegresar;
    private VentanaFiguras ventanaFiguras;

    public VentanaRectangulo() {
        this.setTitle("Rectángulo");
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

                // Cambiar el tipo de degradado
                GradientPaint fondo = new GradientPaint(0, 0, Color.CYAN, getWidth(), getHeight(), Color.MAGENTA);
                g2.setPaint(fondo);
                g2.fillRect(0, 0, getWidth(), getHeight());

                // Obtener los valores de base y altura
                int base = 200;
                int altura = 100;

                // Dibujar el rectángulo
                g2.setColor(Color.RED);
                g2.setStroke(new BasicStroke(3)); // Línea más gruesa
                int x = (getWidth() - base) / 2 + 20; // Mover un poco a la derecha
                int y = (getHeight() - altura) / 2; // Centrar verticalmente
                g2.drawRect(x, y, base, altura);

                // Relleno del rectángulo con color semitransparente
                g2.setColor(new Color(255, 0, 0, 50));
                g2.fillRect(x, y, base, altura);

                // Agregar los valores de la base y altura en los lados correspondientes
                g2.setColor(Color.BLACK); // Color del texto
                g2.setFont(new Font("Arial", Font.BOLD, 14)); // Fuente para el texto

                // Base en la parte inferior
                g2.drawString("Base: " + baseTextField.getText(), x + base / 2 - 25, y + altura + 20);

                // Altura en el lado izquierdo
                g2.drawString("Altura: " + alturaTextField.getText(), x - 50, y + altura / 2 + 5);

                // Base en la parte superior
                g2.drawString("Base: " + baseTextField.getText(), x + base / 2 - 25, y - 10);

                // Altura en el lado derecho
                g2.drawString("Altura: " + alturaTextField.getText(), x + base + 10, y + altura / 2 + 5);
            }
        };

        panel.setLayout(null); // Desactivar diseño de componentes

        botonRegresar = new JButton("Regresar");
        botonRegresar.setBounds(240, 170, 100, 30);
        botonRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaFiguras = new VentanaFiguras();
                ventanaFiguras.setVisible(true);
                dispose(); // Cerrar ventana actual
            }
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

        JLabel areaLabel = new JLabel("Área:");
        areaLabel.setBounds(10, 90, 80, 30);
        panel.add(areaLabel);

        areaTextField = new JTextField();
        areaTextField.setBounds(100, 90, 80, 30);
        areaTextField.setEditable(false);
        panel.add(areaTextField);

        JLabel perimetroLabel = new JLabel("Perímetro:");
        perimetroLabel.setBounds(10, 130, 80, 30);
        panel.add(perimetroLabel);

        perimetroTextField = new JTextField();
        perimetroTextField.setBounds(100, 130, 80, 30);
        perimetroTextField.setEditable(false);
        panel.add(perimetroTextField);

        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 170, 100, 30);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener los valores de base y altura
                double base = Double.parseDouble(baseTextField.getText());
                double altura = Double.parseDouble(alturaTextField.getText());

                // Calcular área y perímetro
                double areaRectangulo = base * altura;
                double perimetroRectangulo = (base * 2) + (altura * 2);

                // Mostrar los resultados
                areaTextField.setText(Double.toString(areaRectangulo));
                perimetroTextField.setText(Double.toString(perimetroRectangulo));
                repaint(); // Re-pintar la ventana para actualizar los valores mostrados
            }
        });
        panel.add(calcularButton);

        borrarButton = new JButton("Borrar");
        borrarButton.setBounds(120, 170, 100, 30);
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpiar los campos de texto
                baseTextField.setText("");
                alturaTextField.setText("");
                areaTextField.setText("");
                perimetroTextField.setText("");
                repaint(); // Re-pintar la ventana para eliminar los valores
            }
        });
        panel.add(borrarButton);
    }
}

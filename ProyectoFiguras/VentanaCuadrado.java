package ProyectoFiguras;

import javax.swing.*;
import java.awt.*;

public class VentanaCuadrado extends JFrame {
    private JPanel panel;
    private JTextField ladoTextField, areaTextField, perimetroTextField;
    private JButton calcularButton, borrarButton, botonRegresar;
    private VentanaFiguras ventanaFiguras;
    private int lado = 100; // Tamaño inicial del cuadrado

    public VentanaCuadrado() {
        this.setTitle("Cuadrado");
        this.setSize(400, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        iniciarComponentes();
        this.getContentPane().add(panel);
        this.setVisible(true);
    }

    private void iniciarComponentes() {
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;

                // Cambiar colores del degradado
                GradientPaint fondo = new GradientPaint(0, 0, Color.ORANGE, getWidth(), getHeight(), Color.PINK);
                g2.setPaint(fondo);
                g2.fillRect(0, 0, getWidth(), getHeight());

                // Dibujar el cuadrado
                g2.setColor(Color.GREEN.darker());
                g2.setStroke(new BasicStroke(3)); // Línea más gruesa
                int x = 105, y = 205, size = 180; // Coordenadas originales
                g2.drawRect(x, y, size, size);

                // Relleno con color semitransparente
                g2.setColor(new Color(0, 255, 0, 50));
                g2.fillRect(x, y, size, size);

                // Dibujar valores de los lados
                g2.setColor(Color.BLACK);
                g2.setFont(new Font("Arial", Font.BOLD, 14)); // Fuente ligeramente reducida
                g2.drawString("Lado: " + lado, x + size / 2 - 25, y - 5); // Superior
                g2.drawString("Lado: " + lado, x + size / 2 - 25, y + size + 20); // Inferior
                g2.drawString("Lado: " + lado, x - 60, y + size / 2 + 5); // Izquierdo
                g2.drawString("Lado: " + lado, x + size + 10, y + size / 2 + 5); // Derecho
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
        panel.add(botonRegresar);

        JLabel ladoLabel = new JLabel("Lado:");
        ladoLabel.setBounds(10, 10, 80, 30);
        panel.add(ladoLabel);

        ladoTextField = new JTextField();
        ladoTextField.setBounds(100, 10, 80, 30);
        panel.add(ladoTextField);

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
                // Obtener el valor del lado
                lado = Integer.parseInt(ladoTextField.getText());

                // Calcular el área y el perímetro
                int areaCuadrado = lado * lado;
                int perimetroCuadrado = 4 * lado;

                // Mostrar los resultados en los campos correspondientes
                areaTextField.setText(Integer.toString(areaCuadrado));
                perimetroTextField.setText(Integer.toString(perimetroCuadrado));

                // Actualizar el panel para redibujar el cuadrado
                panel.repaint();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido.");
            }
        });
        panel.add(calcularButton);

        borrarButton = new JButton("Borrar");
        borrarButton.setBounds(120, 130, 100, 30);
        borrarButton.addActionListener(e -> {
            ladoTextField.setText("");
            areaTextField.setText("");
            perimetroTextField.setText("");
            lado = 100; // Resetear el tamaño a un valor por defecto
            panel.repaint(); // Actualizar el dibujo
        });
        panel.add(borrarButton);
    }
}

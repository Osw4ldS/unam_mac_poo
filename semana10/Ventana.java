import java.awt.*;
import javax.swing.JPanel;
import java.util.Random;

public class Ventana extends JPanel {

    // Colores constantes
    private static final Color COLOR_FONDO = new Color(48, 19, 65);
    private static final Color COLOR_LINEAS = new Color(47, 20, 63);
    private static final Color COLOR_BLANCO = new Color(255, 250, 244);
    private static final Color COLOR_MORADO_SECUNDARIO= new Color(63, 34, 74);
    private static final Color COLOR_MORADO_PRINCIPAL = new Color(72, 34, 85);
    private static final Color COLOR_CALABAZA_PRINCIPAL = new Color(204, 118, 101);
    private static final Color COLOR_CALABAZA_SECUNDARIO = new Color(237, 179, 139);
    private static final Color COLOR_EXTRA = new Color(255, 241, 205);

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
             
        dibujarFondo(g); // Dibujar Fondo general
        dibujarLineasFondo(g); // Dibujar Líneas horizontales del fondo
        dibujarEstrellas(g, 500); // Dibujar Estrellas       
        dibujarLuna(g); // Dibujar la luna     
        dibujarMontanas(g); // DibujarMontañas              
        dibujarSueloYDetalles(g); // Dibujar Suelo y detalles       
        dibujarCalabaza(g); // Dibujar Calabaza
    }

    private void dibujarFondo(Graphics g)  // Dibujar el fondo del cielo
    {
        g.setColor(COLOR_FONDO);
        g.fillRect(0, 0, 800, 800);
    }
    
    private void dibujarLineasFondo(Graphics g) // Dibujar las líneas horizontales del fondo
    {
        g.setColor(COLOR_LINEAS);
        for (int i = 0; i < 800; i += 8)
        {
            g.fillRect(1, i, 800, 2);
        }
    }

    private void dibujarEstrellas(Graphics g, int cantidad) // Dibujar las estrellas
    {
        Random random = new Random();
        g.setColor(COLOR_BLANCO);
        for (int k = 0; k < cantidad; k++)
        {
            int x = random.nextInt(800);
            int y = random.nextInt(395);
            dibujarEstrella(g, x, y);
        }
    }

    private void dibujarEstrella(Graphics g, int x, int y) // Método auxiliar para dibujar una estrella
    {
        int[][] coordenadas =
        {
            {0, 0}, {-3, 0}, {-2, 0}, {-1, 0}, {1, 0}, {2, 0},
            {3, 0}, {0, -1}, {0, -2}, {0, -3}, {0, 1}, {0, 2},
            {0, 3}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
        };
        for (int[] c : coordenadas)
        {
            g.fillRect(x + c[0], y + c[1], 1, 1);
        }
    }

    private void dibujarLuna(Graphics g)
    {
        g.setColor(COLOR_MORADO_PRINCIPAL); // Aro de luz exterior
        g.fillOval(300, 0, 300, 300);
    
        g.setColor(COLOR_FONDO); // Límite de la luna
        g.fillOval(310, 10, 280, 280);
    
        Random random = new Random();
        int centerX = 320 + 130; // Centro en X (320 + radio/2)
        int centerY = 20 + 130;  // Centro en Y (20 + radio/2)
        int radio = 130;          // Radio del círculo interior
    
        // Recorrer cada pixel dentro del área delimitada por el rectángulo que contiene la luna
        for (int x = 320; x < 320 + 260; x++)
        {
            for (int y = 20; y < 20 + 260; y++)
            {
                // Verificar si el pixel (x, y) está dentro del círculo de radio 130
                if (Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2) <= Math.pow(radio, 2))
                {
                    // Asignar aleatoriamente uno de los dos colores
                    if (random.nextBoolean())
                    {
                        g.setColor(COLOR_BLANCO);
                    }
                    else
                    {
                        g.setColor(COLOR_EXTRA);
                    }
                    g.fillRect(x, y, 1, 1); // Dibujar pixel individual
                }
            }
        }
    }
    

    private void dibujarMontanas(Graphics g) // Dibujar las montañas
    {
        g.setColor(COLOR_MORADO_SECUNDARIO);

        // Montaña trasera izquierda
        int[] Mt1xPoints = {180, 240, 300, 340, 380, 180};
        int[] Mt1yPoints = {280, 260, 300, 320, 400, 400};
        g.fillPolygon(Mt1xPoints, Mt1yPoints, Mt1xPoints.length);

        // Montaña trasera derecha
        int[] Mt2xPoints = {450, 470, 500, 520, 540, 550, 600, 625, 655, 800};
        int[] Mt2yPoints = {400, 380, 360, 330, 310, 300, 275, 250, 235, 400};
        g.fillPolygon(Mt2xPoints, Mt2yPoints, Mt2xPoints.length);

        g.setColor(COLOR_MORADO_PRINCIPAL);

        // Montaña grande izquierda
        int[] M1xPoints = {0, 50, 123, 127, 131, 175, 250, 350, 400, 100, 0};
        int[] M1yPoints = {230, 200, 230, 240, 230, 230, 300, 400, 460, 400, 400};
        g.fillPolygon(M1xPoints, M1yPoints, M1xPoints.length);

        // Montaña grande derecha
        int[] M2xPoints = {400, 520, 550, 580, 620, 670, 700, 735, 760, 800, 760, 700, 600, 400};
        int[] M2yPoints = {390, 380, 340, 310, 290, 240, 220, 240, 260, 420, 460, 440, 430, 460};
        g.fillPolygon(M2xPoints, M2yPoints, M2xPoints.length);
    }
    
    private void dibujarSueloYDetalles(Graphics g) // Dibujar el suelo y detalles
    {
        g.setColor(COLOR_MORADO_PRINCIPAL);
        g.fillOval(100, 490, 600, 160);

        g.setColor(COLOR_FONDO);
        g.fillOval(130, 525, 540, 124);
    }

    private void dibujarCalabaza(Graphics g) // Dibujar Calabaza
    {

        // Dibujar las secciones de la calabaza con diferentes tonos
        g.setColor(COLOR_CALABAZA_PRINCIPAL);
        g.fillOval(250, 350, 300, 220); // Sección central

        g.setColor(COLOR_CALABAZA_SECUNDARIO);
        g.fillOval(325, 380, 50, 90);  // Sección izquierda
        g.fillOval(425, 380, 50, 90);  // Sección derecha

        int[] xPoints = {325,325,345,345,365,365,385,385,405,405,425,425,445,445,465,465,435,355};
        int[] yPoints = {520,510,490,510,510,495,495,510,510,495,495,510,510,490,510,520,540,540};
        g.fillPolygon(xPoints, yPoints, xPoints.length);
        
        g.setColor(COLOR_BLANCO);
        g.drawArc(50, 50, 100, 100, 1, 360);

        g.setColor(new Color(0,255,0));
        g.drawLine(50, 50, 51, 51);
        g.drawArc(1,1 ,1 ,1 ,1 ,1 );

        /* //Dibujar el tallo de la calabaza
        g.setColor(COLOR_MORADO_PRINCIPAL);
        g.fillRect(315, 340, 20, 30); // Tallo*/

        // Dibujar contorno alrededor de la calabaza
        g.setColor(COLOR_LINEAS);
        g.drawPolygon(xPoints, yPoints, xPoints.length);
        g.drawOval(250, 350, 300, 220); // Contorno central
        g.drawOval(325, 380, 50, 90);   // Contorno izquierdo
        g.drawOval(425, 380, 50, 90);   // Contorno derecho
    }
}
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Oscuro");

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);       
        frame.setSize(800, 800);       
        frame.setLocationRelativeTo(null);      
        frame.add(new Ventana());
        frame.setVisible(true);
    }
}
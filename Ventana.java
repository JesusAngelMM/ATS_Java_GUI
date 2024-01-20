import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Este es un Titulo"); 
        //setLocation(100, 200);
        //setBounds(100, 200, 500, 500);
        setLocationRelativeTo(null);  // Establecer en el centro
        setResizable(false);  // Deshabilita la capacidad de redimensionar la ventana
        setMinimumSize(new Dimension(200, 200));  // Establece el tamaño mínimo de la ventana
        getContentPane().setBackground(Color.BLACK);  // Establece el color de fondo de la ventana
    }
}
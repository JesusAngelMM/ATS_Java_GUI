import javax.swing.JFrame;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Este es un Titulo"); 
        //setLocation(100, 200);
        //setBounds(100, 200, 500, 500);
        setLocationRelativeTo(null); // Establece la posición en el centro de la pantalla
    }
}
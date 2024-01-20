import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Este es un Titulo"); 
        setLocationRelativeTo(null); 
        setMinimumSize(new Dimension(200, 200));  
        getContentPane().setBackground(Color.BLACK);

        iniciarComponentes();  //Colocamos sobre la Ventana
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();  //Creamos el panel
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);  //Agregamos el panel
    }
}
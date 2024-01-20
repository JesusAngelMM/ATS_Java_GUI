import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setTitle("Este es un Titulo"); 
        setLocationRelativeTo(null); 
        setMinimumSize(new Dimension(200, 200));  
        //getContentPane().setBackground(Color.BLACK);

        iniciarComponentes();  //Colocamos sobre la Ventana
    }
    private void iniciarComponentes(){
        JPanel panel = new JPanel();  //Creamos el panel
        //panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);  //Agregamos el panel
        panel.setLayout(null);  //Desactivamos el diseño

        JLabel etiqueta = new JLabel();  //Creamos una etiqueta
        etiqueta.setText("Hola");  //Establecemos el texto de la etiqueta
        etiqueta.setBounds(10, 10, 50, 30);  //Modificamos ubicación

        panel.add(etiqueta);  //Agregamos la etiqueta al panel
    }
}
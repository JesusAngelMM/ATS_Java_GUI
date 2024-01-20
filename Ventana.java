import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);  //Agregamos el panel
        panel.setLayout(null);  //Desactivamos el diseño por defecto

        JLabel etiqueta = new JLabel();  //Creamos una etiqueta
        etiqueta.setText("Mundial 2018");  //Establecemos el texto de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);  //Alineamos
        etiqueta.setBounds(85, 10, 300, 80);  //Modificamos ubicación
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setOpaque(true);  //Damos permiso de pintar la etiqueta
        etiqueta.setBackground(Color.BLACK);  //Pintamos
        etiqueta.setFont(new Font("Arial", Font.ITALIC, 20));   //Establecemos la fuente del texto
        panel.add(etiqueta);  //Agregamos la etiqueta al panel

        //Etiqueta 2 - Etiqueta tipo imagen
        JLabel etiquetaImg = new JLabel(new ImageIcon("imagen.jpg"));
        etiquetaImg.setBounds(10, 100, 512, 640);

        panel.add(etiquetaImg);

    }
}
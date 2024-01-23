import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    public JPanel panel = new JPanel();

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
        colocarPaneles();
        //colocarEtiquetas();
        colocarBotones();
        
    }
    private void colocarPaneles(){
        panel = new JPanel();  //Creamos el panel
        panel.setBackground(Color.BLACK);
        this.getContentPane().add(panel);  //Agregamos el panel
        panel.setLayout(null);  //Desactivamos el diseño por defecto
    }
    private void colocarEtiquetas(){
        //Etiqueta 1 - etiqueta tipo texto
        JLabel etiqueta = new JLabel();  //Creamos una etiqueta
        etiqueta.setText("Mundial 2018");  //Establecemos el texto de la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);  //Alineamos
        etiqueta.setBounds(150, 10, 150, 40);  //Modificamos ubicación
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setOpaque(true);  //Damos permiso de pintar la etiqueta
        etiqueta.setBackground(Color.BLACK);  //Pintamos
        etiqueta.setFont(new Font("Arial", Font.ITALIC, 20));   //Establecemos la fuente del texto

        panel.add(etiqueta);  //Agregamos la etiqueta al panel

        //Etiqueta 2 - Etiqueta tipo imagen
        ImageIcon imagen = new ImageIcon("imagen.jpg");
        JLabel etiquetaImg = new JLabel();
        etiquetaImg.setBounds(90, 80, 300, 300);
        etiquetaImg.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImg.getWidth(), etiquetaImg.getHeight(), Image.SCALE_SMOOTH)));

        panel.add(etiquetaImg);
    }
    private void colocarBotones(){
        JButton boton1 = new JButton();  // Crear un botón
    
        boton1.setText("Click");  // Establecer un texto al botón
        boton1.setBounds(100, 100, 100, 40);  // Tamaño y posición
        boton1.setEnabled(true);  // Habilitar o deshabilitar el botón
        boton1.setMnemonic('a');  // ALT + 'a' y funciona
        boton1.setForeground(Color.BLUE);  //Establecemos el color de la letra
        boton1.setFont(new Font("arial", Font.BOLD, 20));
        
        panel.add(boton1);  // Agregar al panel
    }
}
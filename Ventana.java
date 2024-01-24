import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
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
        //Boton 1 - Boton de texto
        JButton boton1 = new JButton();  // Crear un botón
    
        boton1.setText("Click");  // Establecer un texto al botón
        boton1.setBounds(100, 100, 100, 40);  // Tamaño y posición
        boton1.setEnabled(true);  // Habilitar o deshabilitar el botón
        boton1.setMnemonic('a');  // ALT + 'a' y funciona
        boton1.setForeground(Color.BLUE);  //Establecemos el color de la letra
        boton1.setFont(new Font("arial", Font.BOLD, 20));  //Modoficar la fuente
        
        panel.add(boton1);  // Agregar al panel

        //Boton 2 - Boton de imagen
        JButton boton2 = new JButton();

        boton2.setBounds(100, 200, 100, 40);  //Tamaño y posición
        //boton2.setOpaque(true);  //Para versiones que no permiten cambiar el fondo
        ImageIcon click_Aqui = new ImageIcon("boton2.png");
        boton2.setIcon(new ImageIcon(click_Aqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        //boton2.setBackground(Color.BLUE);  //Establecemos el color de fondo

        panel.add(boton2);

        //Boton 3 - Boton de bordes
        JButton boton3 = new JButton();
        boton3.setBounds(100, 300, 110, 50);
        //boton3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        //boton3.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        boton3.setBorder(BorderFactory.createLineBorder(Color.GREEN, 4,false));

        panel.add(boton3);
    }
}
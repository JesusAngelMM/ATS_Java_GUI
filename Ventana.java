// Definición de la clase Ventana que hereda de JFrame

import javax.swing.JFrame;

public class Ventana extends JFrame {

    // Constructor de la clase Ventana
    public Ventana() {
        this.setSize(500, 500);  // Establecer el tamaño de la ventana (ancho x alto)
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Al cerrar la ventana el programa finaliza igual
        setTitle("Este es un Titulo");  //Establcemos el titulo  
    }
}
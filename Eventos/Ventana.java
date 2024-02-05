import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField caja_texto;
    private JButton boton;

    public Ventana(){
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarCajaDeTexto();
        colocarBoton();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel("Ingrese su nombre: ");
        etiqueta.setBounds(30, 10, 200, 30);
        etiqueta.setFont(new Font("arial", 1, 20));
        panel.add(etiqueta);
    }
    private void colocarCajaDeTexto(){
        caja_texto = new JTextField();
        caja_texto.setBounds(30, 50, 300, 30);
        panel.add(caja_texto);
    }
    private void colocarBoton(){
        boton = new JButton("¡Pulsa  aqui!");
        boton.setBounds(150, 100, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(30, 200, 300, 40);
        saludo.setFont(new Font("arial", 1, 20));
        panel.add(saludo);

        //Agregar un Evento de tipo ActionListener
        ActionListener oyente_Accion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae){
                //Lo que quiero que suceda
                saludo.setText("Hola " + caja_texto.getText());
            }
        };
        boton.addActionListener(oyente_Accion);
    }
}

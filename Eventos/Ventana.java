import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JTextField caja_texto;
    private JButton boton;
    private JTextArea areaTexto;

    public Ventana(){
        setBounds(50, 50, 500, 500);
        setTitle("Eventos");

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        colocarPanel();
        //colocarEtiqueta();
        //colocarCajaDeTexto();
        colocarAreaTexto();
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
    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(20, 20, 200, 300);
        panel.add(areaTexto);
    }
    private void colocarBoton(){
        boton = new JButton("¡Pulsa  aqui!");
        boton.setBounds(150, 350, 150, 40);
        boton.setFont(new Font("arial", 0, 15));
        panel.add(boton);

        saludo = new JLabel();
        saludo.setBounds(30, 200, 300, 40);
        saludo.setFont(new Font("arial", 1, 20));
        panel.add(saludo);

        //eventoOyenteDeAccion();
        eventoOyenteDeRaton();
    }
    public void eventoOyenteDeAccion(){
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
    public void eventoOyenteDeRaton(){
        //Agregando oyente de ratón - Mouse Listener
        MouseListener oyenteDeRaton = new MouseListener() { //Notese como se agregan automaticamente los métodos 
            @Override
            public void mouseClicked(MouseEvent e) { //
                //Eliminamos lo que hay dentro de los métodos
                areaTexto.append("Mouse Clicked | A dado click y soltado dentro\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //Eliminamos lo que hay dentro de los métodos
                areaTexto.append("Mouse Pressed - A dado click\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //Eliminamos lo que hay dentro de los métodos
                areaTexto.append("Mouse Released - A dado click y soltado fuera\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //Eliminamos lo que hay dentro de los métodos
                areaTexto.append("Mouse Entered | Esta dentro del area\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("Mouse Exit | A salido del area\n");
            }
        };

        
        boton.addMouseListener(oyenteDeRaton);  //Sobre el botón se va a generar el evento
    }
}
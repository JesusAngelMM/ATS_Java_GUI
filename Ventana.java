import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

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
        //colocarBotones();
        //colocarRadioBotones();
        //colocarBotonesDeActivacion();
        //colocarCajasDeTexto();
        //colocarAreasDeTexto();
        //colocarCasillasDeVerificacion();
        //colocarListasDesplegables();
        //colocarCampoDeContrasena();
        //colocarTablas();
        colocarListas();
        
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
    private void colocarRadioBotones(){
        JRadioButton radio_Boton1 = new JRadioButton("Opcion 1", false);
        radio_Boton1.setBounds(50, 100, 200, 50);
        radio_Boton1.setEnabled(true);
        radio_Boton1.setText("Programación");
        radio_Boton1.setFont(new Font("Arial", 0, 20));
        radio_Boton1.setBackground(Color.BLACK);
        radio_Boton1.setForeground(Color.WHITE);
        panel.add(radio_Boton1);

        JRadioButton radio_Boton2 = new JRadioButton("Opcion 2", false);
        radio_Boton2.setBounds(50, 150, 200, 50);
        radio_Boton2.setEnabled(true);
        radio_Boton2.setText("Matemáticas");
        radio_Boton2.setFont(new Font("Arial", 0, 20));
        radio_Boton2.setBackground(Color.BLACK);
        radio_Boton2.setForeground(Color.WHITE);
        panel.add(radio_Boton2);

        JRadioButton radio_Boton3 = new JRadioButton("Opcion 2", false);
        radio_Boton3.setBounds(50, 200, 200, 50);
        radio_Boton3.setEnabled(true);
        radio_Boton3.setText("Física");
        radio_Boton3.setFont(new Font("Arial", 0, 20));
        radio_Boton3.setBackground(Color.BLACK);
        radio_Boton3.setForeground(Color.WHITE);
        panel.add(radio_Boton3);

        ButtonGroup grupo_Radio_Botones = new ButtonGroup();
        grupo_Radio_Botones.add(radio_Boton1);
        grupo_Radio_Botones.add(radio_Boton2);
        grupo_Radio_Botones.add(radio_Boton3);

    }
    private void colocarBotonesDeActivacion(){
        JToggleButton boton_Act_1 = new JToggleButton();
        boton_Act_1.setText("Opcion 1");
        boton_Act_1.setEnabled(true);
        boton_Act_1.setBounds(50, 100, 100, 30);
        panel.add(boton_Act_1);

        JToggleButton boton_Act_2 = new JToggleButton();
        boton_Act_2.setText("Opcion 2");
        boton_Act_2.setEnabled(true);
        boton_Act_2.setBounds(50, 150, 100, 30);
        panel.add(boton_Act_2);

        JToggleButton boton_Act_3 = new JToggleButton();
        boton_Act_3.setText("Opcion 3");
        boton_Act_3.setEnabled(true);
        boton_Act_3.setBounds(50, 200, 100, 30);
        panel.add(boton_Act_3);

        ButtonGroup grupo_Botones_Act = new ButtonGroup();
        grupo_Botones_Act.add(boton_Act_1);
        grupo_Botones_Act.add(boton_Act_2);
        grupo_Botones_Act.add(boton_Act_3);
    }
    private void colocarCajasDeTexto(){
        JTextField caja_Texto_1 = new JTextField("Hola", 50);
        caja_Texto_1.setBounds(50, 50, 120, 30);
        caja_Texto_1.setText("Ingrese datos...");

        System.out.println("Texto en la caja: "+caja_Texto_1.getText());
        panel.add(caja_Texto_1);
    }
    private void colocarAreasDeTexto(){
        JTextArea area_Texto_1 = new JTextArea();
        area_Texto_1.setBounds(20, 20, 300, 200);
        area_Texto_1.setText("Escriba el texto aquí...");
        area_Texto_1.append("\nAñadiendo texto");
        area_Texto_1.setEditable(true);  //Editar contenido que ya se tiene
        
        System.out.println("El texto es: "+area_Texto_1.getText());
        panel.add(area_Texto_1);

        //Barras de desplazamiento
        JScrollPane barras_Desplazamiento = new JScrollPane(area_Texto_1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barras_Desplazamiento.setBounds(20, 20, 300, 200);
        panel.add(barras_Desplazamiento);
    }
    private void colocarCasillasDeVerificacion(){
        JCheckBox casilla_verificacion_1 = new JCheckBox("Leche", true);
        casilla_verificacion_1.setEnabled(false);
        casilla_verificacion_1.setBounds(20, 20, 100, 40);
        panel.add(casilla_verificacion_1);

        JCheckBox casilla_verificacion_2 = new JCheckBox("Galletas");
        casilla_verificacion_2.setBounds(20, 50, 100, 40);
        panel.add(casilla_verificacion_2);

        JCheckBox casilla_verificacion_3 = new JCheckBox("Yogurt");
        casilla_verificacion_3.setBounds(20, 80, 100, 40);
        panel.add(casilla_verificacion_3);

        JCheckBox casilla_verificacion_4 = new JCheckBox("Cereal");
        casilla_verificacion_4.setBounds(20, 110, 100, 40);
        panel.add(casilla_verificacion_4);

    }
    private void colocarListasDesplegables(){
        /*String[] paises = {"Peru", "Colombia", "Paraguay", "Ecuador"};

        JComboBox lista_Desplegable = new JComboBox(paises);
        lista_Desplegable.setBounds(20, 20, 100, 30);
        lista_Desplegable.addItem("Argentina");
        lista_Desplegable.setSelectedItem("Paraguay");
        panel.add(lista_Desplegable);
        */
    
        DefaultComboBoxModel modelo = new DefaultComboBoxModel<>();
        JComboBox lista_desplegable = new JComboBox(modelo);

        lista_desplegable.setBounds(20, 20, 200, 30);
        panel.add(lista_desplegable);

        Persona persona1 = new Persona("Angel Martinez", 19, "Mexicano");
        Persona persona2 = new Persona("Tania Velasco", 29, "Argentina");

        modelo.addElement(persona1);
        modelo.addElement(persona2);
    }
    private void colocarCampoDeContrasena(){
        JPasswordField campo_contrasena = new JPasswordField();
        campo_contrasena.setBounds(20, 20, 150, 30);
        campo_contrasena.setText("Hola");
        panel.add(campo_contrasena);

        String contrasena = "";
        for (char e : campo_contrasena.getPassword()) {
            contrasena += e;
        }
        System.out.println("Contraseña: " + contrasena);
    }
    private void colocarTablas(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Nacionalidad");

        String[] persona1 = {"Angel", "20", "Mexicano"};
        modelo.addRow(persona1);
        String[] persona2 = {"Jenny", "19", "Gringa"};
        modelo.addRow(persona2);
        String[] persona3 = {"Leonel", "34", "Argentina"};
        modelo.addRow(persona3);
        String[] persona4 = {"Maria", "25", "Española"};
        modelo.addRow(persona4);
        String[] persona5 = {"John", "28", "Canadiense"};
        modelo.addRow(persona5);
        String[] persona6 = {"Emily", "22", "Australiana"};
        modelo.addRow(persona6);
        String[] persona7 = {"Carlos", "30", "Colombiano"};
        modelo.addRow(persona7);
        String[] persona8 = {"Sara", "27", "Italiana"};
        modelo.addRow(persona8);
        String[] persona9 = {"Daniel", "23", "Brasileño"};
        modelo.addRow(persona9);
        String[] persona10 = {"Sophie", "26", "Francesa"};
        modelo.addRow(persona10);
        String[] persona11 = {"Alex", "31", "Inglés"};
        modelo.addRow(persona11);
        String[] persona12 = {"Elena", "29", "Rusa"};
        modelo.addRow(persona12);
        String[] persona13 = {"Pablo", "32", "Chileno"};
        modelo.addRow(persona13);
        String[] persona14 = {"Isabella", "24", "Alemana"};
        modelo.addRow(persona14);
        String[] persona15 = {"Gabriel", "33", "Uruguayo"};
        modelo.addRow(persona15);
        String[] persona16 = {"Olivia", "21", "Estadounidense"};
        modelo.addRow(persona16);
        String[] persona17 = {"Mateo", "35", "Mexicano"};
        modelo.addRow(persona17);
        String[] persona18 = {"Lily", "18", "Canadiense"};
        modelo.addRow(persona18);
        String[] persona19 = {"Diego", "36", "Argentino"};
        modelo.addRow(persona19);
        String[] persona20 = {"Emma", "19", "Australiana"};
        modelo.addRow(persona20);

        JTable tabla = new JTable(modelo);
        tabla.setBounds(20, 20, 300, 200);
        panel.add(tabla);

        JScrollPane scroll = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 300, 200);
        panel.add(scroll);
    }
    private void colocarListas(){
        DefaultListModel modelo = new DefaultListModel();

        modelo.addElement(new Persona("Angel", 19, "Mexicano"));
        modelo.addElement(new Persona("Jenny", 25, "Estadounidense"));
        modelo.addElement(new Persona("Leonel", 30, "Argentino"));
        modelo.addElement(new Persona("Maria", 22, "Española"));
        modelo.addElement(new Persona("John", 28, "Canadiense"));
        modelo.addElement(new Persona("Emily", 21, "Australiana"));
        modelo.addElement(new Persona("Carlos", 33, "Colombiano"));
        modelo.addElement(new Persona("Sara", 26, "Italiana"));
        modelo.addElement(new Persona("Daniel", 29, "Brasileño"));
        modelo.addElement(new Persona("Sophie", 24, "Francesa"));
        modelo.addElement(new Persona("Alex", 32, "Inglés"));
        modelo.addElement(new Persona("Elena", 27, "Rusa"));
        modelo.addElement(new Persona("Pablo", 34, "Chileno"));
        modelo.addElement(new Persona("Isabella", 23, "Alemana"));
        modelo.addElement(new Persona("Gabriel", 31, "Uruguayo"));
        modelo.addElement(new Persona("Olivia", 20, "Estadounidense"));
        modelo.addElement(new Persona("Mateo", 35, "Mexicano"));
        modelo.addElement(new Persona("Lily", 18, "Canadiense"));
        modelo.addElement(new Persona("Diego", 36, "Argentino"));
        modelo.addElement(new Persona("Emma", 19, "Australiana"));
        modelo.addElement(new Persona("Luis", 40, "Mexicano"));
        modelo.addElement(new Persona("Anna", 29, "Sueca"));
        modelo.addElement(new Persona("Miguel", 26, "Colombiano"));
        modelo.addElement(new Persona("Sophia", 22, "Estadounidense"));
        modelo.addElement(new Persona("Antonio", 38, "Español"));
        modelo.addElement(new Persona("Eva", 27, "Mexicana"));
        modelo.addElement(new Persona("Lucas", 33, "Brasileño"));
        modelo.addElement(new Persona("Amelia", 25, "Francesa"));
        modelo.addElement(new Persona("Julian", 30, "Colombiano"));

        JList lista = new JList(modelo);
        lista.setBounds(20, 20, 200, 300);
        panel.add(lista);

        JScrollPane scroll = new JScrollPane(lista, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 20, 200, 300);
        panel.add(scroll);
        
    }
}

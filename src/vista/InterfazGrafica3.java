package vista;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InterfazGrafica3 extends JFrame {

    JPanel pDatos, pMensaje, pBotones;
    JTextArea areaPregunt, tfPremio, tfPreg_max;
    JTextField tfNombre;
    JLabel lNombre, lPremio, lPreg_max;
    JButton bIngresar;

    public void initComponents(){
        areaPregunt = new JTextArea(2,15);
        areaPregunt.setFont(new Font("Arial Black", Font.BOLD, 15));

        tfNombre = new JTextField(10);

        tfPremio = new JTextArea(2,15);
        tfPremio.setFont(new Font("Arial Black", Font.BOLD, 17));
        tfPremio.setEditable(false);

        tfPreg_max = new JTextArea(2,10);
        tfPreg_max.setFont(new Font("Arial Black", Font.BOLD, 17));
        tfPreg_max.setEditable(false);

        lNombre = new JLabel("Nombre:");
        lNombre.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        lPremio = new JLabel("Premio: $$");
        lPremio.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        lPreg_max = new JLabel("Preg_max:");
        lPreg_max.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

        bIngresar = new JButton("Guardar datos Participante");


        pDatos = new JPanel();
        pDatos.setLayout(new GridLayout(3,2,40,2));
        pMensaje = new JPanel();
        pBotones = new JPanel();

        pMensaje.add(areaPregunt);

        pDatos.add(lPremio); pDatos.add(tfPremio);
        pDatos.add(lNombre); pDatos.add(tfNombre);
        pDatos.add(lPreg_max); pDatos.add(tfPreg_max);
        pDatos.setBorder(BorderFactory.createTitledBorder("Ingreso de datos "));

        pBotones.add(bIngresar);


        areaPregunt.setText("Ha terminado el juego!!!");
        areaPregunt.setEditable(false);

        setLayout(new BorderLayout());
        add(pDatos, BorderLayout.CENTER);
        add(pMensaje, BorderLayout.NORTH);
        add(pBotones, BorderLayout.SOUTH);
    }

    public InterfazGrafica3(){
        super("Quien quiere ser millonario");
        initComponents();
        setVisible(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(700,400);
        setSize(700, 250);
    }


    public JButton getbIngresar() {
        return bIngresar;
    }

    public String getTfNombre() {
        return tfNombre.getText().trim();
    }

    public void setTfPremio(String tfPremio) {
        this.tfPremio.setText(tfPremio);
    }

    public void setTfPreg_max(String tfPreg_max) {
        this.tfPreg_max.setText(tfPreg_max);
    }

    public String getTfPremio() {
        return tfPremio.getText().trim();
    }

    public String getTfPreg_max() {
        return tfPreg_max.getText().trim();
    }

    public void asignarEscuchas3(ActionListener evento){
        bIngresar.addActionListener(evento);
    }


}
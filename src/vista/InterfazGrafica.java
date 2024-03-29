package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class InterfazGrafica extends JFrame{

    JButton bMostrar, bRespA, bRespB, bRespC, bRespD, bRetiro;
    JPanel pBotones, pPregunta, pRespuestas, pJuego, pDatos;
    JTextArea areaPreg, areaRespA, areaRespB, areaRespC, areaRespD, areaNumPreg, areaPremio, areaNombre;
    JLabel lNumPreg, lAreaPremio;
    String respuestaCorrecta;
    int codigoActual;
    ArrayList<Integer> listaCodigos = new ArrayList<>();


    public void initComponents(){

        areaPreg = new JTextArea(1,10);
        areaPreg.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaPreg.setEditable(false);

        areaRespA = new JTextArea(1,15);
        areaRespA.setFont(new Font("SansSerif", Font.PLAIN, 14));
        areaRespA.setEditable(false);

        areaRespB = new JTextArea(1,15);
        areaRespB.setFont(new Font("SansSerif", Font.PLAIN, 14));
        areaRespB.setEditable(false);

        areaRespC = new JTextArea(1,15);
        areaRespC.setFont(new Font("SansSerif", Font.PLAIN, 14));
        areaRespC.setEditable(false);

        areaRespD = new JTextArea(1,15);
        areaRespD.setFont(new Font("SansSerif", Font.PLAIN, 14));
        areaRespD.setEditable(false);

        areaNumPreg = new JTextArea(1,5);
        areaNumPreg.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaNumPreg.setEditable(false);

        areaPremio = new JTextArea(1,5);
        areaPremio.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaPremio.setEditable(false);


        lNumPreg = new JLabel("# Pregunta:");
        lAreaPremio = new JLabel("Premio Acumulado $$:");

        bMostrar = new JButton("INICIAR JUEGO");
        bRetiro = new JButton("RETIRARME");
        bRespA = new JButton("A");
        bRespB = new JButton("B");
        bRespC = new JButton("C");
        bRespD = new JButton("D");

        pBotones = new JPanel();
        pJuego = new JPanel();
        pPregunta = new JPanel();
        pRespuestas = new JPanel();
        pDatos = new JPanel();

        //                             (fila, columna, hspace, vspace)

        pBotones.setLayout(new GridLayout(2,1,2,2));
        pRespuestas.setLayout(new GridLayout(2,4,8,25));
        pDatos.setLayout(new GridLayout(2,2,2,4));


        pBotones.add(bMostrar);
        pBotones.add(bRetiro);
        pBotones.setBorder(BorderFactory.createTitledBorder(""));

        pPregunta.add(areaPreg);

        pRespuestas.add(areaRespA);
        pRespuestas.add(areaRespB);
        pRespuestas.add(areaRespC);
        pRespuestas.add(areaRespD);
        pRespuestas.add(bRespA);
        pRespuestas.add(bRespB);
        pRespuestas.add(bRespC);
        pRespuestas.add(bRespD);

        pDatos.add(lNumPreg); pDatos.add(areaNumPreg);
        pDatos.add(lAreaPremio); pDatos.add(areaPremio);
        pDatos.setBorder(BorderFactory.createTitledBorder(""));

        pJuego.setLayout(new BorderLayout());
        pJuego.add(pPregunta, BorderLayout.NORTH);
        pJuego.add(pRespuestas, BorderLayout.CENTER);

        pPregunta.setBorder(BorderFactory.createTitledBorder("PREGUNTA: "));

        setLayout(new BorderLayout());
        add(pJuego, BorderLayout.CENTER);
        add(pBotones, BorderLayout.EAST);
        add(pDatos, BorderLayout.WEST);
    }


    //mi constructor:
    public InterfazGrafica(){
        super("Quien quiere ser millonario");
        initComponents();

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(400,400);
        pack();
        JOptionPane.showMessageDialog(null, "¡Bienvenido al Juego de Preguntas: Quién quiere ser millonario!, a continuación se enfrentará \na 25 preguntas que tendrán sólo una respuesta correcta, y a medida que avance en los niveles,\n obtendrá un premio mayor; si se retira, obtendrá la ganancia alcanzada, pero si selecciona una \nrespuesta errada, perderá todo el premio. Dé clic en 'INICIAR JUEGO'","Inicio Juego",JOptionPane.QUESTION_MESSAGE);
    }




    public JButton getbMostrar() {
        return bMostrar;
    }

    public JButton getbRetiro() {
        return bRetiro;
    }

    public JButton getbRespA() {
        return bRespA;
    }

    public JButton getbRespB() {
        return bRespB;
    }

    public JButton getbRespC() {
        return bRespC;
    }

    public JButton getbRespD() {
        return bRespD;
    }


    public String getAreaRespA(){
        return areaRespA.getText().trim();
    }

    public String getAreaRespB(){
        return areaRespB.getText().trim();
    }

    public String getAreaRespC(){
        return areaRespC.getText().trim();
    }

    public String getAreaRespD(){
        return areaRespD.getText().trim();
    }

    public String getAreaNumPreg(){
        return areaNumPreg.getText().trim();
    }

    public String getAreaPremio(){
        return areaPremio.getText().trim();
    }


    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public int getCodigoActual(){
        return codigoActual;
    }


    public ArrayList<Integer> getListaCodigos(){
        return listaCodigos;
    }

    public void mensajeEnArea(String unaPregunta){

            String[] resultados = unaPregunta.split("_,");
            codigoActual = Integer.parseInt(resultados[0]);
            listaCodigos.add(Integer.parseInt(resultados[0]));
            areaPreg.setText(resultados[1]);
            areaRespA.setText(resultados[2]);
            areaRespB.setText(resultados[3]);
            areaRespC.setText(resultados[4]);
            areaRespD.setText(resultados[5]);
            respuestaCorrecta = resultados[6];
            areaNumPreg.setText(""+listaCodigos.size());

            if(listaCodigos.size()>0 && listaCodigos.size()<=5){
                areaPremio.setText("0");
            }else if(listaCodigos.size()>5 && listaCodigos.size()<=10){
                areaPremio.setText("1000000");
            }else if(listaCodigos.size()>10 && listaCodigos.size()<=15){
                areaPremio.setText("5000000");
            }else if(listaCodigos.size()>15 && listaCodigos.size()<=20){
                areaPremio.setText("10000000");
            }else if(listaCodigos.size()>20 && listaCodigos.size()<=24){
                areaPremio.setText("20000000");
            }else if(listaCodigos.size()==25){
                areaPremio.setText("50000000");
            }
    }

    public void asignarEscuchas(ActionListener evento) {
        bMostrar.addActionListener(evento);
        bRespA.addActionListener(evento);
        bRespB.addActionListener(evento);
        bRespC.addActionListener(evento);
        bRespD.addActionListener(evento);
        bRetiro.addActionListener(evento);
    }
}
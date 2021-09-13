package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class InterfazGrafica extends JFrame{





    JButton bMostrar, bRespA, bRespB, bRespC, bRespD, bIngresar;
    JPanel pBotones, pPregunta, pRespuestas, pJuego, pDatos;
    JTextArea areaPreg, areaRespA, areaRespB, areaRespC, areaRespD, areaNumPreg, areaPremio, areaNombre;
    JLabel lNumPreg, lAreaPremio;
    String respuestaCorrecta;
    int codigoActual;
    ArrayList<Integer> listaCodigos = new ArrayList<>();


    public void initComponents(){

        areaPreg = new JTextArea(1,10);
        areaPreg.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaRespA = new JTextArea(1,15);
        areaRespA.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaRespA.setComponentOrientation(ComponentOrientation.UNKNOWN);
        areaRespB = new JTextArea(1,15);
        areaRespB.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaRespC = new JTextArea(1,15);
        areaRespC.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaRespD = new JTextArea(1,15);
        areaRespD.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaNumPreg = new JTextArea(1,5);
        areaNumPreg.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaPremio = new JTextArea(1,5);
        areaPremio.setFont(new Font("Arial Black", Font.BOLD, 14));
        areaNombre = new JTextArea(1, 10);


        lNumPreg = new JLabel("# Pregunta:");
        lAreaPremio = new JLabel("Premio Acumulado:");


        bMostrar = new JButton("INICIAR JUEGO");
        bRespA = new JButton("A");
        bRespB = new JButton("B");
        bRespC = new JButton("C");
        bRespD = new JButton("D");
        bIngresar = new JButton();

        pBotones = new JPanel();
        pJuego = new JPanel();
        pPregunta = new JPanel();
        pRespuestas = new JPanel();
        pDatos = new JPanel();

        //                             (fila, columna, hspace, vspace)

        pBotones.setLayout(new GridLayout(1,1,2,2));
        pRespuestas.setLayout(new GridLayout(2,4,8,25));
        pDatos.setLayout(new GridLayout(2,2,2,4));


        pBotones.add(bMostrar);
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


    }




    public JButton getbMostrar() {
        return bMostrar;
    }

    public JButton getbIngresar(){
        return bIngresar;
    }

    public void setbIngresar(JButton bIngresar) {
        this.bIngresar = bIngresar;
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

    public String getAreaNombre(){
        return areaNombre.getText().trim();
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

        if(unaPregunta == "END"){
            InterfazGrafica3 miInter = new InterfazGrafica3();
            setbIngresar(miInter.getbIngresar());
            miInter.setTfPreg_max(getAreaNumPreg());
            miInter.setTfPremio(getAreaPremio());
            areaNombre.setText(miInter.getTfNombre());

        }else {
            String[] resultados = unaPregunta.split("_,");
            codigoActual = Integer.parseInt(resultados[0]);
            listaCodigos.add(Integer.parseInt(resultados[0]));
            System.out.println(listaCodigos);
            areaPreg.setText(resultados[1]);
            areaRespA.setText(resultados[2]);
            areaRespB.setText(resultados[3]);
            areaRespC.setText(resultados[4]);
            areaRespD.setText(resultados[5]);
            respuestaCorrecta = resultados[6];
            areaNumPreg.setText(""+listaCodigos.size());
            if(listaCodigos.size()>0 && listaCodigos.size()<=5){
                areaPremio.setText("$0");
            }else if(listaCodigos.size()>5 && listaCodigos.size()<=10){
                areaPremio.setText("$1.000.000");
            }else if(listaCodigos.size()>10 && listaCodigos.size()<=15){
                areaPremio.setText("$5.000.000");
            }else if(listaCodigos.size()>15 && listaCodigos.size()<=20){
                areaPremio.setText("$10.000.000");
            }else if(listaCodigos.size()>20 && listaCodigos.size()<=24){
                areaPremio.setText("$20.000.000");
            }else if(listaCodigos.size()==25){
                areaPremio.setText("$50.000.000");
            }


        }

    }

    public void asignarEscuchas(ActionListener evento) {
        bMostrar.addActionListener(evento);
        bRespA.addActionListener(evento);
        bRespB.addActionListener(evento);
        bRespC.addActionListener(evento);
        bRespD.addActionListener(evento);
        bIngresar.addActionListener(evento);
    }



}
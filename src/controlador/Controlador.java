package controlador;

import modelo.*;
import vista.InterfazGrafica;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Controlador implements ActionListener {

    InterfazGrafica vista;
    AccionesEnDB modelo;
    Validador valid;

    public Controlador(InterfazGrafica vista, AccionesEnDB modelo, Validador valid) {
        this.vista = vista;
        this.modelo = modelo;
        this.vista.asignarEscuchas(this);
        this.valid = valid;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if(actionEvent.getSource() == vista.getbIngresar()){
            String nombre = vista.getAreaNombre();
            int premio = Integer.parseInt(vista.getAreaPremio());
            int preg_max = Integer.parseInt(vista.getAreaNumPreg());
            Participantes unParticipante = new Participantes(nombre, premio, preg_max);
            modelo.ingresarParticipante(unParticipante);
        }

        if(actionEvent.getSource() == vista.getbMostrar()){
            ArrayList<Integer> listaCodig = vista.getListaCodigos();
            String pregunta = modelo.obtenerPregunta(valid.random(0, listaCodig));
//            String pregunta = modelo.obtenerPregunta(0);
            vista.mensajeEnArea(pregunta);
        }

        if(actionEvent.getSource() == vista.getbRespA()){
            String respuesta = vista.getAreaRespA();
            String respCorrect = vista.getRespuestaCorrecta();
            int codActual = vista.getCodigoActual();
            ArrayList<Integer> listaCodig = vista.getListaCodigos();
            boolean codigoPregunta = valid.validar(respuesta, respCorrect);
            if(codigoPregunta){
                String pregunta = modelo.obtenerPregunta(valid.random(codActual, listaCodig));
                vista.mensajeEnArea(pregunta);
            }
        }

        if(actionEvent.getSource() == vista.getbRespB()){
            String respuesta = vista.getAreaRespB();
            String respCorrect = vista.getRespuestaCorrecta();
            int codActual = vista.getCodigoActual();
            ArrayList<Integer> listaCodig = vista.getListaCodigos();
            boolean codigoPregunta = valid.validar(respuesta, respCorrect);
            if(codigoPregunta){
                String pregunta = modelo.obtenerPregunta(valid.random(codActual, listaCodig));
                vista.mensajeEnArea(pregunta);
            }

        }

        if(actionEvent.getSource() == vista.getbRespC()){
            String respuesta = vista.getAreaRespC();
            String respCorrect = vista.getRespuestaCorrecta();
            int codActual = vista.getCodigoActual();
            ArrayList<Integer> listaCodig = vista.getListaCodigos();
            boolean codigoPregunta = valid.validar(respuesta, respCorrect);
            if(codigoPregunta){
                String pregunta = modelo.obtenerPregunta(valid.random(codActual, listaCodig));
                vista.mensajeEnArea(pregunta);
            }
        }

        if(actionEvent.getSource() == vista.getbRespD()){
            String respuesta = vista.getAreaRespD();
            String respCorrect = vista.getRespuestaCorrecta();
            int codActual = vista.getCodigoActual();
            ArrayList<Integer> listaCodig = vista.getListaCodigos();
            boolean codigoPregunta = valid.validar(respuesta, respCorrect);
            if(codigoPregunta){
                String pregunta = modelo.obtenerPregunta(valid.random(codActual, listaCodig));
                vista.mensajeEnArea(pregunta);
            }
        }
    }
}


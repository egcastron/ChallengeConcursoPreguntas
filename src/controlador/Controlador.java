package controlador;

import modelo.*;
import vista.InterfazGrafica;
import vista.InterfazGrafica3;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Controlador implements ActionListener {

    InterfazGrafica vista;
    InterfazGrafica3 vista3;
    AccionesEnDB modelo;
    Validador valid;

    public Controlador(InterfazGrafica vista, InterfazGrafica3 vista3, AccionesEnDB modelo, Validador valid) {
        this.vista = vista;
        this.vista3 = vista3;
        this.modelo = modelo;
        this.vista.asignarEscuchas(this);
        this.vista3.asignarEscuchas3(this);
        this.valid = valid;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {


        if(actionEvent.getSource() == vista3.getbIngresar()){
            String nombre = vista3.getTfNombre();
            int premio = Integer.parseInt(vista.getAreaPremio());
            int preg_max = Integer.parseInt(vista.getAreaNumPreg());
            Participantes unParticipante = new Participantes(nombre, premio, preg_max);
            modelo.ingresarParticipante(unParticipante);
        }

        if(actionEvent.getSource() == vista.getbMostrar()){
            ArrayList<Integer> listaCodig = vista.getListaCodigos();
            String pregunta = modelo.obtenerPregunta(valid.random(0, listaCodig));
            vista.mensajeEnArea(pregunta);
        }

        if(actionEvent.getSource() == vista.getbRetiro()){
            String pregunta = modelo.obtenerPregunta(0);
            if(pregunta == "END"){
                vista3.setTfPreg_max(vista.getAreaNumPreg());
                vista3.setTfPremio(vista.getAreaPremio());
            }
//            vista.mensajeEnArea(pregunta);
        }

        if(actionEvent.getSource() == vista.getbRespA()){
            String respuesta = vista.getAreaRespA();
            String respCorrect = vista.getRespuestaCorrecta();
            int codActual = vista.getCodigoActual();
            ArrayList<Integer> listaCodig = vista.getListaCodigos();
            boolean codigoPregunta = valid.validar(respuesta, respCorrect);
            if(codigoPregunta){
                String pregunta = modelo.obtenerPregunta(valid.random(codActual, listaCodig));
                if(pregunta == "END"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio(vista.getAreaPremio());
                }else{
                    vista.mensajeEnArea(pregunta);
                }
            }else {
                String pregunta = modelo.obtenerPregunta(1);
                if(pregunta == "FAIL"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio("0");
                }
//                vista.mensajeEnArea(pregunta);
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
                if(pregunta == "END"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio(vista.getAreaPremio());
                }else{
                    vista.mensajeEnArea(pregunta);
                }
            }else  {
                String pregunta = modelo.obtenerPregunta(1);
                if(pregunta == "FAIL"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio("0");
                }
//                vista.mensajeEnArea(pregunta);
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
                if(pregunta == "END"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio(vista.getAreaPremio());
                }else{
                    vista.mensajeEnArea(pregunta);
                }
            }else  {
                String pregunta = modelo.obtenerPregunta(1);
                if(pregunta == "FAIL"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio("0");
                }
//                vista.mensajeEnArea(pregunta);
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
                if(pregunta == "END"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio(vista.getAreaPremio());
                }else{
                    vista.mensajeEnArea(pregunta);
                }
            }else  {
                String pregunta = modelo.obtenerPregunta(1);
                if(pregunta == "FAIL"){
                    vista3.setTfPreg_max(vista.getAreaNumPreg());
                    vista3.setTfPremio("0");
                }
//                vista.mensajeEnArea(pregunta);
            }
        }
    }
}


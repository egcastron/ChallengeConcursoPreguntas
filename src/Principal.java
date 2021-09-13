

import controlador.Controlador;
import modelo.AccionesEnDB;
import modelo.Validador;
import vista.InterfazGrafica;



public class Principal {
    public static void main(String[] args) {
        InterfazGrafica vista = new InterfazGrafica();
        AccionesEnDB modelo = new AccionesEnDB();
        Validador valid = new Validador();
        Controlador controlador = new Controlador(vista, modelo, valid);


    }
}

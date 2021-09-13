import controlador.Controlador;
import modelo.AccionesEnDB;
import modelo.Validador;
import vista.InterfazGrafica;
import vista.InterfazGrafica3;


public class Principal {
    public static void main(String[] args) {
        InterfazGrafica vista = new InterfazGrafica();
        InterfazGrafica3 vista3 = new InterfazGrafica3();
        AccionesEnDB modelo = new AccionesEnDB();
        Validador valid = new Validador();
        Controlador controlador = new Controlador(vista, vista3, modelo, valid);
    }
}

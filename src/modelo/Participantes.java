package modelo;

public class Participantes{
    private String nombre;
    private int premio;
    private int preg_max;

    public Participantes(String nombre, int premio, int preg_max) {
        this.nombre = nombre;
        this.premio = premio;
        this.preg_max = preg_max;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPremio() {
        return premio;
    }

    public int getPreg_max() {
        return preg_max;
    }
}
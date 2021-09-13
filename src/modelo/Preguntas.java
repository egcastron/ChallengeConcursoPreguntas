package modelo;

public class Preguntas{
    private int id_nivel;
    private String pregunta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;
    private String respuesta4;
    private String res_correcta;

    public Preguntas(int id_nivel, String pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4, String res_correcta) {
        this.id_nivel = id_nivel;
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.res_correcta = res_correcta;
    }

    public int getId_nivel() {
        return id_nivel;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public String getRes_correcta() {
        return res_correcta;
    }

    public String toString(){
        return id_nivel + "_," + pregunta + "_," + respuesta1 + "_," + respuesta2 + "_," + respuesta3 + "_," + respuesta4 + "_," + res_correcta;
    }
}

package modelo;

import java.sql.*;


public class AccionesEnDB {
    Connection miConexion;

    public AccionesEnDB(){
        this.miConexion = ConectandoBD.obtenerConexion();
    }


    public void ingresarParticipante(Participantes unParticipante){
        String sql= "INSERT  INTO  participantes(nombre, premio, preg_max, fecha) VALUES(?, ?, ?, NOW());";
        try {
            PreparedStatement sentencia = miConexion.prepareStatement(sql);
            sentencia.setString(1, unParticipante.getNombre());
            sentencia.setInt(2, unParticipante.getPremio());
            sentencia.setInt(3, unParticipante.getPreg_max());

            int filasInsertadas = sentencia.executeUpdate();
            if(filasInsertadas > 0){
                System.out.println("Se ingresó el participante: " + unParticipante.getNombre() +" con éxito.");
            }

        }catch (SQLException ex){
            System.out.println("No se pudo ingresar el registro");
        }
    }

    public String obtenerPregunta(int codigo_pregunta){

        if(codigo_pregunta == 0){
            return "END";
        }else if(codigo_pregunta == 1){
            return "FAIL";
        }

        String registro = "";

        String sql = "SELECT * FROM preguntas WHERE id_nivel = ?";

        try {
            PreparedStatement sentencia = miConexion.prepareStatement(sql);
            sentencia.setInt(1, codigo_pregunta);
            ResultSet resultado = sentencia.executeQuery();

            if(resultado.next()) {
                Preguntas unaPregunta = new Preguntas(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getString(4), resultado.getString(5), resultado.getString(6), resultado.getString(7));
                registro = unaPregunta.toString();
                System.out.println(registro);
            }

        }catch (SQLException ex){}

        return registro;

    }
}
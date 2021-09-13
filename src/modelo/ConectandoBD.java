package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectandoBD{
    public static Connection obtenerConexion(){
        Connection conn = null;
        String URL = "jdbc:mysql://localhost:3306/challenge_concurso_preguntas";
        String usuario = "root";
        String password = "";
        try{
            conn = DriverManager.getConnection(URL, usuario, password);
            if(conn != null){
                System.out.println("Conectado con éxito a DB !!");
                return conn;
            }
        }catch (SQLException sqle){
            System.out.println("Error:" + sqle.getMessage());
        }
        return conn;
    }
}
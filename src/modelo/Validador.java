package modelo;

import java.util.List;
import java.util.Random;

public class Validador {

    public boolean validar(String respuesta, String resp_Correcta) {
        boolean iguales;
        if(respuesta.equals(resp_Correcta)){
            iguales = true;
        }else {
            iguales = false;
        }
        return iguales;
    }

    public int random(int codigoActual, List listaCog) {
        if(codigoActual==0) {
            Random r = new Random();
            int low = 101;
            int high = 106;
            int result = r.nextInt(high - low) + low;
            return result;
        }else{

            boolean contiene=true;
            if((!(listaCog.contains(101))) || (!(listaCog.contains(102))) || (!(listaCog.contains(103))) || (!(listaCog.contains(104))) || (!(listaCog.contains(105)))) {
                while(contiene){
                    Random r = new Random();
                    int low = 101;
                    int high = 106;
                    int result = r.nextInt(high - low) + low;
                    if(!(listaCog.contains(result))){
                        contiene = false;
                        return result;
                    }
                }
            }else if((!(listaCog.contains(201))) || (!(listaCog.contains(202))) || (!(listaCog.contains(203))) || (!(listaCog.contains(204))) || (!(listaCog.contains(205)))){
                while(contiene){
                    Random r = new Random();
                    int low = 201;
                    int high = 206;
                    int result = r.nextInt(high - low) + low;
                    if(!(listaCog.contains(result))){
                        contiene = false;
                        return result;
                    }
                }
            }else if((!(listaCog.contains(301))) || (!(listaCog.contains(302))) || (!(listaCog.contains(303))) || (!(listaCog.contains(304))) || (!(listaCog.contains(305)))){
                while(contiene){
                    Random r = new Random();
                    int low = 301;
                    int high = 306;
                    int result = r.nextInt(high - low) + low;
                    if(!(listaCog.contains(result))){
                        contiene = false;
                        return result;
                    }
                }
            }else if((!(listaCog.contains(401))) || (!(listaCog.contains(402))) || (!(listaCog.contains(403))) || (!(listaCog.contains(404))) || (!(listaCog.contains(405)))){
                while(contiene){
                    Random r = new Random();
                    int low = 401;
                    int high = 406;
                    int result = r.nextInt(high - low) + low;
                    if(!(listaCog.contains(result))){
                        contiene = false;
                        return result;
                    }
                }
            }else if((!(listaCog.contains(501))) || (!(listaCog.contains(502))) || (!(listaCog.contains(503))) || (!(listaCog.contains(504))) || (!(listaCog.contains(505)))){
                while(contiene){
                    Random r = new Random();
                    int low = 501;
                    int high = 506;
                    int result = r.nextInt(high - low) + low;
                    if(!(listaCog.contains(result))){
                        contiene = false;
                        return result;
                    }
                }
            }
        }
        return 0;
    }
}

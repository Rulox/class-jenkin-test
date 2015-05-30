/**
 * Prueba de cdigo en Java para integracin continua con Jenkins.
 * Cdigo original por "Sergio Blanco Cuaresma"
 * @author Ral
 * @author Sergio
 * @date Mayo de 2015
 */

public class Transatlantico extends Barco {
	 /**
	 * @see Barco#tocado()
	 */
public int tocado (){
    if (toques < 3){
      toques++;
      if (toques == 3){
        hundido=true;
        return 2;   // Hundido
      }
      return 1;   // Tocado
    }
    return 2; // Ya estaba hundido
  }
}

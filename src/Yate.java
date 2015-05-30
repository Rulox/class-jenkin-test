/**
 * Prueba de código en Java para integración continua con Jenkins.
 * Código original por "Sergio Blanco Cuaresma"
 * @author Raúl
 * @author Sergio
 * @date Mayo de 2015
 */

public class Yate extends Barco {
	 /**
	 * @see Barco#tocado()
	 */
public int tocado (){
    if (toques < 2){
      toques++;
      if (toques == 2){
        hundido=true;
        return 2;   // Hundido
      }
      return 1;   // Tocado
    }
    return 2; // Ya estaba hundido
  }
}

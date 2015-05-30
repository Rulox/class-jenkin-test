/**
 * Prueba de cdigo en Java para integracin continua con Jenkins.
 * Cdigo original por "Sergio Blanco Cuaresma"
 * @author Ral
 * @author Sergio
 * @date Mayo de 2015
 */

public class Submarino extends Barco {
  /**
 * @see Barco#tocado()
 */
public int tocado (){
    if (toques<2){
      toques++;
      hundido=true;
    }
    return 2;   // Hundido
  }
}

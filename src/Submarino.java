/**
 * Prueba de código en Java para integración continua con Jenkins.
 * Código original por "Sergio Blanco Cuaresma"
 * @author Raúl
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

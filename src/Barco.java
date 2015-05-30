/**
 * Prueba de código en Java para integración continua con Jenkins.
 * Código original por "Sergio Blanco Cuaresma"
 * @author Raúl
 * @author Sergio
 * @date Mayo de 2015
 */


public abstract class Barco {
  boolean hundido;
  int toques;
  /**
 * @return
 */
public abstract int tocado ();  // Implementar en herederos (incrementará toques e activará hundido)
}

/**
 * Prueba de c�digo en Java para integraci�n continua con Jenkins.
 * C�digo original por "Sergio Blanco Cuaresma"
 * @author Ra�l
 * @author Sergio
 * @date Mayo de 2015
 */


public abstract class Barco {
  boolean hundido;
  int toques;
  /**
 * @return
 */
public abstract int tocado ();  // Implementar en herederos (incrementar� toques e activar� hundido)
}

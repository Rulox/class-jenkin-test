package org.hundir;

/**
 * Prueba de cdigo en Java para integracin continua con Jenkins.
 * Cdigo original por "Sergio Blanco Cuaresma"
 * @author Ral
 * @author Sergio
 * @date Mayo de 2015
 */


public abstract class Barco {
  boolean hundido;
  public int toques;
    /**
 * @return
 */
public abstract int tocado ();  // Implementar en herederos (incrementar toques e activar hundido)
}

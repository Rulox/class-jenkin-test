/* Barco.java
 * Autor: Sergio Blanco Cuaresma
 * Fecha: Enero del 2002
 */

public abstract class Barco {
  boolean hundido;
  int toques;
  public abstract int tocado ();  // Implementar en herederos (incrementará toques e activará hundido)
}

/* Submarino.java
 * Autor: Sergio Blanco Cuaresma
 * Fecha: Enero del 2002
 */

public class Submarino extends Barco {
  public int tocado (){
    if (toques<2){
      toques++;
      hundido=true;
    }
    return 2;   // Hundido
  }
}

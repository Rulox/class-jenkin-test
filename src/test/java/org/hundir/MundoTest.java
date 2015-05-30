package org.hundir;

import junit.framework.TestCase;
import org.hundir.Mundo;


public class MundoTest extends TestCase {


	public void test() {
		Mundo mundo = new Mundo();
		
		assertNotNull(mundo); // El constructor funciona correctamente
		
		// Tests referentes al mundo.
		assertEquals(mundo.estado(100, 100), 3); // Fuera de la tabla [ERROR]
		
		assertFalse(mundo.todos_hundidos());  // Sin disparar, no se puede terminar la partida

	}

}

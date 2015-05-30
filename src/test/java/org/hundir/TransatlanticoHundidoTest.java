package org.hundir;

import junit.framework.TestCase;
import org.hundir.Transatlantico;



public class TransatlanticoHundidoTest extends TestCase {

	public void test() {
		Transatlantico trans = new Transatlantico();
		trans.toques = 0;
		
		// Tocado por primera vez
		assertEquals(trans.tocado(), 1); // Tocado por primera vez
		assertEquals(trans.toques, 1);   // 1 toque
		
		// Tocado por segunda vez
		assertEquals(trans.tocado(), 1); // Tocado otra vez
		assertEquals(trans.toques, 2);   // Ademas, tiene 2 toques
		
		// Tocado por tercera vez y hundido
		assertEquals(trans.tocado(), 2); // Tocado otra vez
		assertEquals(trans.toques, 3);   // Ademas, tiene 2 toques
		
		// Ya estaba hundido,
		assertEquals(trans.tocado(), 2);
		assertEquals(trans.tocado(), 2); 
		assertEquals(trans.tocado(), 2); 
	}

}

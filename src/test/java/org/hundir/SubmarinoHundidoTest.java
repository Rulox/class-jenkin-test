package org.hundir;

import junit.framework.TestCase;
import org.hundir.Submarino;





public class SubmarinoHundidoTest extends TestCase {

	public void test() {
        Submarino submarino = new Submarino();
        submarino.toques = 0;
		
		// Tocado por primera vez y hundido
		assertEquals(submarino.tocado(), 2); // Tocado por primera vez
		assertEquals(submarino.toques, 1);   // 1 toque
		
		// Ya estaba hundido,
		assertEquals(submarino.tocado(), 2);
		assertEquals(submarino.tocado(), 2);
		assertEquals(submarino.tocado(), 2);
	}

}

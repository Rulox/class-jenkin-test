package org.hundir;

import org.hundir.Yate;
import junit.framework.TestCase;

public class YateHundidoTest extends TestCase {

	public void test() {
		Yate yate = new Yate();
		yate.toques = 0;
		
		// Tocado por primera vez
		assertEquals(yate.tocado(), 1); // Tocado por primera vez
		assertEquals(yate.toques, 1);   // 1 toque
		
		// Tocado por segunda vez y hundido
		assertEquals(yate.tocado(), 2); // Tocado otra vez
		assertEquals(yate.toques, 2);   // Ademas, tiene 2 toques
		
		// Ya estaba hundido,
		assertEquals(yate.tocado(), 2);
		assertEquals(yate.tocado(), 2); 
		assertEquals(yate.tocado(), 2); 
	}

}

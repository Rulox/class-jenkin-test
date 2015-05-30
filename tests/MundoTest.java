import static org.junit.Assert.*;


public class MundoTest {

	@org.junit.Test
	public void test() {
		Mundo mundo = new Mundo();
		
		assertNotNull(mundo); // El constructor funciona correctamente
		
		// Tests referentes al mundo.
		assertEquals(mundo.estado(100, 100), 3); // Fuera de la tabla [ERROR]
		
		assertNotEquals(mundo.todos_hundidos(), 10);  // Sin disparar, no se puede terminar la partida

	}

}

package testeestrutural.testeestrutural;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TesteVinteEUm {
	
	private VinteEUm jogo;
	
	@Before
	public void configura() {
		jogo = new VinteEUm();
	}
	
	@Test
	public void testTodosPerdem() {
		int resultado = jogo.jogar(30, 30);
		assertEquals(0, resultado);
		
	}
	

}

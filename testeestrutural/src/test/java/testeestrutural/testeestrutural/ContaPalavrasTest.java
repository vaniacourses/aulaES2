package testeestrutural.testeestrutural;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ContaPalavrasTest {
	
	private ContaPalavras cp;
	
	@Before
	public void configura() {
		cp = new ContaPalavras();
	}

	@Test
	public void duasPalavras() {
		int palavras = cp.conta("gatos|cachorros");
		assertEquals(2, palavras);
		
		
	}
}

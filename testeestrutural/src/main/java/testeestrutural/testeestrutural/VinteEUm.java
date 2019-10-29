package testeestrutural.testeestrutural;

public class VinteEUm {
	
	public int jogar(int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		
		if (esq > 21)
			esq = 0;
		if (dir > 21)
			dir = 0;
		if (esq > dir)
			return dir; 
		else
			return esq;
	}

}

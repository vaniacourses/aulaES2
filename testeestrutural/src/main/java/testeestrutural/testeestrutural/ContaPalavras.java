package testeestrutural.testeestrutural;

public class ContaPalavras {
	

	/*
	 * Este método calcula  o número de palavras que terminam com "s" ou "r" em um sentença
	 * Uma palavra termina quando uma caracter que não é letra aparece
	 */
	public int conta(String str) {
		int palavras = 0; char ultima = ' ';
		for (int i = 0; i<str.length(); i++) {
			if (!Character.isLetter(str.charAt(i)) 	&& (ultima == 'r' || ultima == 's')){
				palavras++;
			}
			ultima = str.charAt(i);
		}
		if (ultima == 'x' || ultima == 's')
			palavras++;
		return palavras;
	}

}

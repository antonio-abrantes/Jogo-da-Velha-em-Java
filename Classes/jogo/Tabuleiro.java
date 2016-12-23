package jogo;

public class Tabuleiro {

	private String[] vet;
	
	public String[] getVet() {
		return vet;
	}

	public Tabuleiro() {
		zerar();
	}

	public void zerar() {
		vet = new String[9];
		for (int i = 0; i < 9; i++) {
			vet[i] = " ";
		}
	}

	public boolean verifica_jogo() {
		for (int i = 0; i < 9; i++) {
			if (vet[i] == " ") {
				return false;
			}
		}
		return true;
	}

	
	public boolean verifica_vencedor(String a) {

		//System.out.println(vet[0]);
		// linhas
		for (int i = 0; i < 9; i = i + 3) {
			if ((vet[i].equals(vet[i + 1]) && vet[i + 1].equals(vet[i + 2]) && !vet[i].equals(" ") && !vet[i + 1].equals(" ")					&& vet[i + 2] != " ")) {
				return true;
			}
		}
		// colunas
		if ((vet[0].equals(vet[3]) && vet[0].equals(vet[6]) && !vet[0].equals(" ") && !vet[3].equals(" ") && !vet[6].equals(" "))) {
			return true;
		}
		if ((vet[1].equals(vet[4]) && vet[1].equals(vet[7]) && !vet[1].equals(" ") && !vet[4].equals(" ") && !vet[7].equals(" "))) {
			return true;
		}
		if ((vet[2].equals(vet[5]) && vet[2].equals(vet[8]) && !vet[2].equals(" ") && !vet[5].equals(" ") && !vet[8].equals(" "))) {
			return true;
		}

		// Diagonal principal
		if ((vet[0].equals(vet[4]) && vet[0].equals(vet[8]) && !vet[0].equals(" ") && !vet[4].equals(" ") && !vet[8].equals(" "))) {
			return true;
		}

		// Diagonal secundaria
		if ((vet[2].equals(vet[4]) && vet[2].equals(vet[6]) && !vet[2].equals(" ") && !vet[4].equals(" ") && !vet[6].equals(" "))) {
			return true;
		}

		return false;
	}
	
	public void imprimir(){	
		for(int i = 0; i < 9; i = i+3){
			System.out.println("    "+vet[i]+" | "+vet[i+1]+" | "+vet[i+2]);
			if(i < 6){
				System.out.println("  -------------");
			}
		}	
	}
}

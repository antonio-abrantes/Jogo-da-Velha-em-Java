package interacao;

import java.util.Random;

import jogo.Tabuleiro;

public class Jogada {

	public static int jogada_pl(int x, int y, Tabuleiro tabuleiro) {

		String[] vet = tabuleiro.getVet();

		if (x == 1) {
			x = y - 1;
		} else if (x == 2) {
			x = x + y;
		} else if (x == 3) {
			x = x + 2 + y;
		}

		if (vet[x].equals(" ")) {
			vet[x] = "X";
			if (tabuleiro.verifica_vencedor("X")) {
				return 0;
			}
		} else {
			System.out.println("Jogada invalida...");
			return 1;
		}
		return -1;
	}

	public static void jogada_pc(Tabuleiro tabuleiro) {

		String[] vet = tabuleiro.getVet();

		while (true) {
			Random r = new Random();

			int i = r.nextInt(9);
			if (vet[i].equals(" ")) {
				vet[i] = "O";
				break;
			}
		}
		if (tabuleiro.verifica_vencedor("O")) {
			System.out.println("Pc ganhou");
		}
	}

}

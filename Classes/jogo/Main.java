package jogo;

import interacao.Console;

public class Main {

	public static void main(String[] args) {
		System.out.println("    << JOGO DA VELHA >>");
		System.out.print("Digite seu nome: ");
		String jogador = Console.entraNome();
		
		Jogo jogo = new Jogo(jogador);
		jogo.jogar();

	}

}

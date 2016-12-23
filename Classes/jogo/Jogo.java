package jogo;

import interacao.Console;
import interacao.Jogada;

public class Jogo {
	
	private String jogador;
	private Tabuleiro tabuleiro;
	
	public Jogo(String nome){
		this.jogador = nome;
	}
	
	public void jogar(){
			
	tabuleiro = new Tabuleiro();	
	tabuleiro.imprimir();
		
		while(true){
			System.out.print("Digite linha: ");
			int x = Console.lerJogada();
			System.out.print("Digite a coluna: ");
			int y = Console.lerJogada();
			
			int jogada;
			if(!tabuleiro.verifica_jogo()){
				jogada = Jogada.jogada_pl(x, y, tabuleiro);
			}else{
				tabuleiro.imprimir();
				System.out.println("Fim de jogo, sem jogadas disponiveis");
				
				break;
			}
				
			if(jogada == 0){
				System.out.println("Jogador "+jogador+" ganhou");
				tabuleiro.imprimir();
				break;
			}else if(jogada == 1){
				continue;
			}else if(jogada == -1){
				if(!tabuleiro.verifica_jogo()){
					Jogada.jogada_pc(tabuleiro);
				}else{
					tabuleiro.imprimir();
					System.out.println("Fim de jogo, sem jogadas disponiveis");
					break;
				}
				
			}
			tabuleiro.imprimir();			
		}
	} 

}

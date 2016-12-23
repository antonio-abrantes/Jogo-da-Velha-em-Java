package interacao;

import java.util.Scanner;

public class Console {
	
	public static String entraNome(){
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		return nome;
	}
	
	public static int lerJogada(){
		Scanner in = new Scanner(System.in);
		int num;

		try {
			return num = in.nextInt();
		} catch (Exception e) {
			System.out.println("caracter invalido");
		}
		return -1;
	}	
}

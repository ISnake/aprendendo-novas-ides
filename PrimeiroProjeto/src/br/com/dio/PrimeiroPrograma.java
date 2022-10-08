package br.com.dio;

import br.com.dio.model.Passaro;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Passaro passaro= new Passaro();
		Livros livros= new Livros();
		
		System.out.println(passaro);
		System.out.println(livros);
		/*int a = 2;
		int b = 3;
		System.out.println("Hello World! " + (a+b));
	}
*/
	}
}

class Livros {
	private String nome;
	private String npag;
}

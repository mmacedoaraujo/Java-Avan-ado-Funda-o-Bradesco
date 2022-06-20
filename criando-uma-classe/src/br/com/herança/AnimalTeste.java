package br.com.herança;

import br.com.meuprojeto.Cachorro;

public class AnimalTeste {
	
	public static void main(String[] args) {
		
		cachorro lulu = new cachorro();
		lulu.comida = "Ração";
		lulu.dormir();
		
		galinha cocoricó = new galinha();
		cocoricó.dormir();
	}
}

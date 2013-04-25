package br.unipe.aps.domino;

import java.util.LinkedList;

public class PecaTeste {

	public static void main(String[] args) {

		LinkedList<Peca> pecas;// = Peca.criarPecas();
		pecas = Peca.criarPecas();

		System.out.println(pecas.size());
		for (Peca peca : pecas){
			System.out.print("("+peca.getLadoA().getValor() + "|" + peca.getLadoB().getValor() + ")");
		}

		Peca.shufflePecas(pecas);

		System.out.println();
		System.out.println(pecas.size());
		for (Peca peca : pecas){
			System.out.print("("+peca.getLadoA().getValor() + "|" + peca.getLadoB().getValor() + ")");
		}

	}

}
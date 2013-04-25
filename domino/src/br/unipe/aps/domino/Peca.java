package br.unipe.aps.domino;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Peca {

	private Lado ladoA;
	private Lado ladoB;

	/*
	 * Contrutores
	 * */
	public Peca(){}

	public Peca(Lado a, Lado b){
		this.setLadoA(a);
		this.setLadoB(b);
	}

	/*
	 * Getters and Setters
	 * */
	public Lado getLadoA() {
		return ladoA;
	}

	public void setLadoA(Lado ladoA) {
		this.ladoA = ladoA;
	}

	public Lado getLadoB() {
		return ladoB;
	}

	public void setLadoB(Lado ladoB) {
		this.ladoB = ladoB;
	}

	/*
	 * Métodos
	 * */
	 public static List<Peca> criarPecas(){
		 List<Peca> pecas = new LinkedList<Peca>();

		 for (int a = 0; a <= 6; a++){
			 Lado ladoA = new Lado();
			 ladoA.setValor(a);

			 for (int b = 0; b <= 6; b++){
				 Lado ladoB = new Lado();
				 ladoB.setValor(b);

				 Peca peca = new Peca(ladoA, ladoB);
				 for (Peca pecaAtual : pecas){
					 if (!pecaAtual.equals(peca))
						 pecas.add(peca);
				 }
			 }
		 }
		 return pecas;
	 }

	 public static void shufflePecas(List<Peca> pecas){
		 Collections.shuffle(pecas);
	 }

	 public boolean equals(Peca peca) {
		 return (this.getLadoA() == peca.getLadoB() && this.getLadoB() == peca.getLadoA());
	 }

}

package br.unipe.aps.domino;

import java.util.List;

public class PecaTeste {

	public static void main(String[] args) {

//      Lado a = new Lado(5);
//      Lado b = new Lado(3);
//      
//      Peca peca = new Peca(a, b);
//      
//      System.out.println("(" + peca.getLadoA().getValor() + "|" + peca.getLadoB().getValor() + ")");
//      
//      a.setValor(2);
//      b.setValor(1);
//      peca = new Peca(a, b);
//      
//      System.out.println("(" + peca.getLadoA().getValor() + "|" + peca.getLadoB().getValor() + ")");

		List<Peca> pecas = Peca.criarPecas();

		System.out.println(pecas.size());

		for (Peca peca : pecas){
			System.out.println(peca.getLadoA().getValor() + "|" + peca.getLadoB().getValor());
		}

//      Peca.shufflePecas(pecas);
//      
//      for (Peca peca : pecas){
//              System.out.println(peca.getLadoA().getValor() + "|" + peca.getLadoB().getValor());
//      }

	}

}
package br.unipe.aps.domino;

import java.util.LinkedList;

public class Jogador {
	
	private int id;
	private String nome;
	private LinkedList<Peca> pecas;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public LinkedList<Peca> getPecas() {
		return pecas;
	}
	public void setPecas(LinkedList<Peca> pecas) {
		this.pecas = pecas;
	}

}

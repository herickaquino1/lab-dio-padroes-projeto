package edu.lab.padroes;

public class Ringue {

	public static void main(String[] args) {
		Chutes chutar = new Chutes();
		Cotovelada cotovelada = new Cotovelada();
		Gancho gancho = new Gancho();
		Jab jab = new Jab();
		
		Lutador lutador = new Lutador();
		lutador.setMovimento(cotovelada);
		lutador.lutar();
		lutador.lutar();
		lutador.setMovimento(chutar);
		lutador.lutar();
		lutador.lutar();
		lutador.setMovimento(gancho);
		lutador.lutar();
		lutador.lutar();
		lutador.setMovimento(jab);
		lutador.lutar();
		lutador.lutar();
	}

}

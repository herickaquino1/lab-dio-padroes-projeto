package edu.lab.padroes;

public class Lutador {
	private Movimentos movimento;


	public void setMovimento(Movimentos movimento) {
		this.movimento = movimento;
	}
	
	public void lutar() {
		movimento.golpe();
	}

	
}

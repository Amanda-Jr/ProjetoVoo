package vooProjeto;

public class Passageiro extends Pessoa {
	private Voo passagem;
	private int numMala;
	private int pesoMala;
	
	public Passageiro(String nome, Data dataNasc, Voo passagem, int numMala, int pesoMala) {
		super(nome, dataNasc);
		this.passagem = passagem;
		this.numMala = numMala;
		this.pesoMala = pesoMala;
	}
	
	public void embarcar() {
		
	}
	
	public void despacharMala() {
		
	}
	
	public Voo getPassagem() {
		return passagem;
	}

	public void setPassagem(Voo passagem) {
		this.passagem = passagem;
	}

	public int getNumMala() {
		return numMala;
	}

	public void setNumMala(int numMala) {
		this.numMala = numMala;
	}

	public int getPesoMala() {
		return pesoMala;
	}

	public void setPesoMala(int pesoMala) {
		this.pesoMala = pesoMala;
	}
	
}

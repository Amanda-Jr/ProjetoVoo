package vooProjeto;
import java.util.Scanner;

public class Passageiro extends Pessoa {
	private Seguranca s1 = new Seguranca();
	private Voo passagem;
	private int numMala;
	private float malas[];
	private Scanner sc = new Scanner(System.in);
	
	public Passageiro(String nome, Data dataNasc, Voo passagem, int numMala) {
		super(nome, dataNasc);
		this.passagem = passagem;
		this.numMala = numMala;
	}
	
	public void despacharMala() {
		malas = new float[numMala];
		for(int i=0; i<numMala; i++) {
			System.out.printf("Digite o peso da mala %d ", i+1);
			malas[i] = sc.nextFloat();
			if(s1.verificarPesoMalas(malas[i])) {
				System.out.println("Mala despachada. Peso da Mala: " + malas[i]);
			}
			else {
				float taxa = (malas[i] - 25) * 50;
	        		System.out.println("Mala barrada! Peso limite excedido (25Kg). Peso da Mala: " + malas[i] + "Kg. Distribua o peso ou pague uma taxa de " + taxa + "R$");
			}
		}
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

	
}
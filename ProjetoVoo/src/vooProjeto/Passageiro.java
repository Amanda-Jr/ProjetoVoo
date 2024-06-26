package vooProjeto;
import java.util.Scanner;

public class Passageiro extends Pessoa {
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
			if(passagem.verificarPesoMalas(malas[i])) {
				System.out.println("Mala despachada. Peso da Mala: " + malas[i] + "kg");
			}
			else {
				float taxa = (malas[i] - 25) * 15;
	        		System.out.println("Mala barrada! Peso limite excedido (25Kg). Peso da Mala: " + malas[i] + "Kg. Distribua o peso ou pague uma taxa de " + taxa + "R$");
	        		System.out.println("[1] Pagar taxa \n[2] Distribuir peso");
	        		int escolha = sc.nextInt();	        		
	        		switch (escolha) {
	        			case 1:
	        				passagem.calcTaxa(taxa);
	        				System.out.println("Taxa adicionada ao valor total");
	        				break;
	        			case 2:
	        				despacharMala();
	        				break;
	        			default: 
	        				System.out.println("Opcao invalida");
	        		}
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

	public float[] getMalas() {
		return malas;
	}

	public void setMalas(float[] malas) {
		this.malas = malas;
	}
	
	
	
}

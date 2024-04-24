package vooProjeto;

public class Aviao {
	private boolean assentos[][];
	private Passageiro passageiro;
	private Comissario comissario;
	private Seguranca seguranca;
	private Voo voo;
	
	
	public Aviao() {
		this.assentos = new boolean[6][6];
		inicializarAssentos();
	}
	
	public Aviao(Passageiro passageiro, Comissario comissario, Seguranca seguranca, Voo voo) {
		this.assentos = new boolean[6][6];
		inicializarAssentos();
		this.passageiro = passageiro;
		this.comissario = comissario;
		this.seguranca = seguranca;
		this.voo = voo;
		
	}
	
	private void inicializarAssentos() {
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				this.assentos[i][j] = true;
			}
		}
	}
	
	public boolean disponivel(String assento) {
		String assentoPassageiro[] = assento.split("");
		if(assentos[Integer.parseInt(assentoPassageiro[0])][Integer.parseInt(assentoPassageiro[1])-1] ) {
			assentos[Integer.parseInt(assentoPassageiro[0])][Integer.parseInt(assentoPassageiro[1])-1] = false;
			return true;
		}
		return false;
	}
	
	public void cancelarAssento(String assento) {
		String assentoPassageiro[] = assento.split("");
		if(!assentos[Integer.parseInt(assentoPassageiro[0])][Integer.parseInt(assentoPassageiro[1])-1]) {
			assentos[Integer.parseInt(assentoPassageiro[0])][Integer.parseInt(assentoPassageiro[1])-1] = true;
		}else {
			System.out.println("Este assento nao pode ser cancelado");
		}
	}
	
	public void exibirAssentos() {
		System.out.println("   1   2   3   4   5   6 ");
		for(int i=0; i<6; i++) {
			System.out.print(i+1);
			for(int j=0; j<6; j++) {
				if(assentos[i][j]) {
					System.out.printf("  %d%d", i, j+1);	
				}
				else {
					System.out.print("  " + "x" + "" + "x");	
				}
			}
			System.out.println(" ");
		}
	}
	

	public boolean[][] getAssentos() {
		return assentos;
	}

	public void setAssentos(boolean[][] assentos) {
		this.assentos = assentos;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

	public Comissario getComissario() {
		return comissario;
	}

	public void setComissario(Comissario comissario) {
		this.comissario = comissario;
	}

	public Seguranca getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Seguranca seguranca) {
		this.seguranca = seguranca;
	}

	public Voo getVoo() {
		return voo;
	}

	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	
	
	
	
}

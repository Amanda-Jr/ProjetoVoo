package vooProjeto;

public class Aviao {
	private boolean assentos[][];
	private Passageiro passageiro;
	private Comissario comissario;
	private Piloto piloto;
	private Seguranca seguranca;
	private Voo voo;
	
	//incompleto
	public Aviao() {
		this.assentos = new boolean[6][6];
		
	}
	
	public boolean disponivel(String assento) {
		String assentoPassageiro[] = assento.split("");
		if(assentos[Integer.parseInt(assentoPassageiro[0])][Integer.parseInt(assentoPassageiro[1])] ) {
			return true;
		}
		return false;
	}
	
	public void decolar(){
		
	}	
	
	public void checarPassageiro() {
		
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

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
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

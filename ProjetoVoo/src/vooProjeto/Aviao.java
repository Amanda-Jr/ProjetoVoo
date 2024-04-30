package vooProjeto;

public class Aviao {
	private boolean assentos[][];
	
	
	public Aviao() {
		this.assentos = new boolean[6][6];
		inicializarAssentos();
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

		
	
}

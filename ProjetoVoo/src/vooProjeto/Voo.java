package vooProjeto;

public class Voo {

	private int id;
	private Data dataSaida ;
	private String horaSaida ; 
	private Data dataChegada ;
	private String horaChegada ; 
	private String origem ; 
	private String destino ;
	private String companhiaAerea ;
	private String numeroVoo ; 
	private String status ;
	private String assento; 
	private double valorAssento;
	private Aviao aviao;
	private Passageiro passageiro;


	public Voo(Data dataSaida, Data dataChegada, Aviao aviao, Passageiro passageiro) {
		this.id = 12345;
		this.dataSaida = dataSaida;
		this.horaSaida =  "10:30";
		this.dataChegada = dataChegada;
		this.horaChegada =  "13:00";
		this.origem = "Recife (REC)";
		this.destino = "São Paulo (GRU)";
		this.companhiaAerea = "LATAM";
		this.numeroVoo = "LA1234";
		this.status = "Confirmado";
		this.assento = null;
		this.valorAssento = 450.00;
		this.aviao = aviao;
		this.passageiro = passageiro;
	}

	public void reservarAssento(String assento) {
		if (this.assento == null) {
			if (aviao.disponivel(assento)) {
				this.assento = assento;
				System.out.println("Assento reservado com sucesso! Valor: R$" + valorAssento);
			} 
			else {
				System.out.println("Assento indisponível para reserva.");			
			}
		} 
		else {
			System.out.println("Atenção: Assento já reservado para este voo.");
		}
	}

	public void cancelarReserva() {
		if (this.assento != null) {
			this.assento = null;
			System.out.println("Reserva de assento cancelada com sucesso!");
		} 
		else {
			System.out.println("Atenção: Não há assento reservado para este voo.");
		}
	}

	public void embarcar() {
		if (this.status.equals("Confirmado")) {
			this.status = "Em voo";
		} 
		else {
			System.out.println("Atenção: Voo não está confirmado para embarque.");
		}
		
	}

	public void desembarcar() {
		if (this.status.equals("Em voo")) {
			this.status = "Concluído";
		} 
		else {
			System.out.println("Atenção: Voo não está em voo para desembarque.");
		}
	}

	public String getInformacoes() {
		return "\nInformações do Voo:\n" +
			"ID: " + id + "\n" +
			"Data de saída: " + dataSaida.toString() + "\n" +
			"Hora de saída: " + horaSaida + "\n" +
			"Data de chegada: " + dataChegada.toString() + "\n" +
			"Hora de chegada: " + horaChegada + "\n" +
			"Origem: " + origem + "\n" +
			"Destino: " + destino + "\n" +
			"Companhia aérea: " + companhiaAerea + "\n" +
			"Número do voo: " + numeroVoo + "\n" +
			"Status: " + status + (assento != null ? "\nAssento: " + assento + " - R$" + valorAssento : "");
	}
}

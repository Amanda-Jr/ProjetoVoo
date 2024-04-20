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
	private float valorAssento;
	private String servicoDeBordo;
	private float taxa;
	private Aviao aviao;

	public Voo() {
		
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
	
	public void calcTaxa(float taxa) {
		this.taxa = this.taxa + taxa;
	}
	
	public void valorTotal() {
		float total = valorAssento + taxa;
		System.out.println("Valor total: " + total);
	}
	
	@Override
	public String toString() {
		return "\nInformações do Voo:\n" +
			"ID: " + id + "\n" +
			"Data de saída: " + dataSaida.toString() + "\n" +
			"Hora de saída: " + horaSaida + "\n" +
			"Data de chegada: " + dataChegada.toString() + "\n" +
			"Hora de chegada: " + horaChegada + "\n" +
			"Origem: " + origem + "\n" +
			"Destino: " + destino + "\n" +
			"Companhia aérea: " + companhiaAerea + "\n" +
			"Número do voo: " + numeroVoo + "\n";
			
	}
	
	//"Status: " + status + (assento != null ? "\nAssento: " + assento + " - R$" + valorAssento : "" );
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Data getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Data dataSaida) {
		this.dataSaida = dataSaida;
	}
	public String getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	public Data getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Data dataChegada) {
		this.dataChegada = dataChegada;
	}
	public String getHoraChegada() {
		return horaChegada;
	}
	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}
	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}
	public String getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAssento() {
		return assento;
	}
	public void setAssento(String assento) {
		this.assento = assento;
	}
	public float getValorAssento() {
		return valorAssento;
	}
	public void setValorAssento(float valorAssento) {
		this.valorAssento = valorAssento;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	public Aviao getAviao() {
		return aviao;
	}
	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	public String getServicoDeBordo() {
		return servicoDeBordo;
	}
	public void setServicoDeBordo(String servicoDeBordo) {
		this.servicoDeBordo = servicoDeBordo;
	}
	
	
}

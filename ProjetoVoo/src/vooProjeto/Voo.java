package vooProjeto;

public class Voo {

	private int id;
	private Data dataSaida ;
	private Data dataChegada ;
	private String horaSaida ; 
	private String horaChegada ; 
	private String origem ; 
	private String destino ;
	private String companhiaAerea ;
	private String numeroVoo ; 
	private String assento; 
	private String servicoDeBordo;
	private float valorAssento;
	private float taxaMala;
	private float taxaServico;
	private float pesoMaximoMalas;
	private Aviao aviao;

	public Voo() {
		taxaServico = 0;
		pesoMaximoMalas = 25;
	}


	public void reservarAssento(String assento) {
		if (this.assento == null) {
			if (aviao.disponivel(assento)) {
				this.assento = assento;
				System.out.println("Assento reservado com sucesso!");
			} 
			else {
				System.out.println("Assento indisponível para reserva.");			
			}
		} 
		else {
			System.out.println("Atenção: Assento já reservado para este voo.");
		}
	}

	public void cancelarReserva(String assento) {
		if (this.assento != null) {
			this.assento = null;
			System.out.println("Reserva de assento cancelada com sucesso!");
			aviao.cancelarAssento(assento);
		} 
		else {
			System.out.println("Atenção: Não há assento reservado para este voo.");
		}
	}
	
	 public boolean verificarPesoMalas(float pesoMala) {
	     if(pesoMala > pesoMaximoMalas) {
	    	 return false;
	     }else {
	    	 return true;
	     }
	 }
	 
	public void calcTaxa(float taxaMala) {
		this.taxaMala = this.taxaMala + taxaMala;
	}
	
	public void valorTotal() {
		float total = valorAssento + taxaMala + taxaServico;
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
			"Número do voo: " + numeroVoo + "\n" +
			"Valor do voo: " + valorAssento + "\n";
			
	}
	
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
	
	public void setPesoMaximoMalas(float pesoMaximoMalaS) {
	     this.pesoMaximoMalas = pesoMaximoMalaS;
	}
	
	public String getNumeroVoo() {
		return numeroVoo;
	}
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
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
	public float getTaxaMala() {
		return taxaMala;
	}
	public void setTaxaMala(float taxaMala) {
		this.taxaMala = taxaMala;
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

	public float getTaxaServico() {
		return taxaServico;
	}
	public void setTaxaServico(float taxaServico) {
		this.taxaServico = this.taxaServico + taxaServico;
	}
	
	
}

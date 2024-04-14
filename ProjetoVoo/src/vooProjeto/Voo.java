package vooProjeto;

public class Voo {

  private int id;
  private Data dataSaida;
  private String horaSaida;
  private Data dataChegada;
  private String horaChegada;
  private String origem;
  private String destino;
  private String companhiaAerea;
  private String numeroVoo;
  private String status;
  private String assento;

  
  public Voo(int id, Data dataSaida, String horaSaida, Data dataChegada, String horaChegada,
             String origem, String destino, String companhiaAerea, String numeroVoo, String status) {
    this.id = id;
    this.dataSaida = dataSaida;
    this.horaSaida = horaSaida;
    this.dataChegada = dataChegada;
    this.horaChegada = horaChegada;
    this.origem = origem;
    this.destino = destino;
    this.companhiaAerea = companhiaAerea;
    this.numeroVoo = numeroVoo;
    this.status = status;
    this.assento = null; 
  }

  
  public void reservarAssento(String assento) {
    if (this.assento == null) {
      this.assento = assento;
    } else {
      System.out.println("Atenção: O assento selecionado já está reservado para este voo.");
    }
  }

  public void cancelarReserva() {
    this.assento = null;
  }

  public void embarcar() {
    if (this.status.equals("Confirmado")) {
      this.status = "Em voo";
    } else {
      System.out.println("Atenção: Voo não está confirmado para embarque.");
    }
  }

  public void desembarcar() {
    if (this.status.equals("Em voo")) {
      this.status = "Concluído";
    } else {
      System.out.println("Atenção: Voo não está em voo para desembarque.");
    }
  }

  public String getInformacoes() {
    return  "\nInformações do Voo:\n" +
            "ID: " + id + "\n" +
            "Data de saída: " + dataSaida + "\n" +
            "Hora de saída: " + horaSaida + "\n" +
            "Data de chegada: " + dataChegada + "\n" +
            "Hora de chegada: " + horaChegada + "\n" +
            "Origem: " + origem + "\n" +
            "Destino: " + destino + "\n" +
            "Companhia aérea: " + companhiaAerea + "\n" +
            "Número do voo: " + numeroVoo + "\n" +
            "Status: " + status + (assento != null ? "\nAssento: " + assento : "");
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
	  
  
  
}

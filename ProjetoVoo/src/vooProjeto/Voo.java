public class Voo {

  private int id;
  private String dataSaida;
  private String horaSaida;
  private String dataChegada;
  private String horaChegada;
  private String origem;
  private String destino;
  private String companhiaAerea;
  private String numeroVoo;
  private String status;
  private String assento;

  
  public Voo(int id, String dataSaida, String horaSaida, String dataChegada, String horaChegada,
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
}

package vooProjeto;

import java.time.LocalDate;

public class Voo {

 private int id = 12345;
 private LocalDate dataSaida = LocalDate.of(2024, 4, 15);
 private String horaSaida = "10:30"; 
 private String dataChegada = "2024, 4, 25";
 private String horaChegada = "13:00"; 
 private String origem = "Recife (REC)"; 
 private String destino = "São Paulo (GRU)";
 private String companhiaAerea = "LATAM";
 private String numeroVoo = "LA1234"; 
 private String status = "Confirmado";
 private String assento = null; 
 private double valorAssento = 450.00;


 public Voo(int id, LocalDate dataSaida, String horaSaida, String dataChegada, String horaChegada,
    String origem, String destino, String companhiaAerea, String numeroVoo, String status, double valorAssento) {
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
  this.valorAssento = valorAssento;
 }

 public void reservarAssento(String assento) {
  if (this.assento == null) {
   if (Aviao.disponivel(assento)) {
    this.assento = assento;
    System.out.println("Assento reservado com sucesso! Valor: R$" + valorAssento);
   } else {
    System.out.println("Assento indisponível para reserva.");
   }
  } else {
   System.out.println("Atenção: Assento já reservado para este voo.");
  }
 }

 public void cancelarReserva() {
  if (this.assento != null) {
   this.assento = null;
   System.out.println("Reserva de assento cancelada com sucesso!");
  } else {
   System.out.println("Atenção: Não há assento reservado para este voo.");
  }
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
  return "\nInformações do Voo:\n" +
    "ID: " + id + "\n" +
    "Data de saída: " + dataSaida.toString() + "\n" +
    "Hora de saída: " + horaSaida + "\n" +
    "Data de chegada: " + dataChegada + "\n" +
    "Hora de chegada: " + horaChegada + "\n" +
    "Origem: " + origem + "\n" +
    "Destino: " + destino + "\n" +
    "Companhia aérea: " + companhiaAerea + "\n" +
    "Número do voo: " + numeroVoo + "\n" +
    "Status: " + status + (assento != null ? "\nAssento: " + assento + " - R$" + valorAssento : "");
}

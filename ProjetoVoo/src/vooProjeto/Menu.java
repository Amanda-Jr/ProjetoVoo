package vooProjeto;
import java.util.Scanner;

public class Menu {
	
	public Voo exibirVoos(Aviao aviao) {
		Scanner sc = new Scanner(System.in);
		
		//Voo 1
		Voo saoPaulo = new Voo();
		saoPaulo.setId(123);
		Data saidachegadaSP = new Data(30,04,2024);
		saoPaulo.setDataSaida(saidachegadaSP);
		saoPaulo.setHoraSaida("12:00");
		saoPaulo.setDataChegada(saidachegadaSP);
		saoPaulo.setHoraChegada("14:00");
		saoPaulo.setOrigem("Brasilia - DF");
		saoPaulo.setDestino("Sao Paulo - SP");
		saoPaulo.setCompanhiaAerea("Brasilia Sky");
		saoPaulo.setNumeroVoo("1");
		saoPaulo.setValorAssento(450);
		saoPaulo.setAviao(aviao);
		
		//Voo 2
		Voo rioDeJaneiro = new Voo();
		rioDeJaneiro.setId(456);
		Data saidachegadaRJ = new Data(30,04,2024);
		rioDeJaneiro.setDataSaida(saidachegadaRJ);
		rioDeJaneiro.setHoraSaida("10:00");
		rioDeJaneiro.setDataChegada(saidachegadaRJ);
		rioDeJaneiro.setHoraChegada("12:30");
		rioDeJaneiro.setOrigem("Brasilia - DF");
		rioDeJaneiro.setDestino("Rio de Janeiro - RJ");
		rioDeJaneiro.setCompanhiaAerea("Brasilia Sky");
		rioDeJaneiro.setNumeroVoo("2");
		rioDeJaneiro.setValorAssento(450);
		rioDeJaneiro.setAviao(aviao);
		
		//Voo 3
		Voo gramado = new Voo();
		gramado.setId(789);
		Data saidachegadaGramado = new Data(30,04,2024);
		gramado.setDataSaida(saidachegadaGramado);
		gramado.setHoraSaida("13:00");
		gramado.setDataChegada(saidachegadaGramado);
		gramado.setHoraChegada("15:40");
		gramado.setOrigem("Brasilia - DF");
		gramado.setDestino("Gramado - RS");
		gramado.setCompanhiaAerea("Brasilia Sky");
		gramado.setNumeroVoo("3");
		gramado.setValorAssento(675);
		gramado.setAviao(aviao);
		
		System.out.println("Destinos Disponiveis: ");
		System.out.println(saoPaulo);
		System.out.println(rioDeJaneiro);
		System.out.println(gramado);
		System.out.println(" ");
		System.out.println("Escolha o numero do voo que deseja.");
		String numVoo = sc.next();
		
		switch (numVoo) {
			case "1": {
				System.out.println("Servico de Bordo: ");
				System.out.println("[a] Simples\n[b] Completo");
				String servico = sc.next();
				if(servico.equalsIgnoreCase("a")) {
					saoPaulo.setServicoDeBordo("Simples");
				}else if(servico.equalsIgnoreCase("b")) {
					saoPaulo.setServicoDeBordo("Completo");
				}
				return saoPaulo;
			}
			case "2": {
				System.out.println("Servico de Bordo: ");
				System.out.println("[a] Simples\n[b] Completo");
				String servico = sc.next();
				if(servico.equalsIgnoreCase("a")) {
					rioDeJaneiro.setServicoDeBordo("Simples");
				}else if(servico.equalsIgnoreCase("b")) {
					rioDeJaneiro.setServicoDeBordo("Completo");
				}
				return rioDeJaneiro;
			}
			case "3": {
				System.out.println("Servico de Bordo: ");
				System.out.println("[a] Simples\n[b] Completo");
				String servico = sc.next();
				if(servico.equalsIgnoreCase("a")) {
					gramado.setServicoDeBordo("Simples");
				}else if(servico.equalsIgnoreCase("b")) {
					gramado.setServicoDeBordo("Completo");
				}
				return gramado;
			}
			default:
				System.out.println("Voo invalido!");
				return null;
			}
	}
	
	public Passageiro cadastroPassageiro(Aviao aviao) {
		Scanner sc = new Scanner(System.in);
		//Cadastro do Passageiro
		System.out.println("Bem-vindo(a) ao atendimento do Aeroporto Nacional Brasilia Sky");
		System.out.println("Vamos realizar o seu cadastro...");
		System.out.println("Precisamos primeiro do seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Agora sua data de nascimento.");
		System.out.println("O dia em que voce nasceu: ");
		int dia = sc.nextInt();
		System.out.println("O mes em que voce nasceu: ");
		int mes = sc.nextInt();
		System.out.println("O ano em que voce nasceu: ");
		int ano = sc.nextInt();
		Data dataNsc = new Data(dia, mes, ano);
		
		System.out.println("Cadastrado(a), " + nome);
		
		//Escolha do Destino
		Voo destino = exibirVoos(aviao);

		while(destino == null) {
			destino = exibirVoos(aviao);
		}
		
		
		int confAssento;
		do {
			System.out.println("\nEscolha o assento que deseja: ");
			aviao.exibirAssentos();
			String assento = sc.next();
			destino.reservarAssento(assento);
			aviao.exibirAssentos();
			System.out.println("Confirmar assento? [1]sim [0]nao");
			confAssento = sc.nextInt();
			if(confAssento == 0) {
				destino.cancelarReserva(assento);
			}
		}while(confAssento == 0);
		
		System.out.println("\nSevico para despache de malas");
		System.out.println("Quantas malas voce esta carregando? ");
		int qntMalas = sc.nextInt();
		
		return new Passageiro(nome, dataNsc, destino, qntMalas);
	}
	
}

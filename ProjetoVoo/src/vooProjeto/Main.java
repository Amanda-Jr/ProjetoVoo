package vooProjeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Aviao aviao = new Aviao();
		ServicoBordo serv1 = new ServicoBordo();
		Passageiro p1;
		
		
		p1 = menu.cadastroPassageiro(aviao);
		p1.despacharMala();
		
		serv1.setVoo(p1.getPassagem());
		serv1.inicializarEstoque();
		
		
		System.out.println("Deseja comprar algo? [1] sim [0]nao");
		int servico = sc.nextInt();
		if(servico == 1) {
			serv1.comprar();
		}
		p1.getPassagem().valorTotal();
		System.out.println("Obrigado por viajar com a Brasilia Sky! :)");

		
	}

}
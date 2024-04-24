package vooProjeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Aviao aviao = new Aviao();
		Passageiro p1;
		
		Data dCom = new Data(15,01,1987);
		Comissario c1 = new Comissario("Joana", dCom, 14500);
		Data dSeg = new Data(15, 02, 1990);
		Seguranca s1 = new Seguranca("Marcelo", dSeg, 14000);
		
		
		p1 = menu.cadastroPassageiro(aviao);
		p1.setSeguranca(s1);
		p1.despacharMala();
		p1.getPassagem().embarcar();
		
		c1.setVoo(p1.getPassagem());
		c1.inicializarEstoque();
		
		
		System.out.println("Deseja comprar algo? [1] sim [0]nao");
		int servico = sc.nextInt();
		if(servico == 1) {
			c1.comprar();
		}
		p1.getPassagem().valorTotal();
		System.out.println("Obrigado por viajar com a Brasilia Sky! :)");
		p1.getPassagem().desembarcar();
		
		
	}

}
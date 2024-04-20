package vooProjeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Aviao aviao = new Aviao();
		Passageiro p1;
	
		
		
		p1 = menu.cadastroPassageiro(aviao);
		p1.despacharMala();
		p1.getPassagem().valorTotal();
		
		
	}

}

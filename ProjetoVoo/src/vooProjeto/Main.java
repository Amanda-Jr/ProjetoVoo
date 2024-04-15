package vooProjeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aviao aviao = new Aviao();
		Passageiro p1;
		Data sChina = new Data(20,04,2024);
		Data cChina = new Data(22,04,2024);
		Voo china = new Voo(sChina, cChina, aviao);
		
		// cadastro do passageiro
		System.out.println("Bem-vindo ao atendimento do Aeroporto Nacional");
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
		System.out.println("\nEscolha o assento que deseja: ");
		aviao.exibirAssentos();
		aviao.disponivel(sc.next());
		aviao.exibirAssentos();
		System.out.println("\nVamos despachar suas malas");
		System.out.println("Quantas malas voce esta carregando? ");
		int qntMalas = sc.nextInt();
		p1 = new Passageiro(nome, dataNsc, china, qntMalas);
		p1.despacharMala();
		
		china.valorTotal();
		
	}

}
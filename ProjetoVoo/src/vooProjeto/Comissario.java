package vooProjeto;
import java.util.Scanner;

public class Comissario extends Funcionario {

	private String estoque[][];
	private Voo voo;

	
    public Comissario(String nome, Data dataNascimento, float salario) {
        super(nome, dataNascimento, salario);
        this.estoque = new String [6][3];
    }

    public void inicializarEstoque() {
    	estoque[0] = new String [] {"Agua", "5", "10"};
    	estoque[1] = new String [] {"Cream Cracker", "12", "8"};
    	estoque[2] = new String [] {"Amendoim", "7", "12"};
    	estoque[3] = new String [] {"Tabua de Frios", "115", "5"};
    	estoque[4] = new String [] {"Vinho Tinto", "96", "5"};
    	estoque[5] = new String [] {"Raviolli", "106", "5"};
    }

    public void exibirEstoque() {
    	int tam = 0;
    	if(voo.getServicoDeBordo().equalsIgnoreCase("Simples")) {
    		tam = 3;
    	}else if(voo.getServicoDeBordo().equalsIgnoreCase("Completo")) {
    		tam = 6;
    	}
    	System.out.println("Cardapio: ");
    	for(int i=0; i<tam; i++) {
    		System.out.print( (i+1) + " - " + estoque[i][0] + " " + estoque[i][1] + "R$ || Quantidade disponivel: " + estoque[i][2] + "\n");
    		}
  
    }
    
    
    public void valorServico(int opc, int qnt) {
    	if(qnt<=Integer.parseInt(estoque[opc-1][2])) {
    		voo.setTaxaServico(Integer.parseInt(estoque[opc-1][1]) * qnt);
    		int quantidade = Integer.parseInt(estoque[opc-1][2]) - qnt;
    		estoque[opc-1][2] = Integer.toString(quantidade);
    	}else {
    		System.out.println("Estoque invalido");
    	}
    }
    
    public void comprar() {
    	Scanner sc = new Scanner(System.in);
    	exibirEstoque();
    	System.out.println("Digite o opcao desejada: ");
    	int opcao = sc.nextInt();
    	System.out.println("Digite a quantidade:  ");
    	int quantidade = sc.nextInt();
    	valorServico(opcao, quantidade);
    	System.out.println("Deseja comprar mais alguma coisa? [1] sim [0] nao");
    	int comprarNov = sc.nextInt();
    	if(comprarNov == 1) {
    		comprar();
    	}
    }
    
    
    public void setVoo(Voo voo) {
    	this.voo = voo;
    }

}
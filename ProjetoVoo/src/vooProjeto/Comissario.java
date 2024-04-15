package vooProjeto;

public class Comissario extends Funcionario {

    private EstoqueAlimentos estoqueAlimentos;

    public Comissario(String nome, Data dataNascimento, float salario) {
        super(nome, dataNascimento, salario);
        this.estoqueAlimentos = new EstoqueAlimentos();
    }

    public void adicionarItensPadrao() {
        estoqueAlimentos.adicionarItem("Suco", 10);
        estoqueAlimentos.adicionarItem("Água", 20);
        estoqueAlimentos.adicionarItem("Amendoim", 50);
        estoqueAlimentos.adicionarItem("Salgadinho", 30);
    }

    public void adicionarAlimento(String nomeItem, int quantidade) {
        estoqueAlimentos.adicionarItem(nomeItem, quantidade);
    }

    public void removerAlimento(String nomeItem) {
        estoqueAlimentos.removerItem(nomeItem);
    }

    public int verificarEstoque(String nomeItem) {
        return estoqueAlimentos.verificarQuantidade(nomeItem);
    }

}
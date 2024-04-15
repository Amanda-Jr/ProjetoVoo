public class EstoqueAlimentos {
    private Map<String, Integer> estoque;

    public EstoqueAlimentos() {
        estoque = new HashMap<>();
    }

    public void adicionarItem(String nomeItem, int quantidade) {
        if (estoque.containsKey(nomeItem)) {
            int quantidadeAtual = estoque.get(nomeItem);
            estoque.put(nomeItem, quantidadeAtual + quantidade);
        } else {
            estoque.put(nomeItem, quantidade);
        }
    }

    public void removerItem(String nomeItem) {
        if (estoque.containsKey(nomeItem)) {
            estoque.remove(nomeItem);
        } else {
            System.out.println("O item " + nomeItem + " não está no estoque.");
        }
    }

    public int verificarQuantidade(String nomeItem) {
        return estoque.getOrDefault(nomeItem, 0);
    }
}
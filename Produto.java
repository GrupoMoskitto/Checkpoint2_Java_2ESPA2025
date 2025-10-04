public class Produto {
    private int numeroItem;
    private String nomeProduto;
    private int quantidadeEstoque;
    private double preco;
    private boolean ativo = true;


    public Produto() {}


    public Produto(int numeroItem, String nomeProduto, int quantidadeEstoque, double preco) {
        this.numeroItem = numeroItem;
        this.nomeProduto = nomeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }


    public int getNumeroItem() { return numeroItem; }
    public void setNumeroItem(int numeroItem) { this.numeroItem = numeroItem; }

    public String getNomeProduto() { return nomeProduto; }
    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public void setQuantidadeEstoque(int quantidadeEstoque) { this.quantidadeEstoque = quantidadeEstoque; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }


    public double getValorEstoque() {
        return preco * quantidadeEstoque;
    }


    @Override
    public String toString() {
        return "Número do Item\t: " + numeroItem +
                "\nNome\t\t\t: " + nomeProduto +
                "\nQuantidade em Estoque\t: " + quantidadeEstoque +
                "\nPreço\t\t\t: R$ " + String.format("%.2f", preco) +
                "\nValor do Estoque\t: R$ " + String.format("%.2f", getValorEstoque()) +
                "\nStatus do Produto\t: " + (ativo ? "Ativo" : "Descontinuado") + "\n";
    }
}

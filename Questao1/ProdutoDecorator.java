package Questao1;

public abstract class ProdutoDecorator implements ICarrinho{
    protected ICarrinho carrinho;
    protected String descricao;
    protected float preco;

    public ProdutoDecorator() {
    }

    public ProdutoDecorator(ICarrinho carrinho, String descricao, float preco) {
        this.carrinho = carrinho;
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public float getValorCompra() {
        return preco+carrinho.getValorCompra();
    }

    @Override
    public void listarCompra() {
        carrinho.listarCompra();
        System.out.println(descricao+": R$"+preco);
    }
}

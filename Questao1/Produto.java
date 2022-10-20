package Questao1;

public class Produto extends ProdutoDecorator{

    public Produto(){
        super();
    }

    public Produto(ICarrinho carrinho, String descricao, float preco) {
        super(carrinho, descricao, preco);
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

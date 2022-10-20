package Questao1;

public class Arroz extends ProdutoDecorator{

    public Arroz() {
    }

    public Arroz(ICarrinho carrinho){
        super(carrinho, "Arroz", 10);
    }

    public Arroz(ICarrinho carrinho, String descricao, float preco) {
        super(carrinho, descricao, preco);
    }
    
}

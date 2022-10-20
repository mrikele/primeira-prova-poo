package Questao1;

public class Feijao extends ProdutoDecorator{

    public Feijao() {
    }

    public Feijao(ICarrinho carrinho){
        super(carrinho, "Feijão", 15);
    }

    public Feijao(ICarrinho carrinho, String descricao, float preco) {
        super(carrinho, descricao, preco);
    }
    
}

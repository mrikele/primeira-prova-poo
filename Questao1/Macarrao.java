package Questao1;

public class Macarrao extends ProdutoDecorator{

    public Macarrao() {
    }

    public Macarrao(ICarrinho carrinho){
        super(carrinho, "Macarrão", 12);
    }

    public Macarrao(ICarrinho carrinho, String descricao, float preco) {
        super(carrinho, descricao, preco);
    }
    
}

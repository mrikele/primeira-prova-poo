package Questao1;

public class Main {
    public static void main(String[] args) {
        ICarrinho compra = new Compra();
        compra = new Produto(compra, "Abacate", 15);
        compra = new Produto(compra, "Carne", 50);
        compra = new Feijao(compra);
        compra = new Arroz(compra);
        compra = new Macarrao(compra);
        System.out.println(compra.getValorCompra());
        compra.listarCompra();
    }
}

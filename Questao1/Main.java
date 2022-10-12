package Questao1;

public class Main {
    public static void main(String[] args) {
        ICarrinho compra = new Compra();
        compra = new Produto(compra, "Abacate", 15);
        compra = new Produto(compra, "Feijão", 20);
        System.out.println(compra.getValorCompra());
        compra.listarCompra();
    }
}

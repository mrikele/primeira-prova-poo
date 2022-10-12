package questao4;
import questao4.pagamentos.Boleto;
import questao4.pagamentos.CartaoCredito;
import questao4.pagamentos.Pix;

public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente("Maria Rikele");
        Pix pagamento1 = new Pix(cliente1);
        cliente1.Exibe();
        pagamento1.Pagar();

        System.out.print("-------------------------------\n");

        Cliente cliente2 = new Cliente("Maria Aparecida");
        CartaoCredito pagamento2 = new CartaoCredito(cliente2);
        cliente2.Exibe();
        pagamento2.Pagar();

        System.out.print("-------------------------------\n");

        Cliente cliente3 = new Cliente("Maria José");
        Boleto pagamento3 = new Boleto(cliente3);
        cliente3.Exibe();
        pagamento3.Pagar();


    }
}

package questao4.pagamentos;
import questao4.Cliente;
import questao4.Pagamento;

public class CartaoCredito implements Pagamento{
    public CartaoCredito(Cliente cliente){}

    @Override
    public void Pagar() {
        System.out.println("Pagando com o cartão de crédito");
        // TODO Auto-generated method stub
        
    }
    
}

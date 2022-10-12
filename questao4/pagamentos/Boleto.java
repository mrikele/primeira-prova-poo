package questao4.pagamentos;
import questao4.Cliente;
import questao4.Pagamento;

public class Boleto implements Pagamento{
    public Boleto(Cliente cliente){};

    @Override
    public void Pagar() {
        System.out.println("Pagando com boleto...");
        // TODO Auto-generated method stub
        
    }
    
}

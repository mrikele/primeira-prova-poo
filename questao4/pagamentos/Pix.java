package questao4.pagamentos;
import questao4.Cliente;
import questao4.Pagamento;

public class Pix implements Pagamento{
    public Pix(Cliente cliente){}

    @Override
    public void Pagar() {
        System.out.println("Pagando com o pix");
        // TODO Auto-generated method stub
        
    }
    
}

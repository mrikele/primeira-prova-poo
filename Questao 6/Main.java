package Questao6;
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaEspecial(0,500);
        ContaCorrente conta2 = new ContaCorrente();
        Cliente cliente1 = new Cliente("João");
        cliente1.adicionarConta(conta1);
        cliente1.getConta().depositar(200);
        cliente1.getConta().sacar(100);
        cliente1.getConta().sacar(150);
        System.out.println(cliente1.toString());
        cliente1.adicionarConta(conta2);
        cliente1.getConta(0).transferir(cliente1.getConta(1), 70);
        System.out.println(cliente1.toString());
    }
}

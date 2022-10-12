public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaEspecial(0,500);
        Cliente cliente1 = new Cliente("João", conta1);
        cliente1.getConta().depositar(200);
        cliente1.getConta().sacar(100);
        cliente1.getConta().sacar(150);
        System.out.println(cliente1.toString());
    }
}

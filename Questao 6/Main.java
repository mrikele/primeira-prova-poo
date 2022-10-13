public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João");
        cliente1.setConta(new ContaEspecial(0,500));
        cliente1.getConta().depositar(200);
        cliente1.getConta().sacar(100);
        cliente1.getConta().sacar(150);
        System.out.println(cliente1.toString());
    }
}

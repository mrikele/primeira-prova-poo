package Questao2;

public class Main {
    public static void main(String[] args) {
        Local estacionamento = new Estacionamento();
        estacionamento = new Carro(estacionamento, 4);
        estacionamento = new Carro(estacionamento, 5);
        estacionamento = new Carro(estacionamento, 3);
        System.out.println("Quantidade de pessoas: "+estacionamento.getQuantPessoasEstacionamento());
        estacionamento.listarCarros();
    }
}

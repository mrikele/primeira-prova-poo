package Questao2;

public class Carro extends CarroDecorator{

    public Carro() {
        super();
    }

    public Carro(Local local, int quantPessoas) {
        super(local, quantPessoas);
    }

    @Override
    public int getQuantPessoasEstacionamento() {
        return quantPessoas+local.getQuantPessoasEstacionamento();
    }

    @Override
    public void listarCarros() {
        local.listarCarros();
        System.out.println(local+": "+quantPessoas+" pessoas");//Não tem placa, então vai o que foi mesmo
    }
    

}

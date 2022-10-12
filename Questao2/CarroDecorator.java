package Questao2;

public abstract class CarroDecorator implements Local{
    protected Local local;
    protected int quantPessoas;
    protected int quantMaxPessoas;

    public CarroDecorator() {
    }

    public CarroDecorator(Local local, int quantPessoas, int quantMaxPessoas) {
        this.local = local;
        this.quantPessoas = quantPessoas;
        this.quantMaxPessoas = quantMaxPessoas;
    }

    public CarroDecorator(int quantPessoas, int quantMaxPessoas) {
        this.quantPessoas = quantPessoas;
        this.quantMaxPessoas = quantMaxPessoas;
    }

    public CarroDecorator(Local local, int quantPessoas) {
        this.local = local;
        this.quantPessoas = quantPessoas;
    }
    
}

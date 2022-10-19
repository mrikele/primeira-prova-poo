package Questao6;
public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }

    public boolean sacar(float valor){
        if(saldo-valor < -limite){
            return false;
        }else{
            saldo = saldo-valor;
            return true;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial\n -Saldo: "+saldo+"\n -Limite: "+limite;
    }
    
}
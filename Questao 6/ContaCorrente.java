public class ContaCorrente {
    protected float saldo;

    public ContaCorrente() {
        this.saldo = (float) 0.0;
    }

    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(float valor){
        saldo = saldo+valor;
    }

    public boolean sacar(float valor){
        if(saldo < valor){
            return false;
        }else{
            saldo = saldo-valor;
            return true;
        }
        
    }

    @Override
    public String toString() {
        return "ContaCorrente\n -Saldo: "+saldo;
    }
    
    public boolean transferir(ContaCorrente conta){
        return false;
    }
}

package questao5;

public abstract class UFALBluetooth {
    public UFALBluetooth(){
        EstabelecerConexao();
        ProcessandoDados();
        FecharConexao();
    }
    public void EstabelecerConexao(){
        System.out.println("Estabelecendo conexão...");
    }
    public void ProcessandoDados(){};

    public void FecharConexao(){
        System.out.println("Fechando conexão...");
    }

}

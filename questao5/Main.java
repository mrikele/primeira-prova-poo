package questao5;

public class Main {
    public static void main(String[] args){
        Serial serial = new Serial();
        serial.EstabelecerConexao();
        serial.ProcessandoDados();
        serial.FecharConexao();
        
        System.out.print("-------------------------------\n");

        Pacote pacote = new Pacote();
        pacote.EstabelecerConexao();
        pacote.ProcessandoDados();
        pacote.FecharConexao();
    }
    
}

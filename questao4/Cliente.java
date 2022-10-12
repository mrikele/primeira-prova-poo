package questao4;

public class Cliente {
    private String nome;
    
    public Cliente(String nome){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void Exibe(){
        System.out.println("Nome do cliente: " + getNome());
    }
}
    

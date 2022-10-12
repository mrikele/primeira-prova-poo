package questao3;

public class User {
    private String nome;
    private String email;

    public User(String nome, String email){
        this.nome=nome;
        this.email=email;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return email;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void Exibe(){
        System.out.println("Nome: " + getNome() + "||" + "Email: " + getEmail());
    }
}
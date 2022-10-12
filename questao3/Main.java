package questao3;
import questao3.SingleSignOn.Google;

public class Main{
    public static void main(String[] args){
        User usuario1 = new User("Maria", "maria@gmail.com");
        Formulario login1 = new Formulario(usuario1);
        usuario1.Exibe();
        login1.Logar();

        User usuario2 = new User("José", "jose@gmail.com");
        Google login2 = new Google(usuario2);
        usuario2.Exibe();
        login2.Logar();
    }
}


import java.util.Scanner;
public class contatos {
    Scanner sc = new Scanner(System.in);
    String nome;
    String telefone;
    String email;
    String endereco;

    public void LerParametros(){
        String a,b,c,d;
        System.out.println("Digite nome, telefone, email e endereço");
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();
        d = sc.nextLine();
        this.nome = a;
        this.telefone = b;
        this.email = c;
        this.endereco = d;
    }
    public void MostraParametros(){
        System.out.println(" Nome: " + this.nome + " \n telefone: " + this.telefone + " \n email: " + this.email + " \n endereço: " + this.endereco);
        System.out.println();
    }
}

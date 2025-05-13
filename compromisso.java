import  java.util.Scanner;
public class compromisso {
    String nome;
    String datahorario;
    String descricao;
    String local;
    int prioridade;
    String listaenvolvidos;

    public void LerParametros(){
        System.out.println("Digite nome, data e hora, descrição do evento, local, nivel de prioridade e a lista dos envolvidos");
        Scanner sc = new Scanner(System.in);
        this.nome = sc.nextLine();
        this.datahorario = sc.nextLine();
        this.descricao = sc.nextLine();
        this.local = sc.nextLine();
        this.prioridade = sc.nextInt();
        sc.nextLine();
        this.listaenvolvidos = sc.nextLine();
    }
    public void MostraParametros(){
        System.out.println("Compromisso: " + this.nome + " \ndata/horario: " + this.datahorario + " \nDescrição: " + this.descricao + " \nLocalização: " + this.local + " \nnivel de prioridade: " + this.prioridade + " \nLista de envolvidos: " + this.listaenvolvidos);
        System.out.println();
    }
}

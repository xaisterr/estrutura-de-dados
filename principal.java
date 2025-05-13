import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variaveis usadas para os 2
        int resp;
        int n = 0;
        String RespStr;
        //variaveis usadas por contatos
        ArrayList<contatos> cont = new ArrayList<contatos>();
        //variaveis usadas por compromissos
        ArrayList<compromisso> comp = new ArrayList<compromisso>();

        while (true) {
            System.out.println("Escolha entre operar contatos, compromisso ou sair?");
            RespStr = sc.nextLine();
            if (RespStr.matches("sair")){
                break;
            }
            if (RespStr.matches("contatos")) {
                System.out.println("Escolha uma operação: \n 1-inserir \n 2-visualizar \n 3-excluir \n 4-atualizar ");
                resp = sc.nextInt();
                sc.nextLine(); // Consome a quebra de linha pendente

                if (resp == 1) {
                    contatos c = new contatos();
                    c.LerParametros();
                    cont.add(c);
                } // fimse
                if (resp == 2) {
                    System.out.println("Deseja visualizar a lista de contatos ou um em especifico? \n 1-Lista \n 2-Especifico");
                    resp = sc.nextInt();
                    sc.nextLine(); // Consome a quebra de linha pendente

                    if (resp == 1) {
                        for (int i = 0; i < cont.size(); i++) {
                            cont.get(i).MostraParametros();
                        } // fim do for
                    } // fimse
                    if (resp == 2) {
                        System.out.println("Digite o numero de telefone do contato: ");
                        RespStr = sc.next();
                        sc.nextLine(); // Consome a quebra de linha pendente

                        for (int i = 0; i < cont.size(); i++) {
                            if (cont.get(i).telefone.matches(RespStr)) {
                                cont.get(i).MostraParametros();
                            } // fimse
                        } // fim do for
                    } // Fimse
                } // fimse
                if (resp == 3) {
                    System.out.println("Digite o numero de telefone do contato: ");
                    RespStr = sc.next();
                    sc.nextLine(); // Consome a quebra de linha pendente

                    for (int i = 0; i < cont.size(); i++) {
                        if (cont.get(i).telefone.matches(RespStr)) {
                            cont.remove(i);
                        } // fimse
                    } // fim do for
                } // fimse
                if (resp == 4) {
                    System.out.println("Digite o numero de telefone do contato: ");
                    RespStr = sc.next();
                    sc.nextLine(); // Consome a quebra de linha pendente

                    for (int i = 0; i < cont.size(); i++) {
                        if (cont.get(i).telefone.matches(RespStr)) {
                            cont.get(i).MostraParametros();
                            n = i;
                        } // fimse

                    } // fim do for
                    System.out.println("Digite o parametro que quer atualizar: \n -nome \n -email \n -endereço ");
                    RespStr = sc.next();
                    sc.nextLine(); // Consome a quebra de linha pendente

                    if (RespStr.matches("nome")) {
                        System.out.println("Digite o novo nome:");
                        cont.get(n).nome = sc.nextLine();
                    }
                    if (RespStr.matches("email")) {
                        System.out.println("Digite o novo email:");
                        cont.get(n).email = sc.nextLine();
                    }
                    if (RespStr.matches("endereço")) {
                        System.out.println("Digite o novo endereço:");
                        cont.get(n).endereco = sc.nextLine();
                    }

                } // fimse

            } // fimse das operações com contatos
            if (RespStr.matches("compromisso")) {
                System.out.println("Escolha uma operação: \n 1-inserir \n 2-visualizar \n 3-excluir \n 4-atualizar ");
                resp = sc.nextInt();
                sc.nextLine(); // Consome a quebra de linha pendente
                if (resp == 1) {
                    compromisso Comp = new compromisso();
                    Comp.LerParametros();
                    comp.add(Comp);
                }
                if (resp == 2) {
                    System.out.println("Deseja visualizar a lista de compromissos ou um em especifico? \n 1-Lista \n 2-Especifico");
                    resp = sc.nextInt();
                    sc.nextLine(); // Consome a quebra de linha pendente

                    if (resp == 1) {
                        for (int i = 0; i < comp.size(); i++) {
                            comp.get(i).MostraParametros();
                        } // fim do for
                    } // fimse
                    if (resp == 2) {
                        System.out.println("Digite a data do compromisso: ");
                        RespStr = sc.next();
                        sc.nextLine(); // Consome a quebra de linha pendente

                        for (int i = 0; i < comp.size(); i++) {
                            if (comp.get(i).datahorario.matches(RespStr)) {
                                comp.get(i).MostraParametros();
                            } // fimse
                        } // fim do for
                    }//fimse
                }//fimse
                if (resp == 3){
                    System.out.println("Digite a data do compromisso: ");
                    RespStr = sc.next();
                    sc.nextLine(); // Consome a quebra de linha pendente

                    for (int i = 0; i < comp.size(); i++) {
                        if (comp.get(i).datahorario.matches(RespStr)) {
                            comp.remove(i);
                        } // fimse
                    } // fim do for
                }//fimse
                if (resp == 4){
                    System.out.println("Digite a data do compromisso: ");
                    RespStr = sc.nextLine();


                    for (int i = 0; i < comp.size(); i++) {
                        if (comp.get(i).datahorario.matches(RespStr)) {
                            n = i;
                        } // fimse
                    } // fim do for
                    System.out.println("Digite o parametro que quer atualizar: \nnome \ndescrição \nlocal \nprioridade \nlista de envolvidos");
                    RespStr = sc.nextLine();


                    if (RespStr.matches("nome")){
                        System.out.println("Digite o novo nome:");
                        RespStr = sc.nextLine();
                        comp.get(n).nome = RespStr;
                    }
                    if (RespStr.matches("descrição")){
                        System.out.println("Digite a nova descrição:");
                        RespStr = sc.nextLine();
                        comp.get(n).descricao = RespStr;
                    }
                    if (RespStr.matches("local")){
                        System.out.println("Digite o novo local:");
                        RespStr = sc.nextLine();
                        comp.get(n).local = RespStr;
                    }
                    if (RespStr.matches("prioridade")){
                        System.out.println("Digite o novo nivel de prioridade:");
                        resp = sc.nextInt();
                        sc.nextLine(); // Consome a quebra de linha pendente
                        comp.get(n).prioridade = resp;
                    }
                    if (RespStr.matches("lista")){
                        System.out.println("Digite a nova lista de envolvidos:");
                        RespStr = sc.nextLine();
                        comp.get(n).listaenvolvidos = RespStr;
                    }
                }
            }//fim das operações com compromisso
        } // fim do while
    } // fim do main
} // fim da classe

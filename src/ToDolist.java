import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public abstract class ToDolist implements Comparable{
    public static void main(String[] args) {

        System.out.println("***To Do List***");

        //Tarefas criadas para testar ordenação:
        Tarefas tarefa_1 = new Tarefas("Montar computador","montar todas as peças do computador","Hoje" ,2,"Trabalho",2);
        Tarefas tarefa_2 = new Tarefas("Arrumar a casa","Arrumar quarto e sala","Amanhã" ,3,"Casa",1);
        //ArrayList que conterá: Do, Doing e Done
        ArrayList <Tarefas> toDoList = new ArrayList<>();
        toDoList.add(tarefa_1);
        toDoList.add(tarefa_2);
        //Variável que liga e desliga o programa e contador p/ for
        int i = 0;
        int programaON = 1 ;
    while (programaON == 1){
        System.out.println("O que deseja fazer? digite um número");
        System.out.println("1 - adicionar tarefa," +
                " 2 - consultar tarefas" +
                " 3 - remover tarefa" +
                " 0 - sair");
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:{
                System.out.println("Digite o nome da tarefa:");
                String nome = sc.next();

                System.out.println("Digite o nome da descricao:");
                String descricao = sc.next();

                System.out.println("Digite a data de termino:");
                String dataTermino = sc.next();

                System.out.println("Qual a prioridade? 1-Muito alta, 2-Alta, 3-Média, 4-Baixa, 5-Muito baixa:");
                int prioridade = sc.nextInt();

                System.out.println("Digite o nome da categoria:");
                String categoria = sc.next();

                System.out.println("Qual o status? 1-Para fazer , 2-Fazendo, 3-Feito:");
                int status = sc.nextInt();

                toDoList.add(new Tarefas(nome,descricao,dataTermino,prioridade,categoria,status));
                System.out.println("Tarefa adiciona com sucesso");
                break;
            }

            case 2:{ System.out.println("Consultar por: 1-Categoria, 2-Prioridade, 3-Status");
                int opcao2 = sc.nextInt();
                    switch (opcao2){
                        case 1:{
                            Function <Tarefas, String> extraiCategoria = t -> t.getCategoria();
                            Comparator<Tarefas> comparacaoCategoria = Comparator.comparing(extraiCategoria);
                            toDoList.sort(comparacaoCategoria);
                            System.out.println(toDoList);
                            break;
                        }
                        case 2:{
                            ToIntFunction<Tarefas> extraiPrioridade= t -> t.getNivelPrioridade();
                            Comparator <Tarefas> comparacaoPrioridade = Comparator.comparingInt(extraiPrioridade);
                            toDoList.sort(comparacaoPrioridade);
                            System.out.println(toDoList);
                            break;
                        }


                        case 3:{
                            ToIntFunction<Tarefas> extraiStatus = t -> t.getStatus();
                            Comparator <Tarefas> comparacaoStatus = Comparator.comparingInt(extraiStatus);
                            toDoList.sort(comparacaoStatus);
                            System.out.println(toDoList);
                        break;}

                    }; break;
            }
            case 3: {
                for (Tarefas tarefa : toDoList) {
                    System.out.println("indice: [" + i + "] " + tarefa);
                    i++;
                }
                System.out.println("Qual indice da tarefa que deseja remover? ");
                int indiceDelete= sc.nextInt();
                toDoList.remove(indiceDelete);
                System.out.println( indiceDelete + "foi removido ");
                System.out.println("LISTA ATUAL:" + toDoList);
                i = 0;
                }

        }
        System.out.println("Continuar o programa? 1- sim, 2-não");
        programaON = sc.nextInt();
    }
}
}









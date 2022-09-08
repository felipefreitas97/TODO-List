import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Tarefas implements Comparable <Tarefas> {

    private String nome;
    private String descricao;
    private String dataTermino;
    private int nivelPrioridade;
    private String categoria;
    private int status;




    @Override
    public String toString() {
        return "[NOME = " + nome + ", " + "DESCRIÇÃO = " + descricao +"\n"+
                "DATA TERMINO =" + dataTermino +", " +"PRIORIDADE = " + nivelPrioridade + "\n"+
                "CATEGORIA = " + categoria + ", " + "STATUS = " + status + ']'+"\n";
    }
    @Override
    public int compareTo(Tarefas o) {
        if (this.status < o.status){
            return -1;
        } else if (this.status < o.status){
            return 1;
        }
        return 0;
    }

    public interface Comparator{
        int compare(Tarefas o1, Tarefas o2);
    }



    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino (String dataTermino) {
        this.dataTermino = dataTermino;
    }
    public int getNivelPrioridade () {
        return nivelPrioridade;
    }

    public void setNivelPrioridade (int nivelPrioridade) {
        this.nivelPrioridade = nivelPrioridade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria (String categoria) {
        this.categoria = categoria;
    }

    public int getStatus () {
        return status;
    }

    public void setStatus (int status) {
        this.status = status;
    }

    public Tarefas(String nome,String descricao,String dataTermino,int nivelPrioridade,String categoria,int status){
        this.nome = nome;
        this.descricao = descricao;
        this.dataTermino = dataTermino;
        this.nivelPrioridade = nivelPrioridade;
        this.categoria = categoria;
        this.status = status;


    }

}


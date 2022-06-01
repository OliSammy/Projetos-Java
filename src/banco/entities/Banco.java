package banco.entities;
import java.util.ArrayList;

public class Banco {
    private String nome;
    private int idBanco;
    private ArrayList<Conta> contas;

    public Banco(){}

    public Banco(String nome, int idBanco){
        this.nome = nome;
        this.idBanco = idBanco;
        contas = new ArrayList<Conta>();
    }

    public void adicionar(Conta x){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdBanco() {
        return idBanco;
    }
    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }
    public ArrayList<Conta> getContas() {
        return contas;
    }
    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    
}

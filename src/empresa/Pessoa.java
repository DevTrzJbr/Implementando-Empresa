package empresa;

import java.util.HashMap;
import java.util.Map;

public class Pessoa {
    protected String nome;
    protected long contribuinte; // CPF
    protected int idade;
    protected CodigoPostal cp;
    protected Map <String, CodigoPostal> mapCp = new HashMap<>();

    public Pessoa() {
    }
    
    public Pessoa(String nome, long contribuinte, int idade) {
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
    }
    
    public void inserir(String nome, CodigoPostal cp){
        mapCp.put(nome, cp);
    }
    
    public void buscarCp(String contribuinte){
        mapCp.get(contribuinte).mostraCp();
    }
    
    public void remover(String nome){
        mapCp.remove(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getContribuinte() {
        return this.contribuinte;
    }

    public void setContribuinte(long contribuinte) {
        this.contribuinte = contribuinte;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
package empresa;

public class Pessoa {
    protected String nome;
    protected long contribuinte; // CPF
    protected int idade;
    protected CodigoPostal cp;

    public Pessoa() {
    }
    
    public Pessoa(String nome, long contribuinte, int idade) {
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
    }
    
    public Pessoa(String nome, long contribuinte, int idade, CodigoPostal cp) {
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
        this.cp = cp;
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

    public CodigoPostal getCp() {
        return this.cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }

}
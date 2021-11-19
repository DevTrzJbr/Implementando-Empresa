public class Pessoa {
    private String nome;
    private long contribuinte;
    private int idade;
    public CodigoPostal cp;


    public Pessoa(String nome, long contribuinte, int idade) {
        this.nome = nome;
        this.contribuinte = contribuinte;
        this.idade = idade;
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

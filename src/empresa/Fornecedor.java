package empresa;

public class Fornecedor extends Pessoa {
    private float plafond;
    private float valorEmDivida;    

    public Fornecedor(String nome, long contribuinte, int idade, float plafond) {
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;
    }
    
    public float getPlafond() {
        return this.plafond;
    }

    public void setPlafond(float plafond) {
        this.plafond = plafond;
    }

    public float getValorEmDivida() {
        return this.valorEmDivida;
    }

    public void setValorEmDivida(float valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }

}
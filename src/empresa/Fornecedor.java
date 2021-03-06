package empresa;

public class Fornecedor extends Pessoa {
    private float plafond;  // Teto (limite máximo de despesa)
    private float valorEmDivida;  // 

    public Fornecedor(String nome, long contribuinte, int idade, float plafond) {
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = 0f;
    }
    
    public Fornecedor(String nome, long contribuinte, int idade, float plafond, CodigoPostal cp) {
        super(nome, contribuinte, idade, cp);
        this.plafond = plafond;
        this.valorEmDivida = 0f;
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
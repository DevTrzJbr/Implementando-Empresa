package empresa;

public class Cliente extends Pessoa {
    private float plafond; // teto (limite crédito)
    private float valorEmDivida;  // O quanto deve a Empresa
    private float saldo;  // Crédito na Empresa
    
    
    public Cliente(String nome, long contribuinte, int idade, float plafond) {
        super(nome, contribuinte, idade);
        this.plafond = plafond;
    }
    
    public Cliente(String nome, long contribuinte, int idade, float plafond, CodigoPostal cp) {
        super(nome, contribuinte, idade, cp);
    }

    public Cliente(String nome, long contribuinte, int idade, float plafond, float valorEmDivida) {
        super(nome, contribuinte, idade);
        this.plafond = plafond;
        this.valorEmDivida = valorEmDivida;
    }
    
    public float obterSaldo() {
        return this.saldo = this.plafond - this.valorEmDivida;
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

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    

}
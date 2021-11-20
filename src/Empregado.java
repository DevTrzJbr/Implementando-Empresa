public class Empregado extends Pessoa {
    private int numeroSeccao;
    private float salarioBase;
    private float iRS;
    private float salario;
    
    public Empregado(String nome, long contribuinte, int idade, int numeroSeccao, float salarioBase, float iRS) {
        super(nome, contribuinte, idade);
        this.numeroSeccao = numeroSeccao;
        this.salarioBase = salarioBase;
        this.iRS = iRS;
    }

    // fonte: https://info.portaldasfinancas.gov.pt/pt/informacao_fiscal/codigos_tributarios/cirs_rep/Pages/irs68.aspx
    public float calcularSalario() {

        if (salarioBase >= 7112) {
            iRS = 0.145f;
        } else if (salarioBase >= 10732) {
            iRS = 0.23f;
        } else if (salarioBase >= 20322) {
            iRS = 0.28f;
        } else if (salarioBase >= 25075) {
            iRS = 0.35f;
        } else if (salarioBase >= 36967) {
            iRS = 0.37f;
        } else if (salarioBase >= 80882) {
            iRS = 0.45f;
        } else {
            iRS = 0.48f;
        }

        return this.salario = this.salarioBase * 1 - this.iRS;
    }
    
    public int getNumeroSeccao() {
        return this.numeroSeccao;
    }

    public void setNumeroSeccao(int numeroSeccao) {
        this.numeroSeccao = numeroSeccao;
    }

    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getIRS() {
        return this.iRS;
    }

    public void setIRS(float iRS) {
        this.iRS = iRS;
    }


    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


}

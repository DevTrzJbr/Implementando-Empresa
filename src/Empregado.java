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

    public float calcularSalario() {
        return this.salario = this.salarioBase * this.iRS;
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

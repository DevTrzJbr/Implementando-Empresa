import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    private String nome;
    private int dataFundacao;
    private CodigoPostal cp;
    
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private List<Empregado> empregados = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataFundacao() {
        return this.dataFundacao;
    }

    public void setDataFundacao(int dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public CodigoPostal getCodigoPostal() {
        return this.cp;
    }

    public void setCodigoPostal(CodigoPostal cp) {
        this.cp = cp;
    }

    public void addPessoa(Pessoa p) {

    }

    public void addProduto(Produto p) {

    }

    public void mostraPessoa() {
        
    }

    public void mostraProduto() {
        
    }
    
    public void mostraFornecedores() {
        System.out.println("---------LISTA DE FORNECEDORES---------");

        if (fornecedores.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            for (Fornecedor listaFornecedor : fornecedores) {
                System.out.println(listaFornecedor.getNome());
            }
        }
    }

    public void mostraEmpregados() {
        System.out.println("-------LISTA DE EMPREGADOS-------");

        if (empregados.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (Empregado listaEmpregado : empregados) {
                System.out.printf("Nome: %s | Matricula: %d | Salario Bruto: R$%.2f | Salário Liquido: R$%.2f\n", listaEmpregado.getNome(), listaEmpregado.getNumeroSeccao(), listaEmpregado.getSalarioBase(), listaEmpregado.getSalario());
            }
        }
    }

    // Testes
    
    public void fornecedor() {
        fornecedores.add(new Fornecedor("João", 12312312300L, 19, 20000, 800));
        fornecedores.add(new Fornecedor("Yuri", 32132132101L, 19, 50000, 2000));
        fornecedores.add(new Fornecedor("Pedro", 13213213200L, 18, 30000, 1500));
    }

    public void empregado() {
        empregados.add(new Empregado("Andre Prado", 1234, 20, 101, 6000));
        empregados.add(new Empregado("Andre Meloti", 2425, 12, 0101, 400));
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

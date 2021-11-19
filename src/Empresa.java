public class Empresa {

    private String nome;
    private int dataFundacao;
    private CodigoPostal cp;


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
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

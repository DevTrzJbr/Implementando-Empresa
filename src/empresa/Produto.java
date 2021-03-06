package empresa;

public class Produto {
    private String designacao; // nome do produto
    private float precoVendaPublico;  //preço
    private int stock;  // número em estoque
        
    public Produto(){
        
    }
    
    public Produto(String designacao, float precoVendaPublico) {
        this.designacao = designacao;
        this.precoVendaPublico = precoVendaPublico;   
    }
    
    public String getDesignacao() {
        return this.designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public float getPrecoVendaPublico() {
        return this.precoVendaPublico;
    }

    public void setPrecoVendaPublico(float precoVendaPublico) {
        this.precoVendaPublico = precoVendaPublico;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
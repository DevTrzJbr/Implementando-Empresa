package empresa;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        empresa.addPessoas();
        empresa.addProdutos();
    
        //empresa.buscarClienteTeste(21001);
        empresa.menu();
    }
}

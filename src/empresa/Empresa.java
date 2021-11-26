package empresa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private int dataFundacao;
    private CodigoPostal cp = new CodigoPostal();
    private Pessoa p = new Pessoa();
    
    private List <Produto> listaProdutos = new ArrayList<>();
    private List <Cliente> listaClientes = new ArrayList<>();
    private List <Fornecedor> listaFornecedores = new ArrayList<>();
    private List <Empregado> listaEmpregados = new ArrayList<>();
    
    private int opcao;
    
    public Empresa(){
        this.nome = "Prometheus LTDA.";
        this.dataFundacao = 2021;
        cp.setIndicativo(29115);
        cp.setExtensao(100);
    }
    
    public void addPessoas() {
        getListaClientes().add(new Cliente("Anton Tchekhov", 21001, 73, 10000));
        getListaClientes().add(new Cliente("Fiódor Dostoiévski", 21002, 84, 10000));
        getListaClientes().add(new Cliente("Homero", 21003, 99, 10000));
        getListaClientes().add(new Cliente("Virgílio", 21004, 71, 10000));
        getListaClientes().add(new Cliente("Marco Cícero", 21005, 69, 10000));
        getListaClientes().add(new Cliente("Liev Tolstói", 21006, 75, 10000));
        
        
        getListaFornecedores().add(new Fornecedor("Sebastião do Mato", 2101, 44, 20000));
        getListaFornecedores().add(new Fornecedor("Afroldo Caseiro", 2102, 38, 20000));
        getListaFornecedores().add(new Fornecedor("Jeremias Pombal", 2103, 51, 20000));
        
        getListaEmpregados().add(new Empregado("Luís de Camões", 2111, 56, 1524, 23245.83f));
        getListaEmpregados().add(new Empregado("Gustavo Corção", 2112, 81, 1896, 19432.24f));
        getListaEmpregados().add(new Empregado("Machado de Assis", 2113, 69, 1839, 64521.6f));
        getListaEmpregados().add(new Empregado("Carlos Gomes", 2114, 60, 1836, 30824.05f));
        getListaEmpregados().add(new Empregado("Aleijadinho", 2115, 76, 1738, 97245.93f));
        getListaEmpregados().add(new Empregado("Cecília Meireles", 2116, 63, 1901, 29644.70f));
        getListaEmpregados().add(new Empregado("Heitor Villa-Lobos", 2116, 72, 1887, 71567.81f));
        getListaEmpregados().add(new Empregado("Platão", 2116, 80, 348, 101843.12f));
    }
    
    public void addProdutos(){
        listaProdutos.add(new Produto("PERAPHONE", 1599.85f));
        listaProdutos.add(new Produto("PERAPHONE", 1599.85f));
        listaProdutos.add(new Produto("PERAPHONE", 1599.85f));
        listaProdutos.add(new Produto("PERAPHONE", 1599.85f));
        listaProdutos.add(new Produto("RTX 7080", 8999.97f));
        listaProdutos.add(new Produto("RTX 7080", 8999.97f));
        listaProdutos.add(new Produto("RTX 7080", 8999.97f));
        listaProdutos.add(new Produto("ROBO MEGATRON", 1000299.44f));
        listaProdutos.add(new Produto("ROBO MEGATRON", 1000299.44f));
        listaProdutos.add(new Produto("TESLA MODEL XYZ", 349999.99f));
    }

    public void socios() {
        System.out.println("\t- André Melotti");
        System.out.println("\t- André Prado");
        System.out.println("\t- João V. Antunes");
        System.out.println("\t- Pedro Lima");
        System.out.println("\t- Yuri Marcos");
    }
        
    // PRODUTOS
    public void inserirProduto() {
        String designacao;
        float preco;
        
        System.out.println("Informe a designação do novo produto: ");
        designacao = sc.next();
        System.out.println("Digite o valor de venda do novo produto: ");
        preco = sc.nextInt();
        
        listaProdutos.add(new Produto(designacao, preco));
        System.out.println("Inserção completa.");
        gerenciarProdutos();
    }

    public void listarProduto() {
        while (true){
            System.out.println("=== PRODUTOS: LISTAR ===");
            System.out.println("Produto por Designação[1] Todos os Produtos[2] Voltar[0]");
            System.out.println("Opcão: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    gerenciarProdutos();
                break;

                case 1:
                    buscarProtudo();
                break;

                case 2:
                    mostraAllProdutos();
                break;

                default: System.out.println("ERRO: Opcão inválida.");
                
            }
            if (opcao == 0) break;
        }
    }
    
    public void buscarProtudo() {
        String designacao;
        int estoque = 0;
        
        System.out.println("Informe a designação do produto: ");
        designacao = sc.next();
        if (listaProdutos.isEmpty())
            System.out.println("O estoque está vazio.");
        else{
            for (Produto p: listaProdutos){
                if (p.getDesignacao().equals(designacao)) 
                    estoque++;            
            }
            if (estoque == 0) 
                System.out.println("Não há estoque desse produto na loja.");
            else{
                for (Produto p: listaProdutos){
                    if (p.getDesignacao().equals(designacao)){
                        p.setStock(estoque);
                        System.out.println("Designação: "+ p.getDesignacao() +" Preço: R$ "+ p.getPrecoVendaPublico() +" Estoque: "+ p.getStock());
                        break;
                    }
                        
                }
            }
        }

    }
    
    public void mostraAllProdutos() {
        if (listaProdutos.isEmpty()) 
            System.out.println("O estoque da loja está vazio.");
        else{
            for (Produto p: listaProdutos)
                System.out.println("Designação: "+p.getDesignacao()+" | Preço: R$ "+ p.getPrecoVendaPublico());
        }
        
    }
 
    // CLIENTES
    public void inserirCliente (){
        String nome, str;
        long contribuinte;
        int idade, indicativo, extensao;
        float plafond;
        
        System.out.println("Digite o nome do cliente: ");
        nome = sc.nextLine();
        System.out.println("Digite um valor de contribuinte: ");
        contribuinte = sc.nextLong();
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        System.out.println("Digite o teto de créditos: ");
        plafond = sc.nextFloat();
        while (true){
            System.out.println("Digite os 5 primeiros números do CEP: ");
            indicativo = sc.nextInt();
            if(indicativo > 99999 && indicativo < 10000)
                System.out.println("ERRO: O número deve possuir 5 dígitos.");
            else{
                System.out.println("Digite os últimos 3 números do CEP: ");
                extensao = sc.nextInt();
                if (extensao > 999 || extensao < 100)
                    System.out.println("ERRO: O número deve possuir 3 dígitos.");
                else
                    break;
            }
        }
        str = contribuinte+"";
        p.inserir(str, new CodigoPostal(indicativo, extensao));
        getListaClientes().add(new Cliente(nome, contribuinte, idade, plafond));
        System.out.println("Novo cliente registrado.");
    }
     
    public void buscarCliente(){
        String str;
        long contribuinte;
        System.out.println("Digite o número de contribuinte do cliente: ");
        contribuinte = sc.nextLong();
        
        for (Cliente c: listaClientes){
            if (c.getContribuinte() == contribuinte){
                str = c.getContribuinte()+"";
                System.out.println("Nome: "+ c.getNome());
                System.out.println("Idade: "+ c.getIdade());
                System.out.println("Teto de créditos (plafond): R$ "+ c.getPlafond());
                System.out.println("N° contribuinte: "+ c.getContribuinte());
                System.out.println("Valor em dívida: R$ "+ c.getValorEmDivida());
                System.out.print("CEP: " ); 
                p.buscarCp(str);
                System.out.println("");
                break;
            }
        }
        
    }
    
    public void removerCliente (){
        int contribuinte;
        System.out.println("Digite o número de contribuinte do cliente: ");
        contribuinte = sc.nextInt();
        
        for (Cliente c: listaClientes){
            if (c.getContribuinte() == contribuinte){
                listaClientes.remove(c);
                System.out.println("Contribuinte nº "+ c.getContribuinte() +" removido.");
                break;
            }
        }
    }
     
    public void mostraAllClientes() {
        if (listaClientes.isEmpty()) 
            System.out.println("Não há clientes.");
        else{
            for (Cliente c: listaClientes)
                System.out.println("< Nome: "+c.getNome()+" | Nº contribuinte: "+ c.getContribuinte() +" | Idade: "+ c.getIdade() +" | Plafond: "+ c.getPlafond() +" | Dívida: "+ c.getValorEmDivida() +" >");
        }
    }
    
    // FORNECEDORES
    public void inserirFornecedores (){
        String nome;
        long contribuinte;
        int idade;
        float plafond;
        
        System.out.println("Digite o nome do fornecedor: ");
        nome = sc.nextLine();
        System.out.println("Digite um valor de contribuinte: ");
        contribuinte = sc.nextLong();
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        System.out.println("Digite o teto de créditos: ");
        plafond = sc.nextFloat();
        
        getListaFornecedores().add(new Fornecedor(nome, contribuinte, idade, plafond));
        System.out.println("Novo fornecedor registrado.");
    }
   
    public void buscarFornecedor(){
        long contribuinte;
        System.out.println("Digite o número de contribuinte do fornecedor: ");
        contribuinte = sc.nextLong();
        
        for (Fornecedor f: listaFornecedores){
            if (f.getContribuinte() == contribuinte){
                System.out.println("Nome: "+ f.getNome());
                System.out.println("Idade: "+ f.getIdade());
                System.out.println("Teto de créditos (plafond): R$ "+ f.getPlafond());
                System.out.println("N° contribuinte: "+ f.getContribuinte());
                System.out.println("Valor em dívida: R$ "+ f.getValorEmDivida());
                break;
            }
        }
    }
    
    public void removerFornecedor (){
        int contribuinte;
        System.out.println("Digite o número de contribuinte do fornecedor: ");
        contribuinte = sc.nextInt();
        
        for (Fornecedor f: listaFornecedores){
            if (f.getContribuinte() == contribuinte){
                listaFornecedores.remove(f);
                System.out.println("Contribuinte nº "+ f.getContribuinte() +" removido.");
                break;
            }
        }
    }
   
    public void mostraAllFornecedores() {
        if (listaFornecedores.isEmpty()) 
            System.out.println("Não há fornecedores.");
        else{
            for (Fornecedor f: listaFornecedores)
                System.out.println("< Nome: "+f.getNome()+" | Nº contribuinte: "+ f.getContribuinte() +" | Idade: "+ f.getIdade() +" | Plafond: "+ f.getPlafond() +" | Dívida: "+ f.getValorEmDivida() +" >");
        }
    }
  
    // EMPREGADOS
    public void inserirEmpregados (){
        String nome;
        long contribuinte;
        int numeroSeccao, idade;
        float salarioBase;
        
        System.out.println("Digite o nome do empregado: ");
        String gambiarra = sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Digite um valor de contribuinte: ");
        contribuinte = sc.nextLong();
        System.out.println("Crie um número de seccão: ");
        numeroSeccao = sc.nextInt();
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        System.out.println("Salário base:  ");
        salarioBase = sc.nextFloat();
                
        getListaEmpregados().add(new Empregado(nome, contribuinte, idade, numeroSeccao, salarioBase));
        System.out.println("Novo funcionário registrado.");
    }
    
    public void buscarEmpregado(){
        int numeroSeccao;
        boolean vazio = true;
        System.out.println("Digite o número de seccão do empregado: ");
        numeroSeccao = sc.nextInt();
        
        for (Empregado e: listaEmpregados){
            if (e.getNumeroSeccao() == numeroSeccao){
                e.calcularSalario();
                System.out.println("Numero de Seccão: "+ e.getNumeroSeccao());
                System.out.println("Nome: "+ e.getNome());
                System.out.println("Idade: "+ e.getIdade());
                System.out.println("Salário base: "+ e.getSalarioBase());
                System.out.println("Salário: "+ e.getSalario());
                System.out.println("N° contribuinte: "+ e.getContribuinte());
                System.out.println("iRS: "+ e.getIRS());
                vazio = false;
                break;
            }
        }
        if (vazio == true) {
            System.out.println("Lista de empregados vazia!\n");
        }
    }
    
    public void removerEmpregado (){
        int numeroSeccao;
        System.out.println("Digite o número de seccão do empregado: ");
        numeroSeccao = sc.nextInt();
        
        for (Empregado e: listaEmpregados){
            if (e.getNumeroSeccao() == numeroSeccao){
                listaEmpregados.remove(e);
                System.out.println("Empregado n° seccão "+ e.getContribuinte()+" removido.");
                break;
            }
        }
        System.out.println("Empregado não encontrado!\n");
    }
    
    public void mostraAllEmpregados() {
        if (listaEmpregados.isEmpty()) 
            System.out.println("Não há empregados.");
        else{
            for (Empregado e: listaEmpregados){
                // System.out.println("< Nome: "+e.getNome()+" | Nº contribuinte: "+ e.getContribuinte() +" | Nº seccão: "+ e.getNumeroSeccao()+" | Idade: "+ e.getIdade() +" | Salário: "+ e.getSalario() +" | iRS: "+ e.getIRS() +" >");
                System.out.printf("< Nome: %s| N° CPF: %d | N° secção: %d | Idade: %d | Salário: R$%.2f | IRS: %.0f%% >\n",e.getNome(),e.getContribuinte(),  e.getNumeroSeccao(), e.getIdade(), e.getSalario(), e.getIRS() * 100 );
            }
        }
    }
  
    // GET and SETTERS
    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }
    
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

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public List<Fornecedor> getListaFornecedores() {
        return listaFornecedores;
    }
    
    public void setListaFornecedores(List<Fornecedor> listaFornecedores) {
        this.listaFornecedores = listaFornecedores;
    }

    public List<Empregado> getListaEmpregados() {
        return listaEmpregados;
    }

    public void setListaEmpregados(List<Empregado> listaEmpregados) {
        this.listaEmpregados = listaEmpregados;
    }

    public CodigoPostal getCp() {
        return cp;
    }

    public void setCp(CodigoPostal cp) {
        this.cp = cp;
    }
   
    // SISTEMA
    public void status() {
        do{
            System.out.println("------ STATUS ------");
            System.out.println("EMPRESA: "+ getNome());
            System.out.print("CEP: ");
            getCodigoPostal().mostraCp();
            System.out.println("FUNDAÇÃO: "+ getDataFundacao());
            System.out.println("CEO: Vinícius Rosalen");
            System.out.println("SÓCIOS: ");
            socios();
            System.out.println("Nº FUNCIONÁRIOS ATUAL: " + getListaEmpregados().size());
            System.out.println("Nº CLIENTES ATUAL: "+ getListaClientes().size());
            System.out.println("Nº FORNECEDORES ATUAL: "+ getListaFornecedores().size());
            System.out.println("(Pressione 0 para sair)");
            opcao = sc.nextInt();
        } while (opcao != 0);
        menu();
    }
    
    public void gerenciarProdutos(){
        while (true){
            System.out.println("\n=== PRODUTOS ===");
            System.out.println("Adicionar Produto[1] Listar Produto[2] Menu Inicial[0]");
            System.out.println("Opcão: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    menu();
                break;

                case 1:
                    inserirProduto();
                break;

                case 2:
                    listarProduto();
                break;

                default: System.out.println("ERRO: Opcão inválida.");
            }
            if (opcao == 0) break;
        }
    }
    
    public void gerenciarClientes(){
        while (true){
            System.out.println("\n=== PESSOAS: CLIENTES ===");
            System.out.println("Buscar Cliente[1] Remover Cliente[2] Listar Clientes[3] Menu Pessoas[0]");
            System.out.println("Opcão: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    gerenciarPessoas();
                break;
                    
                case 1:
                    buscarCliente();
                break;

                case 2:
                    removerCliente();
                break;
                
                case 3:
                    mostraAllClientes();
                break;
                
                default: System.out.println("ERRO: Opcão inválida.");
            }
            if (opcao == 0) break;
        }
    }
    
    public void gerenciarFornecedores(){
        while (true){
            System.out.println("\n=== PESSOAS: FORNECEDORES ===");
            System.out.println("Buscar Fornecedor[1] Remover Fornecedor[2] Listar Fornecedor[3] Menu Pessoas[0]");
            System.out.println("Opcão: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    gerenciarPessoas();
                break;
                    
                case 1:
                    buscarFornecedor();
                break;

                case 2:
                    removerFornecedor();
                break;
                
                case 3:
                    mostraAllFornecedores();
                break;
                
                default: System.out.println("ERRO: Opcão inválida.");
            }
            if (opcao == 0) break;
        }
    }
    
    public void gerenciarEmpregados(){
        while (true){
            System.out.println("\n=== PESSOAS: EMPREGADOS ===");
            System.out.println("Buscar Empregado[1] Inserir Empregado[2] Remover Empregado[3] Listar Empregados[4] Menu Pessoas[0]");
            System.out.println("Opcão: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    gerenciarPessoas();
                break;
                    
                case 1:
                    buscarEmpregado();
                break;

                case 2:
                    inserirEmpregados();
                break;
                
                case 3:
                    removerEmpregado();
                break;
                
                case 4:
                    mostraAllEmpregados();
                break;
                
                default: System.out.println("ERRO: Opcão inválida.");
            }
            if (opcao == 0) break;
        }
    }
    
    public void gerenciarPessoas(){
        while (true){
            System.out.println("\n=== PESSOAS ===");
            System.out.println("Empregados[1] Clientes[2] Fornecedores[3] Menu Inicial[0]");
            System.out.println("Opcão: ");
            opcao = sc.nextInt();
            switch (opcao){
                case 0:
                    menu();
                break;

                case 1:
                    gerenciarEmpregados();
                break;

                case 2:
                    gerenciarClientes();
                break;
                
                case 3:
                    gerenciarFornecedores();
                break;
                
                default: System.out.println("ERRO: Opcão inválida.");
            }
            if (opcao == 0) break;
        }
    }
    
    public void menu(){
        while (true) {
            System.out.println("----- PROMETHEUS SYSTEM -----");
            System.out.println("Gerenciar Pessoas[1] Gerenciar Produtos[2] Informações Empresa[3] Sair[0]");
            System.out.println("Digite uma das opções acima: ");
            
            opcao = sc.nextInt(); 
            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                break;

                case 1:
                    gerenciarPessoas();
                break;

                case 2:
                    gerenciarProdutos();
                break;
                
                case 3:
                    status();
                break;

                default: System.out.println("ERRO: Opcão inválida.");

            }
            if (opcao == 0) break;
        }

    }
    
}
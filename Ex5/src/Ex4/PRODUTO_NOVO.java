package Ex4;
import java.time.LocalDate;

public class PRODUTO_NOVO {
	    // Atributos da classe 'PRODUTO_NOVO'
	    private String nome;         // Armazena o nome do produto
	    private double preçoCusto;   // Armazena o preço de custo do produto
	    private double preçoVenda;   // Armazena o preço de venda do produto
	    private LocalDate dataFab;   // Armazena a data de fabricação do produto
	    private LocalDate dataVal;   // Armazena a data de validade do produto

	    public PRODUTO_NOVO (String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) { // Construtor que recebe todos os atributos
	        // Declara as informações do parâmetros aos atributos
	    	this.nome = nome;
	        this.preçoCusto = precoCusto;
	        this.preçoVenda = precoVenda;
	        this.dataFab = dataFabricacao;
	        this.dataVal = dataValidade;
	    }

	    public PRODUTO_NOVO(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) { // Construtor que recebe 'nome', 'precoCusto', 'precoVenda' e 'dataFabricacão'
	        this(nome, precoCusto, precoVenda, dataFabricacao, dataFabricacao.plusMonths(1));
	    }

	    public PRODUTO_NOVO(String nome, double precoCusto) {  // Construtor que recebe 'nome' e 'precoCusto'
	    	// Declara as informações do parâmetros aos atributos
	        this.nome = nome;
	        this.preçoCusto = precoCusto;
	        this.preçoVenda = precoCusto * 1.10; // 10% a mais sobre o preço de custo
	        this.dataFab = LocalDate.now();      // Data de fabricação é a data atual
	        this.dataVal = LocalDate.now().plusMonths(1); // Data de validade é 1 mês após a fabricação
	    }

	    // Getters
	    public String getNome() {                // Getter para acessar o nome do produto de forma segura
	        return nome;
	    }

	    public double getPrecoCusto() {          // Getter para acessar o preço de custo de forma segura
	        return preçoCusto;
	    }

	    public double getPrecoVenda() {          // Getter para acessar o preço de venda de forma segura
	        return preçoVenda;
	    }

	    public LocalDate getDataFabricacao() {   // Getter para acessar a data de fabricação de forma segura
	        return dataFab;
	    }

	    public LocalDate getDataValidade() {     // Getter para acessar a data de validade de forma segura
	        return dataVal;
	    }

	    public String descrição() {  // Método para exibir informações do produto
	        return "Produto: " + nome + 
	               "\nPreço de Custo: R$ " + preçoCusto + 
	               "\nPreço de Venda: R$ " + preçoVenda + 
	               "\nData de Fabricação: " + dataFab + 
	               "\nData de Validade: " + dataVal;
	    }
	    public static void main(String[] args) {
	    	PRODUTO_NOVO p1 = new PRODUTO_NOVO("Produto 1", 20, 25, LocalDate.now(), LocalDate.now().plusMonths(1)); // Produto usando o primeiro construtor
	        System.out.println(p1.descrição());

	        System.out.println(" ");
	        
	        PRODUTO_NOVO p2 = new PRODUTO_NOVO("Produto 2", 30, 35, LocalDate.of(2020, 9, 25)); // Produto usando o segundo construtor
	        System.out.println(p2.descrição());

	        System.out.println(" ");
	        
	        PRODUTO_NOVO p3 = new PRODUTO_NOVO("Produto 3", 15); // Produto usando o terceiro construtor
	        System.out.println(p3.descrição());
	    }
	}

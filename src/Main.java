public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRAÇÃO DO CONSTRUTOR ===\n");

        System.out.println("Criando produtos usando o construtor:");
        Produto produto1 = new Produto("Açúcar Cristal 1kg", 3.89, 120);
        Produto produto2 = new Produto("Óleo de Soja 900ml", 4.75, 60);

        System.out.println("Produto 1 criado com sucesso:");
        produto1.exibirInformacoes();

        System.out.println("Produto 2 criado com sucesso:");
        produto2.exibirInformacoes();

        System.out.println("Verificando valores com getters:");
        System.out.println("Nome do produto 1: " + produto1.getNome());
        System.out.println("Preço do produto 1: R$ " + produto1.getPreco());
        System.out.println("Estoque do produto 1: " + produto1.getQuantidadeEmEstoque());
        System.out.println();

        System.out.println("=== SISTEMA DE GERENCIAMENTO DE PRODUTOS ===\n");

        Produto produto3 = new Produto("Arroz Tio João 5kg", 5.50, 100);

        System.out.println("1. PRODUTO CRIADO:");
        produto3.exibirInformacoes();

        System.out.println("2. ALTERANDO PREÇO:");
        produto3.alterarPreco(6.25);
        produto3.exibirInformacoes();

        System.out.println("3. ALTERANDO QUANTIDADE EM ESTOQUE:");
        produto3.alterarQuantidade(75);
        produto3.exibirInformacoes();

        System.out.println("4. ALTERANDO NOME DO PRODUTO:");
        produto3.alterarNome("Arroz Tio João 5kg - Tipo 1");
        produto3.exibirInformacoes();

        System.out.println("=== TESTE COM SEGUNDO PRODUTO ===\n");

        Produto produto4 = new Produto("Feijão Carioca 1kg", 7.20, 50);
        produto4.exibirInformacoes();

        produto4.alterarPreco(8.90);
        produto4.alterarQuantidade(30);

        System.out.println("PRODUTO 4 APÓS ALTERAÇÕES:");
        produto4.exibirInformacoes();

        System.out.println("=== DEMONSTRAÇÃO DE GETTERS E SETTERS ===\n");

        Produto produto5 = new Produto("Macarrão", 4.50, 200);

        System.out.println("LENDO VALORES COM GETTERS:");
        System.out.println("Nome: " + produto5.getNome());
        System.out.println("Preço: R$ " + produto5.getPreco());
        System.out.println("Estoque: " + produto5.getQuantidadeEmEstoque());
        System.out.println();

        System.out.println("ALTERANDO COM SETTERS:");
        produto5.setNome("Macarrão Parafuso 500g");
        produto5.setPreco(3.75);
        produto5.setQuantidadeEmEstoque(150);

        System.out.println("CONFIRMANDO ALTERAÇÕES:");
        System.out.println("Nome: " + produto5.getNome());
        System.out.println("Preço: R$ " + produto5.getPreco());
        System.out.println("Estoque: " + produto5.getQuantidadeEmEstoque());
        System.out.println();

        produto5.exibirInformacoes();

        System.out.println("=== SISTEMA TESTADO COM SUCESSO! ===");
    }
} 
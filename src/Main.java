public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE PRODUTOS ===\n");

        Produto produto1 = new Produto("Arroz Tio João 5kg", 5.50, 100);

        System.out.println("1. PRODUTO CRIADO:");
        produto1.exibirInformacoes();

        System.out.println("2. ALTERANDO PREÇO:");
        produto1.alterarPreco(6.25);
        produto1.exibirInformacoes();

        System.out.println("3. ALTERANDO QUANTIDADE EM ESTOQUE:");
        produto1.alterarQuantidade(75);
        produto1.exibirInformacoes();

        System.out.println("4. ALTERANDO NOME DO PRODUTO:");
        produto1.alterarNome("Arroz Tio João 5kg - Tipo 1");
        produto1.exibirInformacoes();

        System.out.println("=== TESTE COM SEGUNDO PRODUTO ===\n");

        Produto produto2 = new Produto("Feijão Carioca 1kg", 7.20, 50);
        produto2.exibirInformacoes();

        produto2.alterarPreco(8.90);
        produto2.alterarQuantidade(30);

        System.out.println("PRODUTO 2 APÓS ALTERAÇÕES:");
        produto2.exibirInformacoes();

        System.out.println("=== SISTEMA TESTADO COM SUCESSO! ===");
    }
} 
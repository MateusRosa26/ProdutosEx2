public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 5.50, 100);
        Produto produto2 = new Produto("Feijao", 7.20, 80);

        System.out.println("=== INFORMAÇÕES INICIAIS ===");
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();

        System.out.println("=== ATUALIZANDO PREÇOS ===");
        produto1.alterarPreco(6.00);
        produto2.alterarPreco(8.50);

        System.out.println("=== ATUALIZANDO QUANTIDADES ===");
        produto1.alterarQuantidade(150);
        produto2.alterarQuantidade(60);

        System.out.println("=== INFORMAÇÕES ATUALIZADAS ===");
        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
    }
} 
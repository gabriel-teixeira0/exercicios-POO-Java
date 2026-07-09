package exercicio3;

public class Projeto {

    public static void main(String[] args) {
        Produto produto1 = new Produto ("Arroz Parbolizado",4.99);
        Produto produto2 = new Produto ("Óleo de soja",7.99);
        Produto produto3 = new Produto ("Suco de uva integral",14.99);
        
        double soma;
        
        System.out.println("Tela do caixa");
        produto1.exibir();
        produto2.exibir();
        produto3.exibir();
        
        System.out.println("Soma dos produtos: ");
        
        soma = produto1.preco + produto2.preco + produto3.preco;
        
        System.out.println("A soma dos produtos é: R$" + soma);
    }
}

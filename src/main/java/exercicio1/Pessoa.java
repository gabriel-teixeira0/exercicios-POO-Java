package exercicio1;

public class Pessoa {
    
    int idade;
    String nome;
    
    public Pessoa (int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }
    
    public void exibir () {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }
}

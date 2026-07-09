package exercicio2;
import java.util.Scanner;
public class Projeto {

    public static void main(String[] args) {
        Carro myCarro = new Carro("Nissan", "Kicks");
        Scanner sc = new Scanner (System.in);
        System.out.println("Atualizar dados do clinte - Veículo");
        myCarro.exibir();
        
        System.out.print("\nDigite a marca do novo veículo do cliente: ");
        myCarro.marca = sc.next();
        System.out.print("\nDigite o modelo do novo veículo do cliente: ");
        myCarro.modelo = sc.next();
        
        System.out.println("\nDados alterados.");
        myCarro.exibir();
    }
}

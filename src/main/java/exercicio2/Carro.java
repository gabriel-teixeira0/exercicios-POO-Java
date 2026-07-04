package exercicio2;

public class Carro {

    String marca, modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibir() {
        System.out.println("Veículo cadastrado: ");
        System.out.println("Marca do veículo: " + marca);
        System.out.println("Modelo do veículo: " + modelo);
    }

}

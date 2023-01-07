package POO;

// Exercicio Básico de como criar uma classe e os seus atributos//
public class Carro {
    String nome;                // Atributos
    int placa;
    String modelo;
    String cor;
    int capacidadetanque;

    // Construtor abaixo dos atributos (boa pratica de organização)

    Carro(){
        // Construtor mais simples, vazio, somente com o nome da classe
    }

    Carro(String cor, String modelo, int capacidadetanque){ //Sobrecarga de método
        this.cor = cor;
        this.modelo = modelo;                               /* this é uma forma de diferencia o que pertence ou não ao objeto */
        this.capacidadetanque = capacidadetanque;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }

    public int getCapacidadetanque() {

        return capacidadetanque;
    }

    public void setCapacidadetanque(int capacidadetanque) {

        this.capacidadetanque = capacidadetanque;
    }

    double TotalValorTanque(double valorCombustivel){

        return capacidadetanque * valorCombustivel;
    }
}

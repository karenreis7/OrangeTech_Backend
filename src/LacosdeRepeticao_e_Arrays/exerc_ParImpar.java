package LacosdeRepeticao_e_Arrays;
import java.util.Scanner;

/* Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares e impares
 */

public class exerc_ParImpar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Variaveis//
        int qtdNumeros;
        int count = 0;
        int numero;
        int numPares = 0;
        int numImpares = 0;

        // Entrada de Dados//

        System.out.println("Informe a quantidade de numeros:  ");
        qtdNumeros = entrada.nextInt();

        //Processamento//

        do {
            System.out.println("Números: ");
            numero = entrada.nextInt();

            if (numero % 2 == 0) numPares++; // Processo pra saber se o numero é Par//
            else numImpares++;

            count++;
        }while (count < qtdNumeros);

        //Saida de Dados//

        System.out.println("Números Pares: " + numPares);
        System.out.println("Números Impares: " + numImpares);
    }
}

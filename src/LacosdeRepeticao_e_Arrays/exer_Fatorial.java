package LacosdeRepeticao_e_Arrays;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo usuario.
 */

public class exer_Fatorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Variaveis//
        int fatorial;
        int multiplicacao = 1;

        // Entrada de Dados//
        System.out.println("Fatorial: ");
        fatorial = entrada.nextInt();

        //Processamento//
        System.out.print(fatorial + " ! = ");
        for (int i = fatorial; i >= 1 ; i--){
            multiplicacao = multiplicacao * i;
        }

        // Saida de Dados//

        System.out.println(multiplicacao);
    }
}

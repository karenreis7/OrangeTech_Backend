package LacosdeRepeticao_e_Arrays;
import java.util.Scanner;

//Faça um programa que leia 5 numeros e informe o maior e a media desses numeros//

public class MediaMaior {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int  numero;
        int  count = 0;
        int  numeroMaior = 0;
        int  total = 0;
        int media;
        do {
            System.out.println("Digite o numero: ");
            numero = teclado.nextInt();

            total = total + numero; /* Processo responsável por somar os números que são adicionados
                                       pelo usuario e guardar na variavel */

            if (numero > numeroMaior){
                numeroMaior = numero;
            }

            count = count + 1;

            media = total / 2;
        }while (count < 5);

        System.out.println("O maior número é: " + numeroMaior);
        System.out.println("A média dos números adicionados é: "+ media);


    }
}

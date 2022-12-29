package LacosdeRepeticao_e_Arrays;

import java.util.Scanner;

public class exerc_nota {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        // Entrada de Dados

        System.out.println("Digite a nota: ");
        nota = teclado.nextInt();

        // Processamento
        while(nota < 0 || nota > 10){
            System.out.println("Nota Inválida! Digite novamente...");
            nota = teclado.nextInt();
        }

        // Saida de Dados
        System.out.println("Nota Adicionada! ");
    }


}

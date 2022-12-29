package LacosdeRepeticao_e_Arrays;
import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10,
O usuario deve informar qual número ele deseja ver a tabuada.
 */



public class exer_Tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Variaveis //

        int tabuada;

        //Entrada de Dados//

        System.out.println("Número: ");
        tabuada = entrada.nextInt();

        //Processamento//

        for (int i = 1; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}

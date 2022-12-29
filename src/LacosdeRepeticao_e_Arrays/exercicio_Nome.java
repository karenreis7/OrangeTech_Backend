package LacosdeRepeticao_e_Arrays;
import java.util.Scanner;

/*Faça um programa que leia conjuntos de dois valores, o primeiro sendo o nome do Aluno e o segundo
representando sua idade.
Pare o programa inserindo o valor 0 no campo nome)
 */




public class exercicio_Nome {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Váriaveis

        String nome;
        int idade;

        //Entrada de Dados

        while (true){
            System.out.println("Digite o seu nome: ");
            nome = entrada.next();

            if (nome.equals("0")) break;

            System.out.println("Digite a sua idade: ");
            idade = entrada.nextInt();

        }
    }
}

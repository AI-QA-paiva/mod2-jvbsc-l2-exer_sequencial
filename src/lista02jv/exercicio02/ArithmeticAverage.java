package lista02jv.exercicio02;

import java.util.Scanner;

public class ArithmeticAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.print("Informe primeira nota: ");
            double nota1 = input.nextDouble();
            System.out.print("Informe segunda nota: ");
            double nota2 = input.nextDouble();
            System.out.print("Informe terceira nota: ");
            double nota3 = input.nextDouble();
            System.out.print("Informe quarta nota: ");
            double nota4 = input.nextDouble();

            input.close();

        double somaAritmetica = (nota1 + nota2 + nota3 + nota4);
        double mediaAritmetica = (somaAritmetica/4);

        System.out.println("Suas notas somaram o total de: " + somaAritmetica);
        System.out.println("Portanto, você obteve nota média: " + mediaAritmetica);

    }
}

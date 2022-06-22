package lista02jv.exercicio03;

import java.util.Scanner;

public class ConverteMetrosParaCentimentros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.print("Informe o valor em metros: ");
            double metros = input.nextDouble();

            input.close();

        double convertCentimentros = (metros*100);

        System.out.println("Valor em Centimentro é: "+convertCentimentros);




    }
}

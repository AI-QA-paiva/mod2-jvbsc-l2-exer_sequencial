package lista02jv.exercicio05;

import java.util.Scanner;

public class FahrenheitParaCelsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.print("Informe aqui o valor em graus Fahrenheit (Fº): ");
            double fahrenheit = input.nextDouble();

            input.close();

        double convertCelsius = (fahrenheit-32)*5/9;
        System.out.printf("A temperatura em graus Celsius (Cº) é: %.4f", convertCelsius);



    }



}

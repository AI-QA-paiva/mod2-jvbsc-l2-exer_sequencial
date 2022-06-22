package lista02jv.exercicio04;

import java.util.Scanner;

public class CalculoSalarioMensal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
            System.out.print("Informe o valor em reais que você ganha por hora: ");
            double valorHora = input.nextDouble();
            System.out.print("Informe o numero de horas que voce trabalhou neste mês: ");
            double quantHoras = input.nextDouble();

            input.close();

        double calcSalario = (valorHora*quantHoras);

        System.out.print("Você receberá o total de: R$ "+ calcSalario);


    }






}

package lista02jv.exercicio7;

import java.util.Scanner;

public class CalculoSalarioComEncargos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o valor em reais que você ganha por hora: ");
        double valorHora = input.nextDouble();
        System.out.print("Informe o numero de horas que voce trabalhou neste mês: ");
        double quantHoras = input.nextDouble();

        input.close();

        double calcSalario = (valorHora * quantHoras);
        double calcInss = (calcSalario * 0.08);
        double calcSind = (calcSalario * 0.05);
        double calcIprf = (calcSalario * 0.11);
        double calcLiqui = (calcSalario-calcInss-calcSind-calcIprf);

        System.out.println("Você receberá o Salário Bruto no total de: R$ " + calcSalario);
        System.out.println("Será descontato o valor de : R$ " + calcInss + " referente ao INSS");
        System.out.println("Será descontato o valor de : R$ " + calcSind + " referente a contribuição Sindical");


        System.out.println("Descontados todos os encargos, você receberá o Salário Liquido no total de : R$ " + calcLiqui);

    }



}

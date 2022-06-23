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

        System.out.printf("Você receberá o Salário Bruto no total de: R$ %.2f \n",calcSalario);
        System.out.printf("Será descontato o valor INSS de : R$ %.2f\n",calcInss);
        System.out.printf("Será descontato o valor Contribuição Sindical de : R$ %.2f\n",calcSind);

        System.out.printf("Descontados todos os encargos, você receberá o Salário Liquido no total de : R$ %.2f", calcLiqui);

    }



}

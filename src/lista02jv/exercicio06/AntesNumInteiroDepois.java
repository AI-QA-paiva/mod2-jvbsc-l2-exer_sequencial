package lista02jv.exercicio06;

import java.util.Scanner;

public class AntesNumInteiroDepois {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Informe o número inteiro: ");
            int numInteiro = input.nextInt();

            input.close();

        double numAntecede = numInteiro-1;
        double numSucede = numInteiro+1;

        System.out.println("O número que antecede o "+numInteiro+" é = "+numAntecede);
        System.out.println("O número que sucede o "+numInteiro+" é = "+numSucede);

    }



}

package ado2;
import java.util.Scanner;

public class SomaProdutos {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valorP1 = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valorP2 = input.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valorP3 = input.nextDouble();

        double produto = valorP1 * valorP2 * valorP3;

        System.out.println("O produto dos valores é: " + produto);

      input.close();
    }
	
}

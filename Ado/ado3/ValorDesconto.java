package ado3;
import java.util.Scanner;

public class ValorDesconto {
	
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    double Desconto;
	    double ValorComDesconto;

	    System.out.print("Digite o valor: ");
	    int valor = input.nextInt();

	    if (valor >= 300) {
	      Desconto = valor * 0.2;
	      ValorComDesconto = valor - Desconto;
	      System.out.println("O valor com desconto é: " + ValorComDesconto);
	    } else {
	      Desconto = valor * 0.15;
	      ValorComDesconto = valor - Desconto;
	      System.out.println("O valor com desconto é: " + ValorComDesconto);
	    }

	    input.close();
	  }
	
}

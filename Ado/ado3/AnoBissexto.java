package ado3;
import java.util.Scanner;

public class AnoBissexto {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Digite o ano: ");
	    int ano = input.nextInt();

	    if (ano % 4 == 0 || ano % 400 == 0 && ano % 100 !=0) {
	      System.out.println(ano + " é um ano bissexto");
	    } else {
	      System.out.println(ano + " não é um ano bissexto");
	    }

	    input.close();
	  }
}

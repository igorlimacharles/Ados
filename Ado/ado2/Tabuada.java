package ado2;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    System.out.print("Insira um número de 1 a 10: ");
	    int num = input.nextInt();

	    System.out.println("A tabuada de " + num + " é:");

	    for (int n = 1; n <=10; n++) {

	      int multiplos = num * n;
	      System.out.println(multiplos);
	    }

	    input.close();
	  }
}

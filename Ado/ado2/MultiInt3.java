package ado2;
import java.util.Scanner;

public class MultiInt3 {
	
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    System.out.print("Insira um número: ");
	    int num = input.nextInt();

	    System.out.println("Os três primeiros múltiplos de " + num + " são:");

	    for (int n = 1; n <=3; n++) {

	      int multiplos = num * n;
	      System.out.println(multiplos);
	    }

	    input.close();
	  }

	
}

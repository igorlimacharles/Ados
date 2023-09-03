package ado3;
import java.util.Scanner;

public class Triangulos {
	
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int lado1;
	    int lado2;
	    int lado3;

	    System.out.print("Digite o lado 1: ");
	    lado1 = input.nextInt();

	    System.out.print("Digite o lado 2: ");
	    lado2 = input.nextInt();

	    System.out.print("Digite o lado 3: ");
	    lado3 = input.nextInt();
	    
	    if (lado1 == lado2 && lado2 == lado3) {
	    	System.out.println("É um triângulo equilátero");
	    }
	    
	    else if (lado1 != lado2 && lado2 == lado3){
	    	System.out.println("É um triângulo isóceles");
	    }
	    else {
	    	System.out.println("É um triângulo escaleno");
	    }
	    
	    input.close();
	}
	
}

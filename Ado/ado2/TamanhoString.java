package ado2;
import java.util.Scanner;

public class TamanhoString {
	
	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);

	    System.out.print("Digite um texto: ");
	    String texto = input.nextLine();

	    int tamanho = texto.length();

	    System.out.println("O tamanho do seu texto é: " + tamanho + " caracteres");

	    input.close();
	  }
	
}

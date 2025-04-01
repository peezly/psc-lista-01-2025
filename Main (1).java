/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
        // pede o nuemro
        System.out.print("Digite um número qualquer: ");
        int numero = scanner.nextInt();
        // Exibe o número informado
        System.out.println("Número escolhido: " + numero + " foi o numero escolhido");
        // Fecha o scanner
        scanner.close();
	
	}
}
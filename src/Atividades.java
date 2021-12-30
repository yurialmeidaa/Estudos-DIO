import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Atividades {

	public static void main(String[] args) {

		int n;
		int multi = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva um número para a tabuada");
		n = scan.nextInt();
		
		for(int i = n; i >= 1; i--) {
			multi = multi * i;
			
		}
		
		System.out.println("O FATORIAL É: " +  multi );
		
		
	}
}

import java.util.Random;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int count = 0;
		Random random = new Random();
		//	int[] vetor = {-5, -6, 15, 50, 8, 4};
		
			
		
		//	while(count < (vetor.length)) {
		//	System.out.print(vetor[count] + " ");
		//	count++;
		//	}
		
		//	System.out.println("\nVetor: ");
		
		//for(int i = (vetor.length -1); i >= 0; i--) {
		//	System.out.print(vetor[i] + " ");
		//	}
		
		
	/*	Scanner scan = new Scanner(System.in);
		
		String[]consoantes = new String[6];
		int qntConsoantes = 0;
		
		
		do {
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if(!(letra.equalsIgnoreCase("a")|
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u")
					)){
					consoantes[count] = letra;
					qntConsoantes++;
					}
			
			count++;
			
		}while(count < consoantes.length);
		
		System.out.println("Consoantes: ");
		for (String conso : consoantes) {
			if(conso != null)
			System.out.print(conso + " ");
		}
		System.out.println("Quantidade de consoantes: "+ qntConsoantes);
		
		
		Random random = new Random();
		
		int[] numeros = new int[6];
		
		for(int i = 0; i <numeros.length; i++) {
			int numero = random.nextInt(100);
			numeros[i] = numero;
		}
		
		System.out.println("Numeros Aleatorios: ");
		for (int n  : numeros) {
			System.out.print(n + " ");
		}
		
		System.out.println("\nNumeros Sucessores do array: ");
		for (int n  : numeros) {
			System.out.print((n+1) + " ");
		}
		
		System.out.println("\nNumeros Antecessores do array: ");
		for (int n  : numeros) {
			System.out.print((n-1) + " ");
		}
		*/
		
		int[][] numerosAlea = new int[4][4];
		
		for(int i = 0; i <numerosAlea.length; i++) {
			for(int j = 0; j < numerosAlea[i].length; j++) {
				int numero = random.nextInt(9);
				numerosAlea[i][j] = numero;
			}
			
		}
		for (int[] linha : numerosAlea) {
		for (int coluna : linha) {
			System.out.print(coluna + " ");
		}
		System.out.println();
		}
		int num = 5, counta = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);


	}

}

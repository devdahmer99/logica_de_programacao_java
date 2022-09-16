import java.util.Locale;
import java.util.Scanner;

public class Entrada_de_dados_em_java {

	public static void main(String[] args) {
		
		/**
		 * Dentro do Java, temos algumas opções de entrada de dados...
		 * Para isto, precisamos primeiro de tudo importar uma lib chamada Scanner, que irá fazer a comunicação do teclado com o console.
		 * 
		 * Depois disto, precisamos inicar este objeto, atribuindo ele para um variavel por exemplo:
		 * Scanner sc = new Scanner(System.in); 
		 * Ou seja, atribuimos o nosso objeto para a variável sc.. entretanto, precisamos fechar essa conexão com o console sempre no final
		 * E para isso, usamos o sc.close();
		 */

		/**
		 * Para capturarmos uma entrada de dados do tipo String, utilizamos da seguinte forma:
		 * String x;
		 * x = sc.next();
		 *
		 * Para capturarmos uma entrada de dados do tipo int, utilizamos da seguinte forma:
		 * int x;
		 * x = sc.nextInt();
		 *
		 * Para capturarmos uma entrada de dados do tipo double, utilizamos da seguinte forma:
		 * Locale.setDefault(Locale.US); (para utilizarmos o ponto flutuante ao invés da virgula);
		 *
		 */
		Scanner sc = new Scanner(System.in);
		String x;
		char z;
		int y;
		double g;
		x = sc.next();
		y = sc.nextInt();
		Locale.setDefault(Locale.US);
		g = sc.nextDouble();
		z = sc.next().charAt(0);
		System.out.println("Você digitou o caracter: " + x);
		System.out.println("Você digitou um inteiro: " + y);
		System.out.println("Você digitou um número de ponto flutuate: " + g);
		System.out.println("Você digitou somente uma única letra: " + z);
		sc.close();

	}

}

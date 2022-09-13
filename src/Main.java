import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		/*Marcadores de Váriaveis no JAVA:
			%s -> refere-se sempre a variáveis do tipo String;
			%d -> refere-se sempre a variáveis do tipo inteiro;
			%.2f -> refere-se sempre a variáveis do tipo double, onde o numero que antecede o f, seria referente a casas decimais que serão formatadas.	
		*/
		Locale.setDefault(Locale.US);
		String nome = "Maria";
		int idade = 31;
		double renda = 5000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}

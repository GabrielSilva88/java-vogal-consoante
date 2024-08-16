package verificarVagalConsoante;

import java.util.Scanner;

public class ConsoanteVogal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = scan.nextLine();

		if ((letra.equalsIgnoreCase("a") || letra.equals("A"))|| ("e".equalsIgnoreCase(letra) || letra.equals("E"))|| (letra.equalsIgnoreCase("i")|| letra.equals("I"))
				|| ("o".equalsIgnoreCase(letra)|| letra.equals("O")) || ("u".equalsIgnoreCase(letra)|| letra.equals("A"))) {
			System.out.println(letra + "é vogal");
		} else {
			System.out.println(letra + " é consoante");
		}
		
		/* NÃO UTLILIZANDO O METODO .EQUALS OU .EQUALSIGNORECASE
		switch (letra) {
		case "a", "A": {
			System.out.println(letra + " É uma vogal");
		
		}
		case "e", "E": {
			System.out.println(letra + " É uma vogal");
			break;
		}
		case "i", , "I": {
			System.out.println(letra + " É uma vogal");
			break;
		}
		case "o", "O": {
			System.out.println(letra + " É uma vogal");
			break;
		}
		case "u", "U": {
			System.out.println(letra + " É uma vogal");
			break;
		}

		default:
			System.out.println(letra + " É uma consoante.");
		}
*/
	}
}

/*
 * Escreva um programa que leia uma letra do alfabeto e diga se ela é uma vogal
 * ou uma consoante. Lembre-se que, na comparação de Strings, usa-se o método
 * .equals() ou o .equalsIgnoreCase().
 */
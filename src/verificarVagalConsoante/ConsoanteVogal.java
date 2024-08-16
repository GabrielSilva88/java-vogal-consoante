package verificarVagalConsoante;

import java.util.Scanner;

public class ConsoanteVogal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = scan.nextLine();

		if (letra.equalsIgnoreCase("a") || "e".equalsIgnoreCase(letra) || letra.equalsIgnoreCase("i")
				|| "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
			System.out.println(letra + "é vogal");
		} else {
			System.out.println(letra + " é consoante");
		}
		
		/* NÃO UTLILIZANDO O METODO .EQUALS OU .EQUALSIGNORECASE
		switch (letra) {
		case "a": {
			System.out.println(letra + " É uma vogal");
		
		}
		case "e": {
			System.out.println(letra + " É uma vogal");
			break;
		}
		case "i": {
			System.out.println(letra + " É uma vogal");
			break;
		}
		case "o": {
			System.out.println(letra + " É uma vogal");
			break;
		}
		case "u": {
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
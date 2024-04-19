package labJunit.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculatrice c = new Calculatrice();

		System.out.print("Veuillez saisir le premier élément : ");
		double a = scanner.nextDouble();

		System.out.print("Veuillez saisir le second élément : ");
		double b = scanner.nextDouble();

		double somme = c.somme(a, b);
		System.out.println("Le resultat est :" + somme);
		scanner.close();
	}

}

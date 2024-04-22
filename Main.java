import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double glicose;

		System.out.print("Digite a medida da glicose: ");
		glicose = scanner.nextDouble();

		if (glicose <= 100.00) {
			System.out.printf("O seu nível de glicose está normal, parabéns!");
		} else if (glicose > 100.00 && glicose <= 140.00) {
			System.out.printf("O seu nível de glicose está elevado, vamos realizar alguns exames.");
		} else {
			System.out.print("Você está está com diabetes, irei prescrever alguns remédios.");
		}
		scanner.close();
	}

}

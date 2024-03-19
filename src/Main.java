import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of the file? ");
		String fileName = sc.next();
		System.out.println();

		try {
			Scanner ficheroEntrada = new Scanner(new File(fileName));
			while (ficheroEntrada.hasNextLine()) {
				printGroup(ficheroEntrada);
			}
		} catch (FileNotFoundException e) {
			System.out.println("A file with that name was not found.\nEnd of the program.");
			System.exit(0);
		} finally {
			sc.close();
		}

	}

	public static void printGroup(Scanner ficheroEntrada) {
		String line;
		int suma = 0;
		String groupName;

		line = ficheroEntrada.nextLine();

		// Si la linia no està buida
		if (!line.trim().equals("")) {
			// Si la la linea és un número
			groupName = (isStringNumeric(line)) ? "UNDEFINED GROUP" : line;

			System.out.println(groupName);

			while (ficheroEntrada.hasNextInt()) {
				suma += ficheroEntrada.nextInt();
			}

			System.out.println("Suma = " + suma);
			System.out.println();
		}
	}

	public static boolean isStringNumeric(String string) {
		boolean isNumeric = false;

		try {
			Integer.parseInt(string);
			isNumeric = true;
		} catch (NumberFormatException e) {
			isNumeric = false;
		}

		return isNumeric;
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter File Name: ");
		String fileName = sc.next();

		try {
			Scanner ficheroEntrada = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Holaaa");
		}

		sc.close();
	}

}

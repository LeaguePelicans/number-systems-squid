import java.io.PrintWriter;
import java.util.Scanner;

public class Hexadecimal {
	PrintWriter pw;
	static Scanner key = new Scanner(System.in);

	public Hexadecimal(PrintWriter pw) {
		this.pw = pw;
	}

	public static void main(String[] args) {
		hexToDec();
	}

	public void hexToBin() {
		System.out.println("Enter a hexadecimal you want to convert to binary.");
		String hexadecimal = key.nextLine();
		String binary = Integer.toBinaryString(Integer.parseInt(hexadecimal, 16));
		System.out.println("Converted number is: " + binary);
	}

	public static void hexToDec() {
		System.out.println("Enter a hexadecimal you want to convert to decimal.");
		double decimal = 0.0;
		String hexadecimal = key.nextLine();
		for (int i = 0; i < hexadecimal.length(); i++) {
			char[] c = hexadecimal.substring(i, i + 1).toCharArray();
			double multiplier = Math.pow(16, hexadecimal.length() - i);
			// System.out.println("power " + hexadecimal.length());
			// System.out.println("multiplier " + multiplier);
			double addition = multiplier * Character.getNumericValue(c[0]);
			// System.out.println("adding " + addition);
			decimal += addition;
		}
		System.out.println(decimal);
	}
}

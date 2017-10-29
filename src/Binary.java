import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Binary {

	public Binary(PrintWriter pw) {

	}

	static Scanner key = new Scanner(System.in);

	public static void main(String[] args) {
		//binToDec();
		binToHex();
	}

	public static void binToDec() {
		System.out.println("Enter a binary you want to convert to decimal.");
		String id = key.nextLine();
		double j = 0;
		for (int i = 0; i < id.length(); i++) {
			if (id.charAt(i) == '1') {
				j = j + Math.pow(2, id.length() - 1 - i);
			}
		}
		System.out.println((int) j);
	}

	public static void binToHex() {
		System.out.println("Enter a binary you want to convert to Hexadecimal.");
		String ih = key.nextLine();
		StringBuilder b = new StringBuilder(ih);
		while (ih.length() % 4 != 0) {
			if (ih.length() % 4 != 0) {
				b.insert(0, 0);
			}
		}
		double d = 0;
		String e = "";
		int c = 0;
		for (int i = 1; i < ih.length() / 4+1; i++) {
			for (int j = 0; j < 4; j++) {
				d += ih.charAt(c);
				c++;
				}
			if(d == 0000) {
				e = "0"+e;
			}
			else if(d == 0001) {
				e = "1"+e;
			}
			else if(d == 0010) {
				e = "2"+e;
			}
			else if(d == 0011) {
				e = "3"+e;
			}
			else if(d == 0100) {
				e = "4"+e;
			}
			else if(d == 0101) {
				e = "5"+e;
			}
			else if(d == 0110) {
				e = "6"+e;
			}
			else if(d == 0111) {
				e = "7"+e;
			}
			else if(d == 1000) {
				e = "8"+e;
			}
			else if(d == 1001) {
				e = "9"+e;
			}
			else if(d == 1001) {
				e = "a"+e;
			}
			else if(d == 1010) {
				e = "b"+e;
			}
			else if(d == 1011) {
				e = "c"+e;
			}
			else if(d == 1100) {
				e = "d"+e;
			}
			else if(d == 1101) {
				e = "e"+e;
			}
			else if(d == 1111) {
				e = "f"+e;
			}
			d = 0;
		}
		System.out.println(e);
	}

	public void output() {

	}
}

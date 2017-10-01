import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {

	PrintWriter pw;
	Scanner in = new Scanner(System.in);
	
	public Menu(PrintWriter pw) {
		this.pw = pw;
	}
	
	public void display() {
		System.out.println("> 1 Decimal to Binary\n" +
						   "> 2 Decimal to Hexadecimal\n" +
						   "> 3 Binary to Decimal\n" +
						   "> 4 Binary to Hexadecimal\n" +
						   "> 5 Hexadecimal to Decimal\n" +
						   "> 6 Hexadecimal to Binary\n" +
						   "> 7 Exit\n");
	}
	
	public int getSelection() {
		System.out.print("Choice: ");	
		int choice;
		String line = in.nextLine();
		while (true) {
			try {
				choice = Integer.parseInt(line);
				if (choice < 1 || choice > 7)
					throw new Exception();
				break;
			} catch (Exception e) {
				System.out.print("Choice: ");
				line = in.nextLine();
			}
		}
		pw.println("Choice: " + choice);
		return choice;
	}
	
}

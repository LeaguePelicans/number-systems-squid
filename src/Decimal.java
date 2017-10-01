import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class Decimal {
	static PrintWriter pw;
	public Decimal(PrintWriter pw) {
		this.pw = pw;
	}
	public static void decToBin() {
		 Scanner key = new Scanner(System.in);
		 System.out.println("Enter a decimal you want to convert to binary:");
		 int num = key.nextInt();
		 Stack <Integer>s = new Stack<Integer>();
		 int currentNum = num;
		 while(currentNum >=1) {
			 int remainder = currentNum%2;
			 s.push(remainder);
			 if(remainder ==1) {
				 currentNum = ((currentNum-1)/2);
			 }
			 else {
				 currentNum = currentNum/2;
			 }
		 }
		 StringBuilder convertedNum =new StringBuilder("");
		 for(int i : s) {
			 String c = Integer.toString(i);
			 convertedNum.append(c);
		 }
		 System.out.println(convertedNum.reverse());
	}
	
	public static void decToHex() {
		 Scanner key = new Scanner(System.in);
		 System.out.println("Enter a decimal you want to convert to hexadecimal:");
		 double num = key.nextDouble();
	}
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(new FileWriter("/Users/league/Desktop/csis.txt"));
		Decimal d = new Decimal(pw);
		d.decToBin();
		
	}
}

package height;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		foot=in.nextInt();
		inch=in.nextDouble();
		System.out.println("foot="+foot+",inch="+inch);
		System.out.println((foot+inch/12)*0.3048);
	}
}

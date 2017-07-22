package count;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Please input a number:");
		int number=in.nextInt();
		int count=0;
		while(number>0)
		{
			number=number/10;
			count=count+1;
		}
		System.out.println(count);
	}
}

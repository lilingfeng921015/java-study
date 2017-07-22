package judge;

import java.util.Scanner;

public class Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x;
		int y;
		System.out.println("Please input two numbers:");
		x=in.nextInt();
		y=in.nextInt();
		int max=0;
		if(x>y)
		{
			max=x;
		}
		else
		{	
			max=y;
		}
		System.out.println(max);
	}

}

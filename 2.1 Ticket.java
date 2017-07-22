package ticket;

import java.util.Scanner;

public class Ticket 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int price=10;
	while(true) 
		{
			Scanner in = new Scanner(System.in);
			System.out.println("请投币：");
			int amount=in.nextInt();
	//		System.out.println(amount);
			int balance=0;
			balance=balance+amount;
	//		System.out.println(amount>=price);
			if(balance>=price)
			{
				System.out.println("Java城际铁路专线");
				System.out.println("票价10元");
				System.out.println("找零："+(balance-price));
				balance=0;
			}
		}
	}
}

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
			System.out.println("��Ͷ�ң�");
			int amount=in.nextInt();
	//		System.out.println(amount);
			int balance=0;
			balance=balance+amount;
	//		System.out.println(amount>=price);
			if(balance>=price)
			{
				System.out.println("Java�Ǽ���·ר��");
				System.out.println("Ʊ��10Ԫ");
				System.out.println("���㣺"+(balance-price));
				balance=0;
			}
		}
	}
}

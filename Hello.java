package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Scanner in = new Scanner(System.in);
//		System.out.println("echo:"+in.nextLine());
		int price;
		int amount;
		System.out.print("请输入票面金额：");
		amount=in.nextInt();
		System.out.print("请输入消费金额：");
		price=in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
	}

}

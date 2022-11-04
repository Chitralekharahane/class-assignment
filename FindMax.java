package basicprogram;

import java.util.Scanner;

public class FindMax {
	public static void main(String[]args) {
		int num1,num2;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter two nos");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		if(num1>num2)
			System.out.println("max:" +num1);
		else
			System.out.println("max:" +num2);
	}

}

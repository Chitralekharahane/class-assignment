package basicprogram;

import java.util.Scanner;

public class Divisible {
	public static void main(String[]args) {
		int num1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num1=sc.nextInt();
		
		if((num1%5==0)&&(num1%11==0))
		
		System.out.println("yes");
		
		
		else
			
		System.out.println("no");
	}
}

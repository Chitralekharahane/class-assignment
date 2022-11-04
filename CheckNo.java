package basicprogram;

import java.util.Scanner;

public class CheckNo {
	public static void main(String[]args) {
		int num1;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the num");
		num1=sc.nextInt();
		
		if(num1>0)
			System.out.println("positive:" +num1);
		else
			System.out.println("negative:" +num1);
	}

}

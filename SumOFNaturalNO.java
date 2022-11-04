package basicprogram;

import java.util.Scanner;

public class SumOFNaturalNO {
public static void main(String[]args)
{
	
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter range:");
	n=sc.nextInt();
	
	
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
		
	}
	System.out.println("sum of natural no from 1 to "+n+" is: "+sum);
	sc.close();
	}

}

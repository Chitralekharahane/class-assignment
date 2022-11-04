package basicprogram;

import java.util.Scanner;

public class TotalMarks {
public static void main(String[]args)
{
float sub1,sub2,sub3,sub4,sub5,total,avg,per;
Scanner sc=new Scanner(System.in);

System.out.println("Enter marks of sub1");
sub1=sc.nextFloat();
System.out.println("Enter marks of sub2");
sub2=sc.nextFloat();
System.out.println("Enter marks of sub3");
sub3=sc.nextFloat();
System.out.println("Enter marks of sub4");
sub4=sc.nextFloat();
System.out.println("Enter marks of sub5");
sub5=sc.nextFloat();

total=sub1+sub2+sub3+sub4+sub5;
System.out.println("Your total marks is: "+total);

avg=total/5;
System.out.println("Your total marks is: "+avg);

per=(total/500)*100;
System.out.println("Your percentage is: "+ per);


if(total>=300)
	
	System.out.println("pass");
else
	System.out.println("fail");


	

	
}


}

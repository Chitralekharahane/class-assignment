package basicprogram;
import java.util.Scanner;

public class MaximumAmongThree {
public static void main(String[]args)	{
	int num1,num2,num3,max;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter three num");
	num1=sc.nextInt();//56
	num2=sc.nextInt();//98
	num3=sc.nextInt();//400
	
	if(num1>num2)//56>98f
	{
		   if(num1>num3)
		   {
			    max=num1;
		   }
		   else
		   {
			   max=num3;
		   }
		      
	}
	else
	{
		 if(num2>num3)//98>400f
		 {
			 max=num2;
		 }
		 else
		 {
			  max=num3;//400is greater
			  
		 }
	}
	
System.out.println("Maximum number among all three is:"+ max);
	
}

}

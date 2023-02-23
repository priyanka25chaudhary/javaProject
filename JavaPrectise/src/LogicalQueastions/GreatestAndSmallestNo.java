package LogicalQueastions;
import java.util.Scanner;  
public class GreatestAndSmallestNo  
{  
public static void main(String args[])  
{  
int num1, num2, num3, num4;  
System.out.println("Enter four integers: ");  
Scanner in = new Scanner(System.in);  
num1=in.nextInt();  
num2=in.nextInt();  
num3=in.nextInt();
num4=in.nextInt();
if (num1 > num2 && num1 > num3 && num1 > num4)  
System.out.println("largest number is: "+num1);  
else if (num2 > num1 && num2 > num3 && num2 > num4 )  
System.out.println("largest number is: "+num2);  
else if (num3 > num1 && num3 > num2 && num3 > num4)  
System.out.println("largest number is: "+num3);
else if (num4 > num1 && num4 > num2 && num4 > num3)  
System.out.println("largest number is: "+num4);  
else  
System.out.println("numbers are same."); 

if (num1 < num2 && num1 < num3 && num1 < num4)  
System.out.println("smallest number is: "+num1);  
else if (num2 < num1 && num2 < num3 && num2 < num4 )  
System.out.println("smallest number is: "+num2);  
else if (num3 < num1 && num3 < num2 && num3 < num4)  
System.out.println("smallest number is: "+num3);
else if (num4 < num1 && num4 < num2 && num4 < num3)  
System.out.println("smallest number is: "+num4);  
else  
System.out.println("numbers are same."); 
}  
}  

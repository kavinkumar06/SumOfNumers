# SumOfNumers
import java.io.*;
import java.util.*;
public class SumOfNum
{
  public static void main(String args[])
  {
    int sum,n=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      sum=sum+i;
     }
     System.out.println("Sum of N numbers="+sum);
     }
   }  

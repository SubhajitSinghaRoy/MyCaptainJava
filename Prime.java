import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int n,i;
     System.out.println("enter the number to check if it is prime or no:\n");
     n=sc.nextInt();
     for(i=2;i<=n/2;i++)
     {
         if(n%i==0)
         {
             System.out.println("it is not a prime number");
             break;
         }
         else
         System.out.println("it is a prime number!");
         break;
     }
    }
    }
    


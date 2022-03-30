import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0,b=1,c;
        int i;
        System.out.println("The fibonacci series for the first 10 numbers is:\n");
        System.out.print(a+" "+b);
        for(i=0;i<10;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }
    
}

import java.util.*;
public class NumPal1 {
    public static void  main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
     int n=sc.nextInt();
     value(n);
     sc.close();
    }
    public static void value(int a)
    {
        int temp=a,rem,sum=0;
        while(a>0)
        {
            rem=a%10;
            sum=(sum*10)+rem;
            a=a/10;
         }
         if(temp==sum)
            System.out.println("palindrome number");
         else
            System.out.println("not a palindrome number");
    }

}
    


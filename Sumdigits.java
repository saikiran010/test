import java.util.*;
public class Sumdigits {
    static void sum(int n)
    {
        int sum=0;
        while(n>0){
         sum=sum+(n%10);
         n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number"); 
        int x=sc.nextInt();
        sum(x);
    }
}

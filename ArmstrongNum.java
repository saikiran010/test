import java.util.*;
public class ArmstrongNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        check(n);
        sc.close();
    }
    public static void check(int x){
        int rem,sum=0,temp=x;
        while(x>0){
            rem=x%10;
            sum=rem*rem*rem+sum;
            x=x/10;
        }
        if(sum==temp)
            System.out.println("armstrong");
         else
            System.out.println("not armstrong");   
    }
        
    }
    


import java.util.*;
public class Exitconlp {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a positive number");
       int n=sc.nextInt();
       int sum=0,sum2=0,temp=n,digits=0;
       while(temp>0){
           temp=temp/10;
            digits++;
        }
        temp=n;
        do{
        int r=n%10;
        sum=sum*10+r;
        int r1=1;
         for(int i=0;i<digits;i++)
            r1=r1*r;
        sum2= sum2 +r1;
        n=n/10;
        }while(n>0);
       if(sum==temp && temp>9)
         System.out.println(temp+" is palindrome number");
         else if(sum2==temp && temp>9)
         System.out.println(temp+" is armstrong number");
         else if(sum==sum2)
         System.out.println(temp+" is palindrome no. and armstrong number");
         else 
         System.out.println(temp+" is not palindrome and armstrong number");
       } 
    }


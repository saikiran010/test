import java.util.*;
public class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int count=0;
        int temp=n,temp1=n,sum=0,r;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        while(n>0){
            r=n%10;
            int s=1;
            for(int i=0;i<count;i++)
              s=s*r;
            sum=sum+s;
            n=n/10;
        }
      if(sum==temp1)
        System.out.println("armstrong");
        else
        System.out.println(" not armstrong");
    }
}

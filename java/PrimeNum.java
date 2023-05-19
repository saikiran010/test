import java.util.*;
public class PrimeNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        int n=sc.nextInt();
        check(n);
        
        }
        sc.close();
        }
    
    public static void check(int x){
        int i=1,count=0;
        while(i<=x){
            if(x%i==0)
              count++;
            i++;
        }
        if(count==2)
           System.out.println("prime");
           else
           System.out.println("not prime");
       }
    }
    
    
    


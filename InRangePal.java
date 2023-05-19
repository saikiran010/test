import java.util.*;
public class InRangePal {
    public static void main(String args[]){
        System.out.println(Arrays.toString(palvalues(10,100)));
    }
    public static int[] palvalues(int start,int end){
        int b[]=new int[(end-start)/10];
        int j=0;
        for(int i=start;i<end;i++){
        int temp,sum=0,rem;
          temp=i;
        while(temp>0){
            rem=temp%10;
            sum=(sum*10)+rem;
            temp=temp/10;
            }
            if(i==sum)
              {
                b[j]=sum;
                j++;
              }
              }
            return b;
    }
    }

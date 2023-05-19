import java.util.Scanner;
public class Lsearch {
    static int linearsearch(int[] a,int x){
        for(int i=0;i<a.length;i++){
            if(x==a[i])
                return i;
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={2,7,3,6,5,4};
        System.out.println("enter search element:");
        int x=sc.nextInt();
        int r=linearsearch(a,x);
        if(r==-1)
          System.out.println("not found");
          else
          System.out.println("element "+x+" is found at "+(r+1)+" position");
    }
}

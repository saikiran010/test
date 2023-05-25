/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		       a[i]=sc.nextInt();
		     int x;
		    for(int j=1;j<n;j++){
		       int count=0;
		        for(int k=0;k<n;k++){
		            if(a[k]%j!=0)
		                count++; 
		        }
		        if(count==n){
		          System.out.println(j-1);
		          break;
		        }
		    }
		}
	}
}

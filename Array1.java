package assignment2;

import java.util.Scanner;

public class Array1 {
	
	public boolean isAllEven() {
		int count=0,sum=0;
		boolean ans1,ans2;
		Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
	    int arr[]=new int[size];
		System.out.println("please enter the size of array");;
		for(int i=0;i<=size;i++)
		{
			System.out.println("please enter the number to store in array"+arr[i]);
			int a= sc.nextInt();
			arr[i]=a;
			if(arr[i]%2==0) {
		      System.out.println("this is even number");
		      count++;
		      
			}
			else {
				System.out.println("this is odd number");
				sum++;
			}
		}
		if(count==sum) {
		 ans1=true;	
		 return ans1;
		}else
		{
		ans2=false;
		
       	return ans2;
		}

	}
	

}

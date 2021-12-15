package tp;

import java.util.Scanner;

public abstract class tp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of items");
		  int n=sc.nextInt();
		  int[] arr=new int[n];  
		  
		System.out.println("Enter the list");
		
		for (int i=0;i<n;i++)
		{	
             int a=sc.nextInt();
             arr[i]=a;
        
		}
		System.out.println("Array is:");
		for (int i=0;i<n;i++)
		{	
             
			System.out.print(arr[i]);
        
		}
		System.out.println();
		for(int i=0;i<n;i++)
			for(int j=0;j<n+1;j++){
		{int temp;
		if(j<(n-1)) {
			if(arr[j]>arr[j+1])
			{
				temp=arr[j+1];
			    arr[j+1]=arr[j];
				arr[j]=temp;
				
			}
		}	
		}}
		System.out.println("Reverse Array is:");
		
		for (int i=0;i<n;i++)
		{	
             
			System.out.print(arr[i]);
        
		}
		
		
        
	}

}

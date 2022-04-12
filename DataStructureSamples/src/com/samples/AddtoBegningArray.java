package com.samples;

import java.util.Scanner;

public class AddtoBegningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the 1D array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The entered 1D array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");;
		}
		
		//Adding element to the begning of the array
		
		System.out.println("\nEnter the element to be added");
		int e=sc.nextInt();
		
		int marr[]=new int[n+1];
		 marr[0]=e;
		for(int k=1;k<n+1;k++)
		{
			marr[k]=arr[k-1];
		}
		
		System.out.println("The modified array is: ");
		for(int m=0;m<n+1;m++)
		{
			System.out.print(marr[m]+" ");
		}
		
		
		

	}

}

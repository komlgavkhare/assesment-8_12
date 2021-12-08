package assesment_8_12_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Ascending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = new int[20];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  number of element:");
		int u= sc.nextInt();
		System.out.println("enter"+u+" elments");
		for (int i = 0; i < u; i++)
		{
		
			 a[i]= sc.nextInt();
		}
		Arrays.sort(a);   
		System.out.println("Elements of array sorted in ascending order: ");  

	
	for (int i = 0; i < a.length; i++)   
	{      
	System.out.println(a[i]);   
	}   
}  
	}



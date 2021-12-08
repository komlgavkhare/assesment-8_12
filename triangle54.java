package assesment_8_12_2021;

import java.util.Scanner;

public class triangle54 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  number of rows:");
		int rows= sc.nextInt();
		
		for(int i=rows;i>=0;--i)
		{
		for(int j=i;j<=5;j++)
		{
		System.out.print(" "+j);
		}
		System.out.println(" ");
		}
		  }
	}  



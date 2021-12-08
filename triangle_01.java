package assesment_8_12_2021;

import java.util.Scanner;

public class triangle_01 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter  number of rows:");
		int rows= sc.nextInt();
		
		for (int i = 0; i<= rows; i++) 
		{
		      for (int j = 0; j<=i*2; j++) 
		      {
                  if(j==0 ) {
                	  System.out.print("1 ");
                           }
                  else {
                	  if(j==i*2) {
                		  System.out.print("1 ");
                	  }
                	  else {
                  System.out.print("0 ");
                	  }
                  }
                  }
		      System.out.println(" ");
		  }
	}
}



package Tuition;

import java.util.Scanner;

public class totaltuition{
	
	
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);
		
	System.out.println("Enter your First year tuition: \n");
	
	int fyt = input.nextInt();
		
	System.out.println("Enter your Increasing rate: \n");
	double Ir = input.nextDouble();
	
	double total = 0;
	int count = 0;
	
	do{
		total += fyt * (Math.pow((Ir + 1), count));
		count++;
	}while(count <= 3);
	
	System.out.print("Tuition in 4 years is: \n $" + total);
	
	
	
	}
}

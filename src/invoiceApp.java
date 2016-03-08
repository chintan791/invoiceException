

import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.NumberFormat;

public class invoiceApp {

	public static void main(String[] args) {
	
		
		NumberFormat nf= NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		nf.setMinimumFractionDigits(2);
		nf.setRoundingMode(RoundingMode.HALF_UP);

		Scanner sc = new Scanner (System.in);
		
		double value=0 ;
		int count = 0;
		int i =0;
		double rate=0;
		double total = 0;
		double tax = 0;
		double grandTotal = 0;
		
		double [] d = new double [100];
		
		

	try
	{
		
		System.out.println("Total rate ? : "  );
		rate = sc.nextDouble();
	} 
	catch (InputMismatchException e){
		System.out.println("Invalid input");
	}
	finally {
		System.out.println("finally block will execute");
	}
	try 
	{
		
		
		do
		{
			count++;
			System.out.println("Price # " + count );
			
			
			
			
			d[i] = sc.nextDouble();
			
			value = d[i];
			System.out.println (nf.format(d[i]));
			
			i++;
			}
			
		
			
		 while (value != 0.00);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Receipt ");
	}
	
		catch (InputMismatchException e){
			System.out.println("Invalid input 2");
	}
	
	for (i=0; i <100 ; i++)
	{
		
		System.out.println (nf.format(d[i]));
		
		total += d[i];
		
		if (d[i] == 0)
			break;
	}
	
	System.out.println(total + " subtotal");
	
	tax = total * rate;
	
	System.out.println(tax + " tax");
	
	grandTotal = tax + total;
	
	System.out.println(grandTotal + " grand total");
	
	
	
	
	}

	}

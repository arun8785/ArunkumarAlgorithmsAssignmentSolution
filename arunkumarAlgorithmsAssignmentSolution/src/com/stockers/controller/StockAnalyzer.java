package com.stockers.controller;

import java.util.Scanner;

import com.stockers.model.StockDetails;
import com.stockers.service.StockerOperations;

public class StockAnalyzer {
	
	public static void main(String[] args) {
			
			int choice = 0;
			int noOfCompanies = 0;
			double[] inputShrPr;
			boolean [] inputShrGr;
			double stkPrice;
			System.out.println("Welcome to the login page");
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the no of companies");
			noOfCompanies = in.nextInt();
			StockDetails stockDtl = new StockDetails(noOfCompanies);
			stockDtl.AddShareDetails();
			inputShrPr = stockDtl.shrPrice; 
			inputShrGr = stockDtl.shrGrowth;
			StockerOperations stockOpr = new StockerOperations();
						
			do {
				System.out.println("----------------------------------------------------------------------------");
				System.out.println("Enter the operation that you want to perform");
				System.out.println("1. Display the companies stock prices in ascending order");
				System.out.println("2. Display the companies stock prices in descending order");
				System.out.println("3. Display the total no of companies for which stock prices rose today");
				System.out.println("4. Display the total no of companies for which stock prices declined today");
				System.out.println("5. Search a specific stock price");
				System.out.println("6. Press 0 to exit");
				System.out.println("----------------------------------------------------------------------------");
				
				choice=in.nextInt();
				
				switch (choice) {
				case 0:
					choice=0;
					break;
					
				case 1:	
					stockOpr.orderSharePriceAsc(inputShrPr);
					break;
				
				case 2:	
					stockOpr.orderSharePriceDsc(inputShrPr);
					break;
				case 3:	
					stockOpr.profitStock(inputShrGr, choice);
					break;
				case 4:	
					stockOpr.profitStock(inputShrGr, choice);
					break;
				case 5:
					System.out.println("Enter the Stock Price value: ");
					stkPrice = in.nextDouble();
					stockOpr.findStockValue(inputShrPr, stkPrice);
				default:
						System.out.println("Enter valid option");
						break;
				}
				
			}while(choice!=0);
			
			System.out.println("Exited successfully");
			in.close();
						
	}

}

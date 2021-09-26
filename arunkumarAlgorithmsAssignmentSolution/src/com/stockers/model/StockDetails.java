package com.stockers.model;

import java.util.Scanner;

public class StockDetails {
		private int noOfCompanies;
		public double[] shrPrice;
		public boolean[] shrGrowth;
		public StockDetails(int noOfCompanies) {
			this.noOfCompanies = noOfCompanies;
		}
		public double getnoOfCompanies() {
			return noOfCompanies;
		}
		public void noOfCompanies(int noOfCompanies) {
			this.noOfCompanies = noOfCompanies;
		}
		public void AddShareDetails() {
			double[] shrPrice;
			boolean[] shrGrowth;
			shrPrice = new double[noOfCompanies];
			shrGrowth = new boolean[noOfCompanies];
			@SuppressWarnings("resource")
			Scanner sr = new Scanner(System.in);
			for(int i=0;i<noOfCompanies;i++) {
				int j=i+1;
				System.out.println("Enter current stock price of the company " + j);
				shrPrice[i] = sr.nextDouble();
				System.out.println("Whether company's stock price rose today compare to yesterday?");
				shrGrowth[i] = sr.nextBoolean();
			}
			this.shrPrice = shrPrice;
			this.shrGrowth = shrGrowth;
		}
}

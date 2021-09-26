package com.stockers.service;

public class StockerOperations {
	
		public int i, j, l, r, ch;
		public static int PIVOT;
		public double array[],temp,stockPr;
		public boolean arr[];		
		public void orderSharePriceAsc(double[] inputShrPr) {
			this.array = inputShrPr;
			l = 0;
			r = array.length - 1;
			partitionA(array, l, r);
			System.out.println("Stock prices in ascending order are :");
			printArr(array);
		}
		
		public int partitionA(double array[], int l, int r) {
			PIVOT = r;
			i = l - 1;
			
			 for (int j = l; j <= r - 1; j++)  
			    {  
			        // If current element is smaller than the pivot  
			        if (array[j] < PIVOT)  
			        {  
			            i++; // increment index of smaller element  
			            temp = array[i];  
			            array[i] = array[j];  
			            array[j] = temp;  
			        }  
			    }  
			    temp = array[i+1];  
			    array[i+1] = array[r];  
			    array[r] = temp;  
			    return (i + 1);  
			}
		
		void quickAsc(double[] array, int l, int r) {  
		    if (l < r)  
		    	{  
		    		int p = partitionA(array, l, r);
		    		quickAsc(array, l, p - 1);  
		    		quickAsc(array, p + 1, r);  
		    	}  
		}
		
		public void orderSharePriceDsc(double[] inputShrPr) {
			this.array = inputShrPr;
			l = 0;
			r = array.length - 1;
			partitionD(array, l, r);
			System.out.println("Stock prices in descending order are :");
			printArr(array);
		}
		
		public int partitionD(double array[], int l, int r) {
			PIVOT = l;
			i = l;
			
			 for (int j = l + 1; j <= r; j++)  
			    {  
			        // If current element is smaller than the pivot  
			        if (array[j] > PIVOT)  
			        {  
			            i++; // increment index of smaller element  
			            temp = array[i];  
			            array[i] = array[j];  
			            array[j] = temp;  
			        }  
			    }  
			    temp = array[i];  
			    array[i] = array[l];  
			    array[l] = temp;  
			    return (i);  
			}
			  
			/* function to implement quick sort */  
		
		void quickDsc(double[] array, int l, int r) {
			    if (l < r)  
			    	{  
			    		int p = partitionD(array, l, r);
			    		quickDsc(array, l, p);  
			    		quickDsc(array, p + 1, r);  
			    	}  
			}  
			
		/* function to print an array */  
		void printArr(double array[])  
			{  
			    int i;  
			    for (i = 0; i < array.length; i++)  
			        System.out.print(array[i] + " ");  
			    System.out.println();
			}  

		/* function to check the profit ration of companies */  
		public void profitStock(boolean[] inputShrGr, int choice) {
				this.arr = inputShrGr;
				this.ch = choice;
				int c = 0;
				for (int i=0;i<arr.length;i++) {
					if ((arr[i]) && (ch == 3)) {
						c++;
					} 
					if ((!arr[i]) && (ch == 4)) {
						c++;
					}
				}
				if (ch == 3) {
					System.out.println("Total no of companies whose stock price rose today : " + c);
				}
				if (ch == 4) {
					System.out.println("Total no of companies whose stock price declined today :" + c);
				}
			}
			
			/* function to search a stock value of the company */
		public void findStockValue(double[] inputShrPr, double stkPrice) {
				this.array = inputShrPr;
				this.stockPr = stkPrice;
				int n = array.length;
				binarySearch(array, 0, n - 1, stockPr);
		}
			
		public void binarySearch(double arr[], int l, int r, double x)
		{
				int mid = l + (r - l) / 2;
				while (l <= r) {
					if (x < array[mid]) {
						r = mid - 1;
					} else if (x > arr[mid]){
						l = mid + 1;
					} else {
						System.out.println("Stock of value " + x + " is present");
						break;	
					}
					mid = l + (r - l) / 2;
				}
				if (l>r) {
					System.out.println("Value not found");
				}
			}

}

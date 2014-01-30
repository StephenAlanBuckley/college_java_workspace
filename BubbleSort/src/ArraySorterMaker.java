/*
 * Stephen Buckley
 * The BubbleSorting Homework
 * 11/4/09
 */

import java.util.Random;


public class ArraySorterMaker {

	public static void main(String[] args){
		double startarr[] = new double[20];
		Random randomGenerator = new Random(1);
		for(int i=0;i<startarr.length;++i)
		{
			startarr[i]= randomGenerator.nextDouble();
		}
		System.out.println("This is the unsorted Array");
		for(int i =0; i<startarr.length; ++i)
		{
			System.out.println(startarr[i]);
		}
		
		double nextarr[] =bubbleSort(startarr);
		System.out.println("");
		System.out.println("");
		System.out.println("This is the sorted Array");
		
		for(int i = 0; i<nextarr.length; ++i)
		{
			System.out.println(nextarr[i]);
		}
		
	}
	
	public static double[] bubbleSort (double newarr[])
	{
		double a=0;
		double b=0;
		int alterations =1;
		while(alterations>0)
		{
			alterations =0;
		
			for(int i = 0; i<newarr.length-1;++i)
			{
				a= Math.max(newarr[i], newarr[i+1]);
				if(a==newarr[i+1])
				{
					
				}else{
					b= Math.min(newarr[i], newarr[i+1]);
					newarr[i]=b;
					newarr[i+1]=a;
					alterations = alterations +1;
				}
			
			}
		}
		return newarr;
	}
}

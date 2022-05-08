package com.greatlearning.Test;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;
import com.greatlearning.skyscraperBuilding.*;

public class Driver {
	public static void main(String args[])
	{
		System.out.println("*********************************************************************************************************");
		
	    Scanner sc=new Scanner(System.in);
	    int numberOfFloors;
	   
	    
		
		System.out.println(" Enter the total no of floors in the building " );
		
		numberOfFloors=sc.nextInt();
		 LinkedList<Integer> ll=new LinkedList<>();
		 int day =1;
		
		
		System.out.println("************************************************************************************************************");
		
		for(int i=0;i<numberOfFloors;i++)
		{
			System.out.println("Enter the floor size given on day : "+day);
			
			ll.add(sc.nextInt());
			day++;
		}
		
		
		System.out.println("************************************************************************************************************");
		
		System.out.println("The order of construction is as follows :");
		
		FloorAssemble.floorsAssemble(ll,numberOfFloors);
		
		
	  
}
}

package com.greatlearning.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

import com.greatlearning.service.FloorConstruction;

public class Skyscraper {
	
	public static int floorCount;
	public static int fSize;
	Scanner sc=new Scanner(System.in);
	
	public static Queue<Integer> floor=new LinkedList<>();
	
	public void getFloorCount()
	{
		System.out.println("Enter Number of floors in the building:");
		floorCount=sc.nextInt();
	}
	
	public void getFloorSize()
	{
		for(int i=0;i<floorCount;i++)
		{
			System.out.println("Enter the floor size given on day "+(i+1));
			fSize=sc.nextInt();
			floor.add(fSize);
		}
		
		FloorConstruction fc=new FloorConstruction();
		fc.workFlow();
	}

}

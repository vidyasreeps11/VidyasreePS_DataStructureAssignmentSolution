package com.greatlearning.service;

import java.util.ArrayList;
import java.util.List;


import com.greatlearning.model.Skyscraper;

public class FloorConstruction {
	
	
	public void workFlow()
	{
		Skyscraper obj=new Skyscraper();
		List<Integer> temp=new ArrayList<Integer>();
		
		int floorCount=obj.floorCount;
		
		int day=1;
		
		System.out.println("\nThe order of construction is as follows\n");
		while(floorCount>=1)
		{
			if(obj.floor.peek()==floorCount)
			{
				
				System.out.print("Day "+day+": "+obj.floor.peek()+" ");
				obj.floor.poll();
				
				if(!temp.isEmpty())
				{
					int i=floorCount;
					while(temp.contains(i-1) && temp.isEmpty()==false)
					{
						 int index=temp.indexOf(i-1);
						 System.out.print(temp.get(index)+" ");
						 temp.remove(index);
						 i--;
					
					}
					floorCount=i-1;
					
				}
				else
					floorCount--;
				
				day++;

				System.out.println();
			}
			else if(obj.floor.peek()<floorCount)
			{
				temp.add(obj.floor.poll());
				System.out.println("Day "+day+": no work done");
				day++;
			}
			
		}

		
	}

	}


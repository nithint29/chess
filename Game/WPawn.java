package Game;
import java.util.ArrayList;


import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


public class WPawn extends Actor
{
	public void act()
	{
		
	}
	
	public boolean getC()
	{
		return false;
	}
	
	
	
	public ArrayList<Location> getmoveLocations()
	{
		ArrayList<Location> temp=new ArrayList<Location>();
		
		Location x = new Location(getLocation().getRow()-1,getLocation().getCol());
		Location y = new Location(getLocation().getRow()-1,getLocation().getCol());
		
		if(getLocation().getRow() == 6)
		{
			 y = new Location(getLocation().getRow()-2,getLocation().getCol());
		}
		
		if(!getGrid().getOccupiedLocations().contains(x))
		{
		temp.add(x);
		}
		
		if(!getGrid().getOccupiedLocations().contains(y))
		{
		temp.add(y);
		}
		
		
		Location y1 = new Location(getLocation().getRow()-1,getLocation().getCol()+1);
		Location y2 = new Location(getLocation().getRow()-1,getLocation().getCol()-1);
		
		if(getGrid().getOccupiedLocations().contains(y1)&& !(getGrid().get(y1).getC()== getC()))
		{
			temp.add(y1);
		}
		
		if(getGrid().getOccupiedLocations().contains(y2)&& !(getGrid().get(y2).getC()== getC()))
		{
			temp.add(y2);
		}
		
		
		return temp;
		
		
	}
	
	
	public ArrayList<Location> getmoveLocations2()
	{
		


		ArrayList<Location> temp=new ArrayList<Location>();
		int x=0;int y=0;
		Location temp2=new Location(getLocation().getRow()+1,getLocation().getCol()+1);
		/*
		if(getGrid().get(temp2).getC()== (!getC()));
		temp.add(temp2);
		temp2=new Location(getLocation().getRow()-1,getLocation().getCol()+1);


		if(getGrid().get(temp2).getC()== (!getC()));
				temp.add(temp2);
				*/
			temp2=new Location(getLocation().getRow(),getLocation().getRow()+1);
			
			if(!getGrid().getOccupiedLocations().contains(temp2)&&getGrid().isValid(temp2));
			temp.add(temp2);
		
		return temp;
		
		
	}
	
	public String toString()
	{
		return "WPawn";
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


	}


}

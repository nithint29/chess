package Game;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class WRook extends Actor{


	
	
	public boolean getC()
	{
		return false;
	}

	
	public ArrayList<Location> getmoveLocations()
	{
		ArrayList<Location> ans = new ArrayList<Location>();
		
		
		
		for(int i = 1; i<=7;i++)
		{
			Location x = new Location(getLocation().getRow()+i,getLocation().getCol());
			if(getGrid().isValid(x))
			{
				if(!getGrid().getOccupiedLocations().contains(x))
				{
					ans.add(x);
				}
				if(getGrid().getOccupiedLocations().contains(x) && !(getGrid().get(x).getC()== getC()))
				{
					ans.add(x);
					i = 8;
				}
				
				else if(getGrid().getOccupiedLocations().contains(x) && (getGrid().get(x).getC()== getC()))
				{
					
					i = 8;
				}
			}
			
		}
		
		for(int i = 1; i<=7;i++)
		{
			Location x = new Location(getLocation().getRow()-i,getLocation().getCol());
			if(getGrid().isValid(x))
			{
				if(!getGrid().getOccupiedLocations().contains(x))
				{
					ans.add(x);
				}
				if(getGrid().getOccupiedLocations().contains(x) && !(getGrid().get(x).getC()== getC()))
				{
					ans.add(x);
					i = 8;
				}
				
				else if(getGrid().getOccupiedLocations().contains(x) && (getGrid().get(x).getC()== getC()))
				{
					
					i = 8;
				}
			}
		}
		
		for(int i = 1; i<=7;i++)
		{
			Location x = new Location(getLocation().getRow(),getLocation().getCol()+i);
			
			if(getGrid().isValid(x))
			{
				if(!getGrid().getOccupiedLocations().contains(x))
				{
					ans.add(x);
				}
				if(getGrid().getOccupiedLocations().contains(x) && !(getGrid().get(x).getC()== getC()))
				{
					ans.add(x);
					i = 8;
				}
				
				else if(getGrid().getOccupiedLocations().contains(x) && (getGrid().get(x).getC()== getC()))
				{
					
					i = 8;
				}
			}
		}
		
		for(int i = 1; i<=7;i++)
		{
			Location x = new Location(getLocation().getRow(),getLocation().getCol()-i);
			if(getGrid().isValid(x))
			{
				if(!getGrid().getOccupiedLocations().contains(x))
				{
					ans.add(x);
				}
				if(getGrid().getOccupiedLocations().contains(x) && !(getGrid().get(x).getC()== getC()))
				{
					ans.add(x);
					i = 8;
				}
				
				else if(getGrid().getOccupiedLocations().contains(x) && (getGrid().get(x).getC()== getC()))
				{
					
					i = 8;
				}
			}
		}
		return ans;
		
		
	}
	
	public String toString()
	{
		return "WRook";
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}

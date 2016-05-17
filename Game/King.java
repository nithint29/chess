package Game;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;

public class King extends Actor{
	
	public boolean moved;

	public King()
	{
		super();
		moved = false;
	}

	public void act()
	{
		
	}
	
	public boolean isKing()
	{
		return true;
	}
	
	public boolean getC()
	{
		return true;
	}
	
	public ArrayList<Location> getmoveLocations()
	{
		ArrayList<Location> ans = new ArrayList<Location>();
		
		//This is for castling.
		//Location a = new Location(getLocation().getRow(),getLocation().getCol()+1);
		//Location b = new Location(getLocation().getRow(),getLocation().getCol()+2);
		//if(moved == false && getGrid().get(a) == null && getGrid().get(b) == null)
		{
		//	ans.add(b);
			
		}
		
		
		
		for(int i = 1; i<=1;i++)
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
		
		for(int i = 1; i<=1;i++)
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
		
		for(int i = 1; i<=1;i++)
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
		
		for(int i = 1; i<=1;i++)
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
		
		
		for(int i = 1; i<=1;i++)
		{
			Location x = new Location(getLocation().getRow()+i,getLocation().getCol()+i);
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
		
		for(int i = 1; i<=1;i++)
		{
			Location x = new Location(getLocation().getRow()-i,getLocation().getCol()-i);
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
		
		for(int i = 1; i<=1;i++)
		{
			Location x = new Location(getLocation().getRow()-i,getLocation().getCol()+i);
			
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
		
		for(int i = 1; i<=1;i++)
		{
			Location x = new Location(getLocation().getRow()+i,getLocation().getCol()-i);
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
		return "King";
	}

	 
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

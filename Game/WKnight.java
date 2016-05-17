package Game;
import java.util.ArrayList;


import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


public class WKnight extends Actor{


	
	
	
	
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
		ArrayList<Location> ans =new ArrayList<Location>();
		
		temp.add(new Location(getLocation().getRow()+2,getLocation().getCol()+1));
		temp.add(new Location(getLocation().getRow()+1,getLocation().getCol()+2));
		temp.add(new Location(getLocation().getRow()+2,getLocation().getCol()-1));
		temp.add(new Location(getLocation().getRow()+1,getLocation().getCol()-2));
		temp.add(new Location(getLocation().getRow()-2,getLocation().getCol()-1));
		temp.add(new Location(getLocation().getRow()-1,getLocation().getCol()-2));
		temp.add(new Location(getLocation().getRow()-2,getLocation().getCol()+1));
		temp.add(new Location(getLocation().getRow()-1,getLocation().getCol()+2));
		
		for(int i=0;i<temp.size();i++)
		{
		if(getGrid().isValid(temp.get(i)) && !(getGrid().getOccupiedLocations().contains(temp.get(i)) && (getGrid().get(temp.get(i)).getC()== getC())))
			ans.add(temp.get(i));
		
		}
		
		return ans;
		
	}
	
	
	
	public String toString()
	{
		return "WKnight";
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


	}


}
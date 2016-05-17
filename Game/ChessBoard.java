package Game;


//Git test



import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import Game.Rook;



public class ChessBoard extends ActorWorld{

	
	private Location l;
	private boolean select, player1, turn,check;
	private Actor choice,p;
	
	
	public ChessBoard(Grid<Actor> grid)
	{
		super(grid);
		select = false;
		player1 = true;
		turn = true;
		choice = null;
		check = false;
		 setMessage("White's turn!");
	}
	  public boolean locationClicked(Location loc)
	   {
	     
	      Grid<Actor> g = getGrid();
	      
	      //g.put(loc, new Rook());	      
	      
	      if(select == true)
	      {
	    	  //System.out.println("ta");
	    	  if(choice.getmoveLocations().contains(loc))
	    	  {
	    		  //g.put(loc,g.get(new Location(l.getRow(),l.getCol())));
	    		  p = getGrid().get(loc);
	    		 choice.moveTo(loc);
	    		 
	    		
	    		 for(int i = 0; i<choice.getmoveLocations().size()-1;i++)
	    		 {
	    			 
	    			 Actor a = ((choice.getGrid().get(choice.getmoveLocations().get(i))));
	    			 if(a != null && a.isKing() == true  &&  a.getC()!=choice.getC())
	    			 {
	    				 setMessage("Check!");
	    				 check = true;
	    			 }
	    		 }
	    		 
	    		// for(int i = 0; i<choice.getmoveLocations().size(); i++)
	    		// {
	    		//	 Location x = choice.getmoveLocations().get(i);
	    		//	 if(choice.getGrid().get(x).getC() != choice.getC() && (getGrid().get(x).toString().equals("WQueen") || getGrid().get(x).toString().equals("WQueen")))
	    		//	 {
	    		//		 setMessage("Check!");
	    		//	 }
	    			 
	    		// }
	    		 
	    		 if(player1)
		    	  {
		    		  player1 = false;
		    		  setMessage("Blue's turn!");
		    		  if(check)
		    		  {
		    			  setMessage("Check!");
		    			  check = false;
		    		  }
		    	  }
		    	  
		    	  else if(!player1)
		    	  {
		    		  player1 = true;
		    		  setMessage("White's turn!");
		    		  if(check)
		    		  {
		    			  setMessage("Check!");
		    			  check = false;
		    		  }
		    	  }
		    	  
		    	  select = false;
	    	  }
	    	  
	    	  else{
	    		  
	    	  }
	      }
	          
	      else if(select == false)
	      {
	     
	     if(g.get(loc)== null)
	     {
	    	 //System.out.println("fa");
	     }
	    	 
	     else if(g.isValid(loc))
	      {  //System.out.println("sa");
	    	 choice = g.get(loc);
	    	  if(player1 == true && choice.getC() == false)
	    	  {
	    		   select = true; 
	    		   l = loc;
	    		   setMessage(g.get(loc).toString()+ " selected. Press SPACE to deselect the piece.");
	    	  }  
	    	  
	    	  else if(player1 == false && choice.getC() == true)
	    	  {
	    		   select = true; 
	    		   l = loc;
	    		   setMessage(g.get(loc).toString()+ " selected. Press SPACE to deselect the piece.");
	    	  }   
	      }
	      }
	     
	      
	      return true;      
	   }
	  
	  
	  public Location getLocationClicked()
	  {
		  return l;
	  }
	  
	  
	  
	  public boolean keyPressed(String description, Location loc)
	   {
	       if (description.equals("SPACE"))
	       {
	    	   if(select)
	    	   {
	    	   select = false;
	    	   setMessage( getGrid().get(loc).toString()+" deselected! Select another piece!");
	    	   }
	    	   else
	    	   {
	    		   
	    	   }
	    	  
	       		return true;
	       }
	       
	       if(description.equals("u"))
	       {
	    	   if(player1)
	    	   {
	    		   choice.moveTo(l);
	    		   select = false;
	    		   player1=false;
	    		   setMessage("Undone!");
	    		   
	    	   }
	    
	    	   else if(!player1)
	    	   {
	    		   choice.moveTo(l);
	    		   select = false;
	    		   player1=true;
	    		   setMessage("Undone!");
	    	   }
	    	   return true;
	       }
	       
	       else
	           return false;
	   }
	
	  
	  
	  

	  
	  
	public static void main(String[] args) {
		//World w = new World(new BoundedGrid(8,8));

        ChessBoard world = new ChessBoard(new BoundedGrid(8,8));
        world.add(new Location(0,0),new Rook());
        world.add(new Location(0,7),new Rook());
        world.add(new Location(7,0),new WRook());
        world.add(new Location(7,7),new WRook());
        
        world.add(new Location(0,2),new Bishop());
        world.add(new Location(0,5),new Bishop());
        world.add(new Location(7,2),new WBishop());
        world.add(new Location(7,5),new WBishop());
    
        world.add(new Location(0,3),new Queen());
        world.add(new Location(7,3),new WQueen());
        
        world.add(new Location(0,4),new King());
        world.add(new Location(7,4),new WKing());
        
        world.add(new Location(0,1),new Knight());
        world.add(new Location(0,6),new Knight());
        
        world.add(new Location(7,1),new WKnight());
        world.add(new Location(7,6),new WKnight());
        
        for(int i = 0; i<=7;i++)
        {
        world.add(new Location(1,i),new Pawn());
        }
        
        for(int i = 0; i<=7;i++)
        {
        world.add(new Location(6,i),new WPawn());
        }

        
        
        
        
        world.show();
        
        for(int i = 0; i<= -1;i++)
        {
        	
        }
		

		

	}

}

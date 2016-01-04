package players;

public abstract class  Player {
	
	private int id;
	private String name;
	
	private boolean isCap;
	private boolean isInjured;
	private boolean isSuspended;
	private int points;
	
	private static int counter = 0;
	
	public Player(String name)
	{
		id = counter++;
		this.name = name;
		points = 0;
	}
	
	
	public void pointsIncrease(int p)
	{
		if(isCap) p *= 2;
		
		points += p;
	}
	
	public void pointsDecrease(int p)
	{
		points -= p;
	}

}

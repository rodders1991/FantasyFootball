package computer;

public abstract class  Player {
	
	private int id;
	private String name;
	
	private boolean isCap;
	private boolean isInjured;
	private boolean isSuspended;
	private int points;
	
	
	
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

/**
 * 
 * @author Nathan Paolella pd 7
 */

public class Counter {
	
	private int ticks;
	
	public Counter() 
	{	
		ticks = 0;
	}
	
	public Counter(int start) 
	{
		ticks = start;
	}

	public void click() 
	{
		ticks++;
	}
}

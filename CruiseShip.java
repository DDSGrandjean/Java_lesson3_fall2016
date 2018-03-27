/**
 * COMI2510 - Advanced Java
 * September 21st, 2016
 * 
 * CruiseShip class creates an object of type CruiseShip which
 * is also an extention of the Ship class.
 * @author Dylan Grandjean
 *
 */
public class CruiseShip extends Ship 
{
	private int maxCapacity;	//Maximum amount of people that can board the ship
	
	/**
	 * CruiseShip constructor.
	 * @param n The ship's name.
	 * @param year_b Year the ship was built in.
	 * @param max Maximum amount of people that can board the ship
	 */
	public CruiseShip(String n, String year, int max)
	{
		super(n, year);
		this.maxCapacity = max;
	}
	/**
	 * The getCapacity() method returns the ship's maximum capacity.
	 * @return Ship's maximum capacity.
	 */
	public int getMaxCapacity() { return this.maxCapacity; }
	/**
	 * The setCapacity() sets tonnage to ton.
	 * @param max Maximum capacity.
	 */
	public void setMaxCapacity(int max) { this.maxCapacity = max; }
	
	/**
	 * Return a formatted String to the user.
	 *@return A formatted String.
	 */
	public String toString()
	{
		return String.format("Name: %s\nMax Capacity: %d\n", 
							 this.getName(), this.maxCapacity);
	}
	/**
	 * Returns a String of the object's current state.
	 * @return Object's state.
	 */
	public String getSaveState()
	{
		return String.format("%s#%s#%s#%d", "CruiseShip", this.getName(), this.getBuiltYear(), this.maxCapacity);
	}
}

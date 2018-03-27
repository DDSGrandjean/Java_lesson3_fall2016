/**
 * COMI2510 - Advanced Java
 * September 21st, 2016
 * 
 * NavalShip class creates an object of type NavalShip which
 * is also an extention of the Ship class.
 * @author Dylan Grandjean
 *
 */
public class NavalShip extends Ship 
{
	private int complement;		//Complement value for NavalShip
	
	/**
	 * NavalShip constructor.
	 * @param n The ship's name.
	 * @param year_b Year the ship was built in.
	 * @param comp Complement value for NavalShip
	 */
	public NavalShip(String n, String year, int comp)
	{
		super(n, year);
		this.complement = comp;
	}	
	
	/**
	 * The getComplement() method returns the ship's complement value.
	 * @return Ship's complement value.
	 */
	public int getComplement() { return this.complement; }
	/**
	 * The setComplement() sets complement to comp.
	 * @param comp Complement value to set.
	 */
	public void setComplement(int comp) { this.complement = comp; }
	
	/**
	 * Return a formatted String to the user.
	 *@return A formatted String.
	 */
	public String toString()
	{
		return String.format("Name: %s\nComplement: %d",
							 this.getName(), this.complement);
	}
	/**
	 * Returns a String of the object's current state.
	 * @return Object's state.
	 */
	public String getSaveState()
	{
		return String.format("%a#%s#%s#%d", "NavalShip", this.getName(), this.getBuiltYear(), this.complement);
	}
}

/**
 * COMI2510 - Advanced Java
 * September 21st, 2016
 * 
 * CargoShip class creates an object of type CargoShip which
 * is also an extention of the Ship class.
 * @author Dylan Grandjean
 *
 */
public class CargoShip extends Ship 
{
	private int tonnage;	//Maximum weight capacity
	
	/**
	 * CargoShip constructor.
	 * @param n The ship's name.
	 * @param year_b Year the ship was built in.
	 * @param ton Maximum weight capacity
	 */
	public CargoShip(String n, String year, int ton)
	{
		super(n, year);
		this.tonnage = ton;
	}
	
	/**
	 * The getTonnage() method returns the ship's maximum weight capacity.
	 * @return Ship's maximum weight capacity.
	 */
	public int getTonnage() { return this.tonnage; }
	/**
	 * The setComplement() sets tonnage to ton.
	 * @param ton Maximum weight capacity.
	 */
	public void setTonnage(int ton) { this.tonnage = ton; }
	
	/**
	 * Return a formatted String to the user.
	 *@return A formatted String.
	 */
	public String toString()
	{
		return String.format("Name %s\nMax Cargo Capacity: %d\n",
					         this.getName(), this.tonnage);
	}
	/**
	 * Returns a String of the object's current state.
	 * @return Object's state.
	 */
	public String getSaveState()
	{
		return String.format("%s#%s#%s%d", "NavalShip", this.getName(), this.getBuiltYear(), this.tonnage);
	}
}

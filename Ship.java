/**
 * COMI2510 - Advanced Java
 * September 21st, 2016
 * 
 * Ship class creates an object of type Ship which
 * could also extend to CruiseShip, CargoShip, or NavalShip
 * through polymorphism.
 * @author Dylan Grandjean
 *
 */
public class Ship implements Saveable
{
	private String name;	//Name of the ship
	private String year;	//Year the ship was built in
	
	/**
	 * Ship constructor.
	 * @param n The ship's name.
	 * @param year_b Year the ship was built in.
	 */
	public Ship(String n, String year_b)
	{
		this.name = n;
		this.year = year_b;
	}
	
	/**
	 * The getName() method returns the ship's name.
	 * @return Name of the ship.
	 */
	public String getName() { return name; }
	/**
	 * the getBuiltYear return the year theship was built in.
	 * @return Year the ship was built in.
	 */
	public String getBuiltYear() { return year; }
	
	/**
	 * The setName() sets variable name to n.
	 * @param n Name of the ship.
	 */
	public void setName(String n) { this.name = n; }
	/**
	 * The setBuiltYear sets the year to year_b.
	 * @param year_b Year the ship was built in.
	 */
	public void setBuiltYear(String year_b) { this.year = year_b; }
	
	/**
	 * Return a formatted String to the user.
	 *@return A formatted String.
	 */
	public String toString()
	{
		return String.format("Name: %s\nYear: %s\n",
							 this.name, this.year);
	}
	/**
	 * Returns a String of the object's current state.
	 * @return Object's state.
	 */
	public String getSaveState()
	{
		return String.format("%s#%s#%s", "Ship", name, year);
	}
}


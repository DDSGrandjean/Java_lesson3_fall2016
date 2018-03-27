/**
 * COMI2510 - Advanced Java
 * September 21st, 2016
 * 
 * This interface allows class which implement it to
 * get a variable of type String which contains the current
 * state of the object calling the method..
 * @author Dylan Grandjean
 *
 */
public interface Saveable 
{
	/**
	 * Create a String of current object's state.
	 * @return Object's state.
	 */
	String getSaveState();
}

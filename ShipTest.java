/**
 * COMI2510 - Advance Java Programming
 * September 21st, 2016
 * 
 * This program is testing our ship classes.
 * @author Dylan Grandjean
 *
*/
import java.util.Random;
import javax.swing.JOptionPane;

public class ShipTest
{
	public static void main(String[] args)
	{
		Ship[] ships = new Ship[3];			//Array of ships to be populated by user
		Random randomNum = new Random();	//Random number generator
		
		//Prompt user for information in order to create our ship classes
		for(int i = 0; i < ships.length; i++)
		{
			int num = randomNum.nextInt(3);
			switch(num)
			{
				case 0:
					ships[i] = createShip(); break;
				case 1:
					ships[i] = createCruiseShip(); break;
				case 2:
					ships[i] = createCargoShip(); break;
				case 3:
					ships[i] = createNavalShip(); break;
			}
		}
		
		//Display ship classes to screen
		for(int i = 0; i < ships.length; i++)
		{
			System.out.println(ships[i].getSaveState());
			System.out.println(ships[i]);
		}
	}
	
	/**
	 * The createShip() method takes in input from the user and creates a Ship class
	 * to store in the array.
	 * @return A Ship class with values entered by the user.
	 */
	public static Ship createShip()
	{
		Ship ship;
		String name = JOptionPane.showInputDialog("What is the ship's name? ");
		String year = JOptionPane.showInputDialog("In what year was the ship built? ");
		ship = new Ship(name, year);
		return ship;
	}
	/**
	 * The createCruiseShip() method takes in input from the user and creates a Ship class
	 * to store in the array.
	 * @return A CruiseShip class with values entered by the user.
	 */
	public static Ship createCruiseShip()
	{
		Ship ship;
		String name = JOptionPane.showInputDialog("What is the cruise ship's name? ");
		String year = JOptionPane.showInputDialog("In what year was the cruise ship built? ");
		int capacity = Integer.parseInt(JOptionPane.showInputDialog("What is the maximum capacity of the cruise ship? "));
		ship = new CruiseShip(name, year, capacity);
		return ship;
	}
	/**
	 * The createCargoShip() method takes in input from the user and creates a Ship class
	 * to store in the array.
	 * @return A CargoShip class with values entered by the user.
	 */
	public static Ship createCargoShip()
	{
		Ship ship;
		String name = JOptionPane.showInputDialog("What is the cargo ship's name? ");
		String year = JOptionPane.showInputDialog("In what year was the cargo ship built? ");
		int ton = Integer.parseInt(JOptionPane.showInputDialog("What is the tonnage of the cargo ship? "));
		ship = new CargoShip(name, year, ton);
		return ship;
	}
	/**
	 * The createNavalShip() method takes in input from the user and creates a Ship class
	 * to store in the array.
	 * @return A NavalShip class with values entered by the user.
	 */
	public static Ship createNavalShip()
	{
		Ship ship;
		String name = JOptionPane.showInputDialog("What is the naval ship's name? ");
		String year = JOptionPane.showInputDialog("In what year was the naval ship built? ");
		int comp = Integer.parseInt(JOptionPane.showInputDialog("What is the complement of the naval ship? "));
		ship = new NavalShip(name, year, comp);
		return ship;
	}
}

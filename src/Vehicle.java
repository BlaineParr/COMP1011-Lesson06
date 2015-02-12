/**
 * This abstract class is the base for creating vehicles.
 * 
 * @author Blaine Parr
 * @version February 12, 2015
 */
public abstract class Vehicle 
{
	//Instance Variables//////////////////////////////////////////////////////////////////////////
	private int _tireCount;
	private int _passengerCount;
	
	//Getters/Setters//////////////////////////////////////////////////////////////////////////////
	public int getTireCount() 
	{
		return _tireCount;
	} //method getTireCount

	public void setTireCount(int _tireCount)
	{
		this._tireCount = _tireCount;
	} //method setTireCount ends
	
	public int getPassengerCount() 
	{
		return _passengerCount;
	} // method getPassengerCount ends

	public void setPassengerCount(int _passengerCount) 
	{
		this._passengerCount = _passengerCount;
	} //method setPassengerCount ends

	//Constructor/////////////////////////////////////////////////////////////////////////////////
	public void Vehicle()
	{
		
	} //constructor ends

	//Override Methods////////////////////////////////////////////////////////////////////////////
	@Override
	public String toString()
	{
		return "The vehicle has " + getTireCount() + " tires.";
	} //method toString ends
	
} //class Vehicle ends
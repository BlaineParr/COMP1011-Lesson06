
public class Car extends Vehicle implements iHaveStorage, iUseRoads
{
	//Instance Variables//////////////////////////////////////////////////////////////////////////
	private Boolean _trunk;

	public Car(Boolean trunk) 
	{
		this._trunk = trunk;
	} //constructor ends

	//Override Methods////////////////////////////////////////////////////////////////////////////
	@Override
	public Boolean useRoads() 
	{
		return (this.getTireCount() > 0)? true : false;
	} //method useRoads ends

	@Override
	public Boolean haveStorage() 
	{
		return(this._trunk)? true : false;
	} //method haveStorage ends
} //class Car ends

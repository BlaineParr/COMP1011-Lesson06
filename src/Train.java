
public class Train extends Vehicle implements iHaveStorage, iUseRails 
{
	//Instance Variables//////////////////////////////////////////////////////////////////////////
	private Boolean _storageCompartment;
	
	//Constructor/////////////////////////////////////////////////////////////////////////////////
	public Train(Boolean storage) 
	{
		this._storageCompartment = storage;
	} //constructor ends

	//Override Methods////////////////////////////////////////////////////////////////////////////
	@Override
	public Boolean useRails() 
	{
		return (getPassengerCount() > 10)? true : false;
	} //method useRails ends

	@Override
	public Boolean haveStorage() 
	{
		return (this._storageCompartment)? true : false;
	} //method haveStorage ends

} //class Train ends

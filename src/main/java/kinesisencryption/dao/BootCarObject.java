package kinesisencryption.dao;



public class BootCarObject 
{
	private String name;
	private String year;
	private String odometer;


	

	public BootCarObject(String name, String year, String odometer) 
	{
		super();
		this.name = name;
		this.year = year;
		this.odometer = odometer;
	}
	@Override
	public String toString() 
	{
		return  name + "," + year + "," + odometer;
	}
	



}

package oop;

public class Insan implements Yetenek
{
	private	String gozRengi = "siyah";
	private	int boy = 100;
			
	public Insan()
	{
		
	}

	public Insan(int boy)
	{
		this.boy = boy;
	}
	
	public Insan(String a)
	{
		this.gozRengi = a;
	}
	
	public int getBoy()
	{
		return this.boy;
	}
	
	public void setBoy(int boy)
	{
		this.boy = boy;
	}

	@Override
	public void gor() 
	{
		System.out.print("göz açýldý");	
	}

	@Override
	public void duy() 
	{
		
	}

	
}
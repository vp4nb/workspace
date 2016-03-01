package class6;

import java.util.Scanner;

public class ArrayOfClasses {

	private int id;
	private String name;
	private double fee;
	private char section;
	private String[] address;
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setFee(double fee)
	{
		this.fee=fee;
	}
	public void setSection(char section)
	{
		this.section=section;
	}
	public void setAddress(int i)
	{
		address=new String[i];
	}
	public void setAddress(int i,String str)
	{
		address[i]=str;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getFee()
	{
		return fee;
	}
	public char getSection()
	{
		return section;
	}
	public String[] getAddress()
	{
		return address;
	}
	
	
	
}

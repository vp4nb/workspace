package Practice;

public class VoterAgeCheck extends Exception{
String msg;
	public VoterAgeCheck()
	{
		super();
	}
	public VoterAgeCheck(String msg)
	{
		super(msg);
		this.msg=msg;
	}
	public String toString()
	{
		if(msg==null)
		{
			return "invalid age";
		}
		else
		{
			return "invalid age"+msg;
		}
	}
}

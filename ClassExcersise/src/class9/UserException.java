package class9;

public class UserException extends RuntimeException{
	String num;
	UserException()
	{
		super();
	}
	UserException(String message)
	{
		super(message);
		num=message;
	}
	public String toString()
	{
		if(num!=null)
		{
			return "invalid card number"+num+"card number must be 16 digit";
		}
		else
		{
			return "card number should not be empty";
		}
	}
	
}

package assignment.afterclass4;

public class Station5 extends EndingDepo{

	public static void main(String[] args) {
		Station5 st5=new Station5();
		String str1="kansas",str2="virginia";
		st5.routeMap(str2, str1);
		String str3=st5.busType();
		int capacity=st5.busCapacity(str3);
		if(st5.isFull(capacity,25,0,str3))
		{
			System.out.println("the bus is full here");
		}
		else
		{
			System.out.println("the bus is not full here");
		}
		if(st5.isBusSentToClean())
		{
			System.out.println("the bus is sent clean here");
		}
		else
		{
			System.out.println("the bus is not sent clean here");
		}
		// TODO Auto-generated method stub
		

	}

	@Override
	public boolean isFull(int capacity, int board, int depart, String type) {
		// TODO Auto-generated method stub
		int c=busCapacity(type);
		if((capacity-board+depart)>=c)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean isBusSentToClean() {
		// TODO Auto-generated method stub
		return false;
	}

}

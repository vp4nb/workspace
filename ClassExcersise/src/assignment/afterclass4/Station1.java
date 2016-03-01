package assignment.afterclass4;

public class Station1 extends StartingDepo{

	public static void main(String[] args) {
		
		Station1 st1=new Station1();
		String str1="kansas",str2="virginia";
		st1.routeMap(str1, str2);
		String str3=st1.busType();
		int capacity=st1.busCapacity(str3);
		if(st1.isFull(capacity,25,0,str3))
		{
			System.out.println("the bus is full here");
		}
		else
		{
			System.out.println("the bus is not full here");
		}
		if(st1.isClean(str3))
		{
			System.out.println("the bus is clean here");
		}
		else
		{
			System.out.println("the bus is not clean here");
		}

		// TODO Auto-generated method stub

	}

	@Override
	public boolean isFull(int capacity,int board,int depart,String type) {
		int c=busCapacity(type);
		if((capacity-board+depart)>=c)
		{
			return true;
		}
		else
		{
			return false;
		}
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isClean(String str) {
		// TODO Auto-generated method stub
		if(str=="General")
		{
			return true;
		}
		else
		{
		return false;
		}
	}

}

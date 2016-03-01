package class11;

enum week{
	SUNDAY(1,"holiday"), MONDAY(2,"workday"), TUESDAY(3,"workday"), WEDNESDAY(4,"boring day"), THRUSDAY(5,"lazy day"), FRIDAY(6,"pub day"), SATURDAY(7,"fun day");
	int day;
	String name;
	week(int n,String type)
	{
		day=n;
		name=type;
	}
	week(int n)
	{
		day=n;
	}
	public int getDay()
	{
		return day;
	}
}


public class EnumExample {
		
	public static void main(String[] args) {
	
		week[] weekDay=week.values();
		for(int i=0;i<weekDay.length;i++)
		{
			System.out.println(weekDay[i].getDay());
		}
	}
}

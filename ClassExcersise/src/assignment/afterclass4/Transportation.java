package assignment.afterclass4;

public interface Transportation {
	final static int villegeCount=5;
	public void routeMap(String str1,String str2);
	public String busType();
	public int busCapacity(String str);
	public boolean isFull(int capacity,int board,int depart,String type);
}

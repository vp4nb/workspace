package Class3;

public class Scoper {
	
		public int a=10;
		private int b=20;
		protected int c=30;
		int d=40;
		public void display()
		{
			System.out.println("values display inside the class: "+a+ " "+b+" "+c+" "+d);
		}
		private void display1()
		{
			System.out.println("values display1 inside the class: "+a+ " "+b+" "+c+" "+d);
		}
		protected void display2()
		{
			System.out.println("values display2 inside the class: "+a+ " "+b+" "+c+" "+d);
		}
		void display3()
		{
			System.out.println("values display3 inside the class: "+a+ " "+b+" "+c+" "+d);
		}
	
}

package assignment.afterclass12;

import java.util.ArrayList;
import java.util.Scanner;

import class12.WebSite;

public class WebSiteArrayList {

	public static void main(String[] args) {
		
		ArrayList<WebSite> al=new ArrayList<>();
		System.out.println("enter number of objects want to enter: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		WebSite ws;
		for(int i=0;i<n;i++)
		{
			ws=new WebSite();
			System.out.println("enter rank");
			ws.setRank(in.nextInt());
			System.out.println("enter name");
			ws.setName(in.next());
			System.out.println("enter purpose");
			ws.setPurpose(in.next());
			al.add(ws);
		}
		System.out.println("website objects:");
		for(WebSite w:al)
		{
			System.out.println("rank: "+w.getRank()+" name: "+w.getName()+" purpose: "+w.getPurpose());
		}
		// TODO Auto-generated method stub

	}

}

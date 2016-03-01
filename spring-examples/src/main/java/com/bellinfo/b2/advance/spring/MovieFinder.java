package com.bellinfo.b2.advance.spring;

import java.util.ArrayList;

public class MovieFinder {

	private static ArrayList<String> comedyMovies=new ArrayList<String>();
	private static ArrayList<String> actionMovies=new ArrayList<String>();
	private static ArrayList<String> thrillerMovies=new ArrayList<String>();
	
	MovieFinder()
	{
		loadMovies();
	}
	public ArrayList<String> moviesByGenre(String userPreference)
	{
		if(userPreference.equalsIgnoreCase("thriller")){
			return thrillerMovies;
		}
		else if(userPreference.equalsIgnoreCase("comedy"))
		{
			return comedyMovies;
		}
		else if(userPreference.equalsIgnoreCase("action"))
		{
			return actionMovies;
		}
		return null;
	}
	private void loadMovies()
	{
		comedyMovies.add("American pie");
		comedyMovies.add("fly paper");
		
		actionMovies.add("gladiator");
		actionMovies.add("taken");
		
		thrillerMovies.add("prision break");
		thrillerMovies.add("breaking bad");
	}
}

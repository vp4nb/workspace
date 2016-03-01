package com.bellinfo.b2.advance.spring;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

   public static void main( String[] args )
    {
      //  SimpleMovieFinder smf = new SimpleMovieFinder();
        
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
    	SimpleMovieFinder smf = ctx.getBean("simpleMovieFinder", SimpleMovieFinder.class);
    	ArrayList<String> avaliableList = smf.movieList("thriller");
        if(avaliableList!=null){
        for(String movie:avaliableList){
        	System.out.println(movie);
        }
        } else{
        	System.out.println("No movie avaliable");
        }
        
       LaptopDetails id =  ctx.getBean("lapDetails", LaptopDetails.class);
       System.out.println(id.getLaptopDetails());
    	
    }
		
}

package com.vk.control;

import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vk.model.RegisterModel;
import com.vk.service.SelectTypeService;

public class SelectTypeControl extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		
	   String targetId = request.getParameter("id");
	   ArrayList<RegisterModel> al=new SelectTypeService().getDetails(targetId);
	   //request.setAttribute("resultlist", al);
	   response.setContentType("text/xml");
	   for(RegisterModel rm:al)
	   {
		   response.getWriter().write(rm.getName()+" "+rm.getEmail()+" "+rm.getJob()+" "+rm.getPosition());
		   System.out.println(rm.getName());
	   }
	  
	   
	}
}

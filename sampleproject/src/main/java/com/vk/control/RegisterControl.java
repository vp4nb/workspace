package com.vk.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vk.model.RegisterModel;
import com.vk.repository.DBConnection;
import com.vk.service.RegisterService;

public class RegisterControl extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
		    {
		    	String name=req.getParameter("fullname");
		    	String email=req.getParameter("email");
		    	String job=req.getParameter("job");
		    	String position=req.getParameter("position");
		    	RegisterModel rm=new RegisterModel();
		    	rm.setName(name);
		    	rm.setEmail(email);
		    	rm.setJob(job);
		    	rm.setPosition(position);
		    	RegisterService rs=new RegisterService(rm);
		    	int result=rs.saveDetails();
		    	if(result==1)
		    	{
		    		req.setAttribute("valid", "success");
		    	}
		    	else if(result==0)
		    	{
		    		req.setAttribute("valid", "not insert");
		    	}
		    	else
		    	{
		    		req.setAttribute("valid", "duplicate");
		    	}
		    	req.getRequestDispatcher("register.jsp").forward(req, resp);
		    }
}

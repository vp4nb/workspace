package com.vk.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vk.model.RegisterModel;
import com.vk.service.SelectTypeService;
import com.vk.service.UniqueValueService;

public class UniqueValueControl extends HttpServlet{
	private ArrayList<RegisterModel> al;
	public void setAl(ArrayList<RegisterModel> al) {
		this.al = al;
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		String name=request.getParameter("job");
		al=new UniqueValueService().getDetails(name);
		HelpList hl=new HelpList();
		hl.setModelList(al);
		request.setAttribute("login1", hl);
		request.getRequestDispatcher("UniqueValues.jsp").forward(request, response);
	}
	public ArrayList<RegisterModel> getAl() {
		return al;
	}
}

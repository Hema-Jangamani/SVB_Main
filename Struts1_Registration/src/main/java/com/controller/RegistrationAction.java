package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.DaoService;
import com.formbeans.Employee;

public class RegistrationAction extends Action{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		Employee e=(Employee)form;
		DaoService daoService=new DaoService("employee", "root", "root");
//		DaoService daoService =new DaoService();
//		daoService.addEmployee(e);
//		daoService.display();
		HashMap<String, String> map= new HashMap<>();
		map.put("firstName", e.getFirstName());
		map.put("lastName", e.getLastName());
		map.put("email", e.getEmail());
		String phoneNumber=Integer.toString((int) e.getPhone());
		map.put("phone",phoneNumber);
		map.put("password", e.getPassword());
		
		daoService.insertIntoDb("employee_details", map);
		
		e.reset(mapping, request);
		return mapping.findForward("success");
	}
}

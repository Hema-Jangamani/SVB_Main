package com.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.dao.DaoService;
import com.formbeans.LoginForm;

public class LoginAction extends DispatchAction {
	
	public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		DaoService daoService= new DaoService();
		LoginForm loginDetails=(LoginForm)form;
//		boolean result= daoService.validateEmployee(loginDetails.getEmail(), loginDetails.getPassword());
		DaoService daoService=new DaoService("employee", "root", "root");
		List<List<String>> details= daoService.get("employee_details");
		Iterator<List<String>> it = details.iterator();
		String userName="";
		boolean result=false;
		while (it.hasNext()) {
			List<String> res=it.next();
			
			System.out.println(res.get(2)); 
			System.out.println(res.get(4)); 
			
			if (loginDetails.getEmail().equals(res.get(2)) && loginDetails.getPassword().equals(res.get(4))) {
				userName=res.get(0);
				result=true;
			}
		}
		HttpSession ses=request.getSession();
		ses.setAttribute("email",userName );
		form.reset(mapping, request);
		if(result)
		{
			
			return mapping.findForward("success");
			
		}
		else
			return mapping.findForward("failure");
	}
	
	public ActionForward forgotPassword(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		form.reset(mapping, request);
		return mapping.findForward("forgot");
	}
	
	public ActionForward register(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		form.reset(mapping, request);
		return mapping.findForward("register");
	}
}


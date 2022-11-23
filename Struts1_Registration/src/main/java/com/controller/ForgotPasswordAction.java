package com.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dao.DaoService;
import com.formbeans.ForgotPassword;

public class ForgotPasswordAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ForgotPassword bean=(ForgotPassword) form;
		DaoService daoService=new DaoService("employee", "root", "root");
		daoService.updateIntoDB("employee_details",bean.getNewPassword(),bean.getEmail());
		
		return mapping.findForward("success");
	}

}

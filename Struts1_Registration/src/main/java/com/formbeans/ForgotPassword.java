package com.formbeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ForgotPassword extends ActionForm{
	
	private String email;
	private String newPassword;
	private String confirmPassword;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors errors=new ActionErrors();
		if(email.equals(""))
			errors.add("email_e",new ActionMessage("email_error"));
		if(newPassword.equals(""))
			errors.add("newPassword_e",new ActionMessage("newPassword_error"));
		if(confirmPassword.equals(""))
			errors.add("confirmPassword_e",new ActionMessage("confirmPassword_error"));
		if(!confirmPassword.equals(newPassword))
			errors.add("missmatch_e",new ActionMessage("missmatch_error"));
		
		return errors;
	}
	
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.reset(mapping, request);
		email="";
		newPassword="";
		confirmPassword="";
	}
	
	
	

}

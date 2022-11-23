package com.formbeans;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Employee extends ActionForm{
	 private String firstName;
	 private String lastName;
	 private String email;
	 private long phone;
	 private String password;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors errors=new ActionErrors();
		if(firstName.equals(""))
			errors.add("firstName_e",new ActionMessage("firstname_error"));
		if(lastName.equals(""))
			errors.add("lastName_e",new ActionMessage("lastname_error"));
		if(email.equals("") || phone==0) {
			if(email.equals("") && phone==0)
				errors.add("emailPhone_e",new ActionMessage("emailPhone_error"));
//			else {
//				if(email.equals("")  )
//					errors.add("email_e",new ActionMessage("email_error"));
//				else if(phone==0  )
//					errors.add("phone_e",new ActionMessage("phone_error"));
//			}
			
		}
		if(password.equals(""))
			errors.add("password_e",new ActionMessage("password_error"));
		return errors;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		super.reset(mapping, request);
		firstName="";
		lastName="";
		email="";
		phone=0;
		password="";
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}
	
	
}

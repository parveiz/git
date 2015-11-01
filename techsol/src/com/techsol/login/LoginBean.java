package com.techsol.login;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty("#{userEntity}")
	private UserEntity user;
	@Inject
	private UserEntityFacade userFacade;
	
	private String errorMessage;

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String Login() {
		UserEntity savedUser = userFacade.login(user.getUsername(),
				user.getPassword());
		if (savedUser != null) {
			createSession(savedUser);
			user=savedUser;
			return "LoginSuccessful";
		} else {
			errorMessage = "InvalidLogin";
		}
		return "Error";
	}

	private void createSession(UserEntity user) {

		HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
				.getExternalContext().getSession(true);
		session.setAttribute("user", user);
	}

	public String Logout() {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		this.user=null;
		this.errorMessage = "";
		return "logout";
	}
	
	public UserEntityFacade getUserFacade() {
		return userFacade;
	}

	public void setUserFacade(UserEntityFacade userFacade) {
		this.userFacade = userFacade;
	}


}

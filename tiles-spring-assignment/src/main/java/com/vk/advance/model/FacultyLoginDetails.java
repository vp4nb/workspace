package com.vk.advance.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;
@Component
public class FacultyLoginDetails {
	@NotBlank
	@Size(min=6,max=20)
	private String userName;
	@NotBlank
	@Size(min=6, max=20)
	private String passWord;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "StudentLoginDetails [userName=" + userName + ", passWord=" + passWord + "]";
	}
	

}

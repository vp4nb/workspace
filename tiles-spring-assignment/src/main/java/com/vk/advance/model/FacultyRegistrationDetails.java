package com.vk.advance.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Component
public class FacultyRegistrationDetails {
	
	@NotBlank
	@Size(min=6,max=20)
	private String userName;
	@NotNull
	@Min(111)
	private int id;
	@NotBlank
	@Size(min=2)
	private String fullName;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	@Size(min=10)
	private String phone;
	@NotBlank
	@Size(min=6,max=20)
	private String passWord;
	@NotBlank
	@Size(min=6,max=20)
	private String reTypePassWord;
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getReTypePassWord() {
		return reTypePassWord;
	}
	public void setReTypePassWord(String reTypePassWord) {
		this.reTypePassWord = reTypePassWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "StudentRegistrationDetails [userName=" + userName + ", id=" + id
				+ ", fullName=" + fullName + ", email=" + email + ", phone=" + phone + "]";
	}
	

}

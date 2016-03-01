package com.bellinfo.faculty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class FacultyRegister {

	@NotEmpty
	@Size(min=2, max=10)
	private String name;
	@Email
	@NotBlank
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FacultyRegister [name=" + name + ", email=" + email + "]";
	}

	
	
}

package com.exemple.helpdesk.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.exemple.helpdesk.enums.ProfileEnum;

@Document
public class User {
	@Id
	private String id;
	
	@Indexed(unique=true)
	@NotBlank(message="Usuario precisa ter email")
	@Email(message="Email esta invalido")
	private String email;
	
	@NotBlank(message="Coloque seu password")
	private String password;
	
	private ProfileEnum profile;
	
	public ProfileEnum getProfile() {
		return profile;
	}
	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}

package com.reilem.management.common.classes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.reilem.management.common.enums.E_AccountType;
import com.reilem.management.common.enums.E_Gender;

@Entity
@Table(name = "T_Users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 	
	@Column(name = "userId")
	private int userId;
	
	private String username;
	private String email;
	private Date birthDate;
	private Date creationDate;
	private E_Gender gender;
	private E_AccountType accountType;
	private String userInfo;

	public User() {
		
	}
	
	public User( String username, String email) {
		this.username = username;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int id) {
		this.userId = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public E_Gender getGender() {
		return gender;
	}

	public void setGender(E_Gender gender) {
		this.gender = gender;
	}

	public E_AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(E_AccountType accountType) {
		this.accountType = accountType;
	}
	
	public String getuserInfo() {
		return userInfo;
	}

	public void setuserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
}
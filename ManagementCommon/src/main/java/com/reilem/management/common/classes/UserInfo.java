package com.reilem.management.common.classes;

import com.google.gson.Gson;

public class UserInfo {

	private String country;
	private String city;
	
	public UserInfo(String userInfoJson) {
		new Gson().fromJson(userInfoJson, UserInfo.class);
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toJson() {
		return new Gson().toJson(this);
	}
}

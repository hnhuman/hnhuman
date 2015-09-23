package com.hnhuman.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity(name="hnhuman")
@SequenceGenerator(name = "sequenceGenerator", sequenceName = "hnhuman_sequence")
public class Human extends BaseEntity{

	@Column
	private String name;
	
	@Column
	private String mobile;
	
	@Column
	private String email;
	
	@Column
	private String avatar;

	@Column
	private Gender gender;
	
	public enum Gender {
		MAN,
		WOMAN
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

}

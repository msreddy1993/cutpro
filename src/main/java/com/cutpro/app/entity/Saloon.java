package com.cutpro.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.cutpro.app.constatnts.GenderType;

@Entity
public class Saloon {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="area_lat")
	private double areaLattitude;
	@Column(name="area_lng")
	private double areaLongtitude;
	@Column(name="state")
	private String state;
	@Column(name="city")
	private String city;
	@Column(name="area")
	private String area;
	@Column(name="zipcode")
	private String zipcode;
	@Column(name="pics")
	private String pictures;
	@Column(name="user_pics")
	private String userPictures;
	@Column(name="phone")
	private String phone;
	@Column(name="discount")
	private int discount;
	private GenderType genderType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}


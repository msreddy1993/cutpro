package com.cutpro.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.cutpro.app.constatnts.ServiceType;

@Entity
public class Service {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="saloon_id")
	private int saloonId;
	@Column(name="name")
	private String name;
	@Column(name="amount")
	private double amount;
	@Column(name="pic")
	private String pictures;
	@Column(name="discount")
	private int discount;
	private ServiceType serviceType;
}

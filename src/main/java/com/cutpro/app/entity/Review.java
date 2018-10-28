package com.cutpro.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="comment")
	private String comment;
	@Column(name="saloon_id")
	private int saloonId;
	@Column(name="rating")
	private int rating;
}

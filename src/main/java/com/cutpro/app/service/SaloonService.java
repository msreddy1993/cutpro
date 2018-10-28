package com.cutpro.app.service;

import java.util.List;


import com.cutpro.app.entity.Saloon;

public interface SaloonService {

	
	 public void createSaloon(Saloon saloon);
	    public List<Saloon> getSaloon();
	    public Saloon findById(int id);
	    public Saloon update(Saloon user, int id);
	    public void deleteUserById(int id);
}

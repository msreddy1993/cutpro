package com.cutpro.app.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cutpro.app.entity.Saloon;
import com.cutpro.app.repository.SaloonRepository;
import com.cutpro.app.service.SaloonService;

@Service
@Transactional
public class SaloonServiceImpl implements SaloonService{

	@Autowired
	private SaloonRepository saloonRepository;
	
	public void createSaloon(Saloon saloon) {
        // TODO Auto-generated method stub
		saloonRepository.save(saloon);
    }
	public List<Saloon> getSaloon() {
        // TODO Auto-generated method stub
        return (List<Saloon>) saloonRepository.findAll();
    }


    public Saloon update(Saloon saloon, int id) {
        // TODO Auto-generated method stub
        return saloonRepository.save(saloon);
    }

    public void deleteUserById(Saloon id) {
        // TODO Auto-generated method stub
    	saloonRepository.delete(id);
    }
	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		saloonRepository.deleteById(id);
		
	}
	@Override
	public Saloon findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}

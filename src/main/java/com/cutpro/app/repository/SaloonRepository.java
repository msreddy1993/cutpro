package com.cutpro.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cutpro.app.entity.Saloon;

@Repository
public interface SaloonRepository extends CrudRepository<Saloon, Integer>{


}

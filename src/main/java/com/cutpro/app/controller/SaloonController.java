package com.cutpro.app.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cutpro.app.entity.Saloon;
import com.cutpro.app.service.SaloonService;

@RestController
@RequestMapping(value="/saloon")
public class SaloonController {

	private SaloonService saloonService;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Saloon> getUserById(@PathVariable("id") int id) {
        System.out.println("Fetching User with id " + id);
        Saloon saloon = saloonService.findById(id);
        if (saloon == null) {
            return new ResponseEntity<Saloon>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Saloon>(saloon, HttpStatus.OK);
    }

    @PostMapping(value="/create",headers="Accept=application/json")
    public ResponseEntity<Void> createUser(@RequestBody Saloon saloon, UriComponentsBuilder ucBuilder){
        //System.out.println("Creating User "+saloon.getName());
        saloonService.createSaloon(saloon);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(saloon.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @GetMapping(value="/get", headers="Accept=application/json")
    public List<Saloon> getAllUser() {
        List<Saloon> tasks=saloonService.getSaloon();
        return tasks;

    }

    @PutMapping(value="/update", headers="Accept=application/json")
    public ResponseEntity<String> updateUser(@RequestBody Saloon currentSaloon)
    {
        System.out.println("sd");
        Saloon saloon = saloonService.findById(currentSaloon.getId());
        if (saloon==null) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        saloonService.update(currentSaloon, currentSaloon.getId());
        return new ResponseEntity<String>(HttpStatus.OK);
    }

    @DeleteMapping(value="/{id}", headers ="Accept=application/json")
    public ResponseEntity<Saloon> deleteUser(@PathVariable("id") int id){
        Saloon saloon = saloonService.findById(id);
        if (saloon == null) {
            return new ResponseEntity<Saloon>(HttpStatus.NOT_FOUND);
        }
        saloonService.deleteUserById(id);
        return new ResponseEntity<Saloon>(HttpStatus.NO_CONTENT);
    }

	
}

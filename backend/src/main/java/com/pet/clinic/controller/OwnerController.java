package com.pet.clinic.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pet.clinic.dto.OwnerDTO;
import com.pet.clinic.entity.Owner;
import com.pet.clinic.service.OwnerService;

import io.micrometer.core.annotation.Timed;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/owners")
@Timed("petclinic.owner")
public class OwnerController {
	
	private static final Logger log = LoggerFactory.getLogger(OwnerController.class);
	
	@Autowired
	private OwnerService ownerService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Owner createOwner(@Valid @RequestBody Owner owner) {
		return ownerService.addOwner(owner);
		
	}
	
	@GetMapping
	public List<Owner> findAll(){
		return ownerService.getAllOwners();
	}
	
	@GetMapping("/{ownerId}")
	public Optional<Owner> findOwnerById(@PathVariable("ownerId") int ownerId){
		return ownerService.getOwnerById(ownerId);
	}
	

}

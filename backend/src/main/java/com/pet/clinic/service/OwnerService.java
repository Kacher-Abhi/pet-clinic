package com.pet.clinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.clinic.dto.OwnerDTO;
import com.pet.clinic.entity.Owner;
import com.pet.clinic.repo.OwnerRepo;

@Service
public class OwnerService {

	@Autowired
	private OwnerRepo ownerRepo;
	
	public Owner addOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	public List<Owner> getAllOwners() {
		// TODO Auto-generated method stub
		return ownerRepo.findAll();
	}

	public Optional<Owner> getOwnerById(int ownerId) {
		// TODO Auto-generated method stub
		return ownerRepo.findById(ownerId);
	}
	
}

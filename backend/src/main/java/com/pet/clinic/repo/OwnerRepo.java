package com.pet.clinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pet.clinic.dto.OwnerDTO;
import com.pet.clinic.entity.Owner;

public interface OwnerRepo extends JpaRepository<Owner, Integer> {

	OwnerDTO save(OwnerDTO ownerDto);
}

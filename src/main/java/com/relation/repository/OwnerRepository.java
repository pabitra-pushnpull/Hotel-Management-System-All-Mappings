package com.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relation.model.OwnerModel;

public interface OwnerRepository extends JpaRepository<OwnerModel, Long>{

}

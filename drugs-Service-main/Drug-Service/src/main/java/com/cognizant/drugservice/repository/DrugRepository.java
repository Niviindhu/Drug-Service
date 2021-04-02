package com.cognizant.drugservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.drugservice.entity.DrugDetails;

@Repository
public interface DrugRepository extends JpaRepository<DrugDetails,Integer>{

   DrugDetails findByName(String name);

}

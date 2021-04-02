package com.cognizant.drugservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.drugservice.entity.DrugStock;

@Repository
public interface DrugStockRepository extends JpaRepository<DrugStock,Integer>{

}

package com.cognizant.drugservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.drugservice.entity.DrugDetails;
import com.cognizant.drugservice.entity.DrugStock;
import com.cognizant.drugservice.repository.DrugRepository;
import com.cognizant.drugservice.repository.DrugStockRepository;

@Service
public class DrugService {
	
	@Autowired
	private DrugRepository repo;
	
	@Autowired 
	private DrugStockRepository stockRepo;
	
	public List<Object> getDrugStock(int id,String location) {
	
		DrugStock stock=stockRepo.findById(id).get();
		if(stock.getLocation().equalsIgnoreCase(location)) {
		return Arrays.asList(repo.findById(id),stock.getQuantity());	
		}
		return null;
	}
	public DrugDetails getDrugsByName(String name) {
		return repo.findByName(name);
	}
	public DrugDetails getDrugsById(int id) {
		return repo.findById(id).get();
	}

	public DrugStock saveDrugStock(DrugStock stock) {
		return stockRepo.save(stock);
	}

	public DrugDetails save(DrugDetails drug) {
		return repo.save(drug);
	}


}

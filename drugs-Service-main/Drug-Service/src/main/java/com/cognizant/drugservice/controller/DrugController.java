package com.cognizant.drugservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.drugservice.entity.DrugDetails;
import com.cognizant.drugservice.entity.DrugStock;
import com.cognizant.drugservice.service.DrugService;

@RestController
public class DrugController {
	
	@Autowired
	private DrugService drugService;
	
	
	@GetMapping("/DrugsByID/{id}")
	public DrugDetails getDrugsById(@PathVariable int id) {
		return drugService.getDrugsById(id);
	}
	@PostMapping("/Drugs")
	public DrugDetails setDrugs(@RequestBody DrugDetails drug) {
		return drugService.save(drug);
	}
	@GetMapping("/DrugsByName/{name}")
	public DrugDetails getDrugsByName(@PathVariable String name) {
		return drugService.getDrugsByName(name);
	}
	@GetMapping("/DrugsStock/{id}/{name}")
	public List<Object> getDrugStock(@PathVariable int id,@PathVariable String name) {
		return drugService.getDrugStock(id, name);
	}
	@PostMapping("/DrugsStock")
	public DrugStock setDrugStock(@RequestBody DrugStock stock) {
		return drugService.saveDrugStock(stock);
	}
	

}

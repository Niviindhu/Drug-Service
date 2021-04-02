package com.cognizant.drugservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DrugStock {
	@Id
	private int id;
	private String location;
	private int quantity;
	//private DrugDetails drug;

}

package com.deyaniragenao.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	private long id;
	private String name;
	private String description;
	private String size;
	private int quantity;
	
	// relationship: Category Type 
	
	
}

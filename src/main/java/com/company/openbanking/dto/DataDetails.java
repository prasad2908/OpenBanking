package com.company.openbanking.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataDetails {
	   @JsonProperty("Brand") 
	    private ArrayList<Brand> brand;

	/**
	 * @return the brand
	 */
	public ArrayList<Brand> getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(ArrayList<Brand> brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "DataDetails [brand=" + brand + "]";
	}
	   
	   

}

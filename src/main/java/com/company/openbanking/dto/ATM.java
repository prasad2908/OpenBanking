package com.company.openbanking.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATM {

	@JsonProperty("Identification") 
    private String identification;
    @JsonProperty("SupportedCurrencies") 
    private ArrayList<String> supportedCurrencies;
    @JsonProperty("Location") 
    private Location location;
	/**
	 * @return the identification
	 */
	public String getIdentification() {
		return identification;
	}
	@Override
	public String toString() {
		return "ATM [identification=" + identification + ", supportedCurrencies=" + supportedCurrencies + ", location="
				+ location + "]";
	}
	/**
	 * @param identification the identification to set
	 */
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	/**
	 * @return the supportedCurrencies
	 */
	public ArrayList<String> getSupportedCurrencies() {
		return supportedCurrencies;
	}
	/**
	 * @param supportedCurrencies the supportedCurrencies to set
	 */
	public void setSupportedCurrencies(ArrayList<String> supportedCurrencies) {
		this.supportedCurrencies = supportedCurrencies;
	}
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}
    
    
}

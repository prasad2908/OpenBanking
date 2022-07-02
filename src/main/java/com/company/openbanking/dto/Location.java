package com.company.openbanking.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	
	@JsonProperty("PostalAddress") 
    private PostalAddress postalAddress;

	/**
	 * @return the postalAddress
	 */
	public PostalAddress getPostalAddress() {
		return postalAddress;
	}

	/**
	 * @param postalAddress the postalAddress to set
	 */
	public void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}

	@Override
	public String toString() {
		return "Location [postalAddress=" + postalAddress + "]";
	}
	
	

}

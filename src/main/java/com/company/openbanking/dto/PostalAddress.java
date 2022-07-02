package com.company.openbanking.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalAddress {

	@JsonProperty("AddressLine")
	private ArrayList<String> addressLine;
	@JsonProperty("StreetName")
	private String streetName;
	@JsonProperty("TownName")
	private String townName;
	@JsonProperty("CountrySubDivision")
	private ArrayList<String> countrySubDivision;
	@JsonProperty("Country")
	private String country;
	@JsonProperty("PostCode")
	private String postCode;
	/**
	 * @return the addressLine
	 */
	public ArrayList<String> getAddressLine() {
		return addressLine;
	}
	/**
	 * @param addressLine the addressLine to set
	 */
	public void setAddressLine(ArrayList<String> addressLine) {
		this.addressLine = addressLine;
	}
	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the townName
	 */
	public String getTownName() {
		return townName;
	}
	/**
	 * @param townName the townName to set
	 */
	public void setTownName(String townName) {
		this.townName = townName;
	}
	/**
	 * @return the countrySubDivision
	 */
	public ArrayList<String> getCountrySubDivision() {
		return countrySubDivision;
	}
	/**
	 * @param countrySubDivision the countrySubDivision to set
	 */
	public void setCountrySubDivision(ArrayList<String> countrySubDivision) {
		this.countrySubDivision = countrySubDivision;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	@Override
	public String toString() {
		return "PostalAddress [addressLine=" + addressLine + ", streetName=" + streetName + ", townName=" + townName
				+ ", countrySubDivision=" + countrySubDivision + ", country=" + country + ", postCode=" + postCode
				+ "]";
	}
	
	
	

}

package com.company.openbanking.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand {

	    @JsonProperty("BrandName") 
	    private String brandName;
	    @JsonProperty("ATM") 
	    private ArrayList<ATM> atm;
		/**
		 * @return the brandName
		 */
		public String getBrandName() {
			return brandName;
		}
		/**
		 * @param brandName the brandName to set
		 */
		public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		/**
		 * @return the atm
		 */
		public ArrayList<ATM> getAtm() {
			return atm;
		}
		/**
		 * @param atm the atm to set
		 */
		public void setAtm(ArrayList<ATM> atm) {
			this.atm = atm;
		}
		@Override
		public String toString() {
			return "Brand [brandName=" + brandName + ", atm=" + atm + "]";
		}
	    
	    
}

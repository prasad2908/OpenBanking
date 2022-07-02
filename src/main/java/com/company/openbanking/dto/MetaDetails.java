package com.company.openbanking.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MetaDetails {

	 	@JsonProperty("LastUpdated") 
	    public Date lastUpdated;
	    @JsonProperty("TotalResults") 
	    public int totalResults;
	    @JsonProperty("Agreement") 
	    public String agreement;
	    @JsonProperty("License") 
	    public String license;
	    @JsonProperty("TermsOfUse") 
	    public String termsOfUse;
		/**
		 * @return the lastUpdated
		 */
		public Date getLastUpdated() {
			return lastUpdated;
		}
		/**
		 * @param lastUpdated the lastUpdated to set
		 */
		public void setLastUpdated(Date lastUpdated) {
			this.lastUpdated = lastUpdated;
		}
		/**
		 * @return the totalResults
		 */
		public int getTotalResults() {
			return totalResults;
		}
		/**
		 * @param totalResults the totalResults to set
		 */
		public void setTotalResults(int totalResults) {
			this.totalResults = totalResults;
		}
		/**
		 * @return the agreement
		 */
		public String getAgreement() {
			return agreement;
		}
		/**
		 * @param agreement the agreement to set
		 */
		public void setAgreement(String agreement) {
			this.agreement = agreement;
		}
		/**
		 * @return the license
		 */
		public String getLicense() {
			return license;
		}
		/**
		 * @param license the license to set
		 */
		public void setLicense(String license) {
			this.license = license;
		}
		/**
		 * @return the termsOfUse
		 */
		public String getTermsOfUse() {
			return termsOfUse;
		}
		/**
		 * @param termsOfUse the termsOfUse to set
		 */
		public void setTermsOfUse(String termsOfUse) {
			this.termsOfUse = termsOfUse;
		}
		@Override
		public String toString() {
			return "MetaDetails [lastUpdated=" + lastUpdated + ", totalResults=" + totalResults + ", agreement="
					+ agreement + ", license=" + license + ", termsOfUse=" + termsOfUse + "]";
		}
	    
	    
}

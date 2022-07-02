package com.company.openbanking.dto;

import java.util.ArrayList;

public class AtmListWrapper {
	private MetaDetails meta;
    private ArrayList<DataDetails> data;
	/**
	 * @return the meta
	 */
	public MetaDetails getMeta() {
		return meta;
	}
	/**
	 * @param meta the meta to set
	 */
	public void setMeta(MetaDetails meta) {
		this.meta = meta;
	}
	/**
	 * @return the data
	 */
	public ArrayList<DataDetails> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(ArrayList<DataDetails> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "AtmListWrapper [meta=" + meta + ", data=" + data + ", getMeta()=" + getMeta() + ", getData()="
				+ getData() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
    
    
    
}

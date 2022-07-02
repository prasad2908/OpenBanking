package com.company.openbanking.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class AtmUtil {
	
	public <V> V responseMapper(String result, Class<V> clazz)
	{
		ObjectMapper oMapper = new ObjectMapper();
		V response = null;
		try {
			response = oMapper.readValue(result, clazz);
		} catch (JsonProcessingException e) {
			return null;
			
		}
		return response;
	}

	
}

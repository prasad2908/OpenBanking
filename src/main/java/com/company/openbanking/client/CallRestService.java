package com.company.openbanking.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.company.openbanking.dto.AtmListWrapper;

@Component
public class CallRestService {
	
	public String restGetCall()
	{
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject("https://api.lloydsbank.com/open-banking/v2.2/atms", String.class);
		
		//AtmListWrapper result = restTemplate.getForObject("https://api.lloydsbank.com/open-banking/v2.2/atms", AtmListWrapper.class);
		System.out.println("Result : "+ result);
		return result;
	}
	
	public String restGetCall(String url)
	{
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		
		
		System.out.println("Result : "+ result);
		return result;
	}

}

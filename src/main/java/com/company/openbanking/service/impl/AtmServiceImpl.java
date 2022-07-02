package com.company.openbanking.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.openbanking.client.CallRestService;
import com.company.openbanking.dto.ATM;
import com.company.openbanking.dto.AtmListWrapper;
import com.company.openbanking.dto.Brand;
import com.company.openbanking.dto.DataDetails;
import com.company.openbanking.service.IAtmService;
import com.company.openbanking.util.AtmUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class AtmServiceImpl implements IAtmService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AtmServiceImpl.class);
	
	@Autowired
	private CallRestService callRestService;
	
	@Autowired
	AtmUtil atmUtil;

	@Override
	public ATM getAtmService(String url, String identification) {
		
		
		String result = callRestService.restGetCall();
		AtmListWrapper atmList = atmUtil.responseMapper(result, AtmListWrapper.class);
		
		List<DataDetails> dataDetails = atmList.getData();
		List<Brand> brandList = dataDetails.get(0).getBrand();
		List<ATM> atmLs = brandList.get(0).getAtm();
		
		Optional<ATM> atmRes = atmLs.stream().filter(atm -> atm.getIdentification().equalsIgnoreCase(identification)).findAny();
	
		LOGGER.info("The ATM Details : " + atmRes);
		
		
		  System.out.println( atmList.getData().stream().map(data ->
		  data.getBrand().stream().map( brand -> brand.getAtm().stream().filter(atm ->
		  atm.getIdentification().equalsIgnoreCase(identification)).findFirst() ) ).collect(Collectors.toList()));
		 
		return atmRes.orElse(null);
	}

}

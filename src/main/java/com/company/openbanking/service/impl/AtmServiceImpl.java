package com.company.openbanking.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.openbanking.client.CallRestService;
import com.company.openbanking.dto.ATM;
import com.company.openbanking.dto.AtmListWrapper;
import com.company.openbanking.service.IAtmService;
import com.company.openbanking.util.AtmUtil;


@Service
public class AtmServiceImpl implements IAtmService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AtmServiceImpl.class);
	
	@Autowired
	private CallRestService callRestService;
	
	@Autowired
	AtmUtil atmUtil;

	@Override
	public ATM getAtmService(String url, String identification) {
		
		
		String result = callRestService.restGetCall(url);
		AtmListWrapper atmList = atmUtil.responseMapper(result, AtmListWrapper.class);
		
		
		  Optional<ATM> atmLst = atmList.getData().stream().flatMap(brl -> brl.getBrand().stream().flatMap(atmDet -> atmDet.getAtm().stream().filter(atm -> atm.getIdentification().equalsIgnoreCase(identification)))).findFirst();
		
		  LOGGER.info("The ATM Details : " + atmLst.orElse(null));
		 
		return atmLst.orElse(null);
	}

}	

package com.AdressServices.AdressService.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AdressServices.AdressService.model.Adress;
import com.AdressServices.AdressService.repo.AdressRepo;
import com.AdressServices.AdressService.response.AdressResponse;
@Service
public class AdressService {

	@Autowired
	AdressRepo  adressRepo;
	@Autowired
	ModelMapper modelMapper;
	
	 public AdressResponse findAdressByEmployeeId( Integer id){
		Optional<Adress>  adress=adressRepo.findAdressByEmployeeId(id);
		AdressResponse adressResponse=modelMapper.map(adress,AdressResponse.class );
		return adressResponse;
	}
	
}

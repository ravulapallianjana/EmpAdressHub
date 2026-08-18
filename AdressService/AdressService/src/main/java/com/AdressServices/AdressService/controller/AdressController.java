package com.AdressServices.AdressService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AdressServices.AdressService.response.AdressResponse;
import com.AdressServices.AdressService.service.AdressService;

@RestController
@RequestMapping("/api/v1")
public class AdressController {
	@Autowired
	AdressService adressService;

	@GetMapping("/address/{id}")
	AdressResponse getAdress(@PathVariable Integer id) {
		return adressService.findAdressByEmployeeId(id);

	}
}

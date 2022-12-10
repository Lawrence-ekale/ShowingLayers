package com.lawrence.showingLayers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lawrence.showingLayers.businessLogic.Business;

@RestController
public class Controller {
	@Autowired
	private Business businessLayer;
	
	@GetMapping("/adding")
	public long displaySum() {
		return businessLayer.returnSum();
	}

}


package com.example.Spring_Data_JPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Spring_Data_JPA.entity.MayBay;
import com.example.Spring_Data_JPA.service.MayBayService;

@RestController
@RequestMapping("/mayBay")
public class MayBayController {
	
	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/getTamBayLonHon10000")
	public List<MayBay> getTamBayLonHon10000() {
		return mayBayService.getTamBayLonHon10000();
	}
	
	@GetMapping("/getMayBayBoeing")
	public List<MayBay> getMayBayBoeing() {
		return mayBayService.getMayBayBoeing();
	}
	

}

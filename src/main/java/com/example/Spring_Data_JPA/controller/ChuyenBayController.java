package com.example.Spring_Data_JPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Spring_Data_JPA.entity.ChuyenBay;
import com.example.Spring_Data_JPA.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyenBay")
public class ChuyenBayController {

	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenBayDenDaLat")
	public List<ChuyenBay> chuyenBayDenDaLat(){
		return chuyenBayService.chuyenBayDenDaLat();
	}
	
	@GetMapping("/getDoDaiLonHon8000NhoHon10000")
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000(){
		return chuyenBayService.getDoDaiLonHon8000NhoHon10000();
	}
	
	@GetMapping("/getDiSGNDenBMV")
	public List<ChuyenBay> getDiSGNDenBMV() {
		return chuyenBayService.getDiSGNDenBMV();
	}
	
	@GetMapping("/getDiSGN")
	public List<ChuyenBay> getDiSGN(){
		return chuyenBayService.getDiSGN();
	}
	
	@GetMapping("/getCBMBAirbusA320BayDuoc")
	public List<ChuyenBay> getCBMBAirbusA320BayDuoc(){
		return chuyenBayService.getCBMBAirbusA320BayDuoc();
	}
	

}

package com.example.Spring_Data_JPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Data_JPA.entity.ChuyenBay;
import com.example.Spring_Data_JPA.service.ChuyenBayService;

@RestController
public class ChuyenBayController {

	@Autowired
	private ChuyenBayService chuyenBayService;
	
	@GetMapping("/chuyenBay/{gaDen}")
	public List<ChuyenBay> findChuyenBayDaLat(@PathVariable String gaDen) {
		return chuyenBayService.findCBDaLat(gaDen);
	}
	
}

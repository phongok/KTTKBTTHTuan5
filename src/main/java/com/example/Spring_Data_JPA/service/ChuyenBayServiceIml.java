package com.example.Spring_Data_JPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Spring_Data_JPA.entity.ChuyenBay;
import com.example.Spring_Data_JPA.repository.ChuyenBayRepository;


@Service
public class ChuyenBayServiceIml implements ChuyenBayService {
    private ChuyenBayRepository bayRepository;
	@Override
	public List<ChuyenBay> findCBDaLat(String gaDen) {
		
		return bayRepository.findChuyenBayDaLat(gaDen);
	}

}

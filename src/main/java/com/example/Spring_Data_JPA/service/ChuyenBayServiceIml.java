package com.example.Spring_Data_JPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_Data_JPA.entity.ChuyenBay;
import com.example.Spring_Data_JPA.repository.ChuyenBayRepository;


@Service
public class ChuyenBayServiceIml implements ChuyenBayService {
	@Autowired
    private ChuyenBayRepository bayRepository;
	
	@Override
	public List<ChuyenBay> chuyenBayDenDaLat() {
		// TODO Auto-generated method stub
		return bayRepository.chuyenBayDenDaLat();
	}
	@Override
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000() {
		// TODO Auto-generated method stub
		return bayRepository.getDoDaiLonHon8000NhoHon10000();
	}
	

}

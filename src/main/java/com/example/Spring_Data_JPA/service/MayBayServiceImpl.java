package com.example.Spring_Data_JPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Spring_Data_JPA.entity.MayBay;
import com.example.Spring_Data_JPA.repository.MayBayRepository;

@Service
public class MayBayServiceImpl implements MayBayService{
	
	@Autowired
	private MayBayRepository mayBayRepository;

	@Override
	public List<MayBay> getTamBayLonHon10000() {
		return mayBayRepository.getTamBayLonHon10000();
	}

	@Override
	public List<MayBay> getMayBayBoeing() {
		return mayBayRepository.getMayBayBoeing();
	}

	@Override
	public List<MayBay> getMBBayCBVN280() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> getTongNVMoiLoaiMB() {
		// TODO Auto-generated method stub
		return null;
	}


	
	
}
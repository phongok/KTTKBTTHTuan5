package com.example.Spring_Data_JPA.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Spring_Data_JPA.repository.ChuyenBayRepository;
import com.example.Spring_Data_JPA.entity.ChuyenBay;


@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{

	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	
	@Override
	public List<ChuyenBay> chuyenBayDenDaLat() {
		return chuyenBayRepository.chuyenBayDenDaLat();
	}

	@Override
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000() {
		return chuyenBayRepository.getDoDaiLonHon8000NhoHon10000();
	}

	@Override
	public List<ChuyenBay> getDiSGNDenBMV() {
		return chuyenBayRepository.getDiSGNDenBMV();
	}

	@Override
	public List<ChuyenBay> getDiSGN() {
		return chuyenBayRepository.getDiSGN();
	}

	@Override
	public List<ChuyenBay> getCBMBAirbusA320BayDuoc() {
		return chuyenBayRepository.getCBMBAirbusA320BayDuoc();
	}


}
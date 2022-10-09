package com.example.Spring_Data_JPA.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Spring_Data_JPA.entity.NhanVien;
import com.example.Spring_Data_JPA.repository.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService{

	@Autowired
	private NhanVienRepository nhanVienRepository;
	
	@Override
	public List<NhanVien> getLuongNhoHon10000() {
		return nhanVienRepository.getLuongNhoHon10000();
	}

	@Override
	public double tongLuong() {
		return nhanVienRepository.tongLuong();
	}

	@Override
	public List<String> getPhiCongBoeing() {
		return nhanVienRepository.getPhiCongBoeing();
	}



}

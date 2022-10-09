package com.example.Spring_Data_JPA.service;

import java.util.List;
import com.example.Spring_Data_JPA.entity.NhanVien;
public interface NhanVienService {
	
	public List<NhanVien> getLuongNhoHon10000();
	public double tongLuong();
	public List<String> getPhiCongBoeing();
	
}

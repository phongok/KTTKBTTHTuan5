package com.example.Spring_Data_JPA.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Data_JPA.entity.NhanVien;
import com.example.Spring_Data_JPA.service.NhanVienService;



@RestController
@RequestMapping("/nhanVien")
public class NhanVienController {

	@Autowired
	private NhanVienService nhanVienService;
	
	@GetMapping("/getLuongNhoHon10000")
	public List<NhanVien> getLuongNhoHon10000() {
		return nhanVienService.getLuongNhoHon10000();
	}
	
	@GetMapping("/tongLuong")
	public double tongLuong() {
		return nhanVienService.tongLuong();
	}
	
	@GetMapping("/getPhiCongBoeing")
	public List<String> getPhiCongBoeing(){
		return nhanVienService.getPhiCongBoeing();
	}
	
	
}

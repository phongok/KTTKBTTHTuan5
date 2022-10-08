package com.example.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Spring_Data_JPA.entity.NhanVien;



@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String>{

	@Query(value = "select * from nhanvien where luong<10000", nativeQuery = true)
	public List<NhanVien> getLuongNhoHon10000();
	
	@Query(value = "select sum(luong) as tong_luong from nhanvien", nativeQuery = true)
	public double tongLuong();
	
	
}

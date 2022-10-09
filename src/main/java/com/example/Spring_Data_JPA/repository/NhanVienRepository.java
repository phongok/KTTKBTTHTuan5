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
	
	@Query(value = "select cn.ma_nhan_vien from chungnhan cn join maybay mb on cn.ma_may_bay = mb.ma_may_bay where loai LIKE 'Boeing%'", nativeQuery = true)
	public List<String> getPhiCongBoeing();
	
	
}

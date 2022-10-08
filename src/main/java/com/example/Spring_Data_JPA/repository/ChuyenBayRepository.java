package com.example.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_Data_JPA.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
	
	@Query(value = "SELECT * FROM chuyenbay WHERE ga_den = 'DAD'", nativeQuery = true)
	public List<ChuyenBay> chuyenBayDenDaLat();

	@Query(value = "select * from chuyenbay where do_dai<10000 and do_dai>8000", nativeQuery = true)
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000();
	
	@Query(value = "select * from chuyenbay where ga_di='SGN' and ga_den='BMV'", nativeQuery = true)
	public List<ChuyenBay> getDiSGNDenBMV();
	
	@Query(value = "select * from chuyenbay where ga_di='SGN'", nativeQuery = true)
	public List<ChuyenBay> getDiSGN();
}

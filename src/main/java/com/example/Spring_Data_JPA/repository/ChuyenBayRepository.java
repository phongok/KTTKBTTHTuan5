package com.example.Spring_Data_JPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_Data_JPA.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
		@Query("select b from chuyenbay u where u.GaDen = ?1")
		List<ChuyenBay> findChuyenBayDaLat(String gaDen);
}

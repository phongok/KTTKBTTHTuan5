package com.example.Spring_Data_JPA.service;

import java.util.List;

import com.example.Spring_Data_JPA.entity.ChuyenBay;


public interface ChuyenBayService {
		List<ChuyenBay> findCBDaLat(String gaDen);
}

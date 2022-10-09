package com.example.Spring_Data_JPA.service;

import java.util.List;
import com.example.Spring_Data_JPA.entity.ChuyenBay;
public interface ChuyenBayService {
	public List<ChuyenBay> chuyenBayDenDaLat();
	public List<ChuyenBay> getDoDaiLonHon8000NhoHon10000();
	public List<ChuyenBay> getDiSGNDenBMV();
	public List<ChuyenBay> getDiSGN();
	public List<ChuyenBay> getCBMBAirbusA320BayDuoc();
	
}

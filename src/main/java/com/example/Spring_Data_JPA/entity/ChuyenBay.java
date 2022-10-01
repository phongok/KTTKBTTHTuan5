package com.example.Spring_Data_JPA.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "chuyenbay")
public class ChuyenBay {
	@Id
	@GeneratedValue
	private String maCB;
	
	@Column(name="GaDi")
	private String gaDi;
	
	@Column(name="GaDen")
	private String gaDen;
	
	@Column(name="DoDai")
	private int doDai;
	
	@Column(name="GioDi")
	private LocalDate gioDi;
	
	@Column(name="GioDen")
	private LocalDate gioDen;
	
	@Column(name="ChiPhi")
	private int chiPhi;

	public String getMaCB() {
		return maCB;
	}

	public void setMaCB(String maCB) {
		this.maCB = maCB;
	}

	public String getGaDi() {
		return gaDi;
	}

	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}

	public String getGaDen() {
		return gaDen;
	}

	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}

	public int getDoDai() {
		return doDai;
	}

	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}

	public LocalDate getGioDi() {
		return gioDi;
	}

	public void setGioDi(LocalDate gioDi) {
		this.gioDi = gioDi;
	}

	public LocalDate getGioDen() {
		return gioDen;
	}

	public void setGioDen(LocalDate gioDen) {
		this.gioDen = gioDen;
	}

	public int getChiPhi() {
		return chiPhi;
	}

	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}

	public ChuyenBay(String maCB, String gaDi, String gaDen, int doDai, LocalDate gioDi, LocalDate gioDen, int chiPhi) {
		super();
		this.maCB = maCB;
		this.gaDi = gaDi;
		this.gaDen = gaDen;
		this.doDai = doDai;
		this.gioDi = gioDi;
		this.gioDen = gioDen;
		this.chiPhi = chiPhi;
	}

	public ChuyenBay() {
		super();
	}

	@Override
	public String toString() {
		return "ChuyenBay [maCB=" + maCB + ", gaDi=" + gaDi + ", gaDen=" + gaDen + ", doDai=" + doDai + ", gioDi="
				+ gioDi + ", gioDen=" + gioDen + ", chiPhi=" + chiPhi + "]";
	}
	
	
	
}

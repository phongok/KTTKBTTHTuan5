package com.example.Spring_Data_JPA.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.Spring_Data_JPA.entity.MayBay;

@Repository
public interface MayBayRepository extends JpaRepository<MayBay, Integer>{
	
	@Query(value = "SELECT * FROM [maybay] where tam_bay > 10000", nativeQuery = true)
	public List<MayBay> getTamBayLonHon10000();
	
	@Query(value = "select * from maybay where loai LIKE 'Boeing%'", nativeQuery = true)
	public List<MayBay> getMayBayBoeing();
	

}

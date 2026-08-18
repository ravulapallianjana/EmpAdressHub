package com.AdressServices.AdressService.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AdressServices.AdressService.model.Adress;

@Repository
public interface AdressRepo extends JpaRepository<Adress, Integer> {

	@Query(nativeQuery = true, value = "select a.id,a.city,a.state from adress70 as a "
			+ "join  employeee70 as e on e.id=a.id where a.id=:id")
    Optional<Adress> findAdressByEmployeeId(Integer id);

}

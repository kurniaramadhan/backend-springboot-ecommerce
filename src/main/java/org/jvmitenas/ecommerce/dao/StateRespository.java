package org.jvmitenas.ecommerce.dao;

import java.util.List;

import org.jvmitenas.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
public interface StateRespository extends JpaRepository<State, Integer> {
	
	List<State> findByCountryCode(@Param("countryCode") String countryCode);
}

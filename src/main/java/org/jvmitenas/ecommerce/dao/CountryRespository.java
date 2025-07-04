package org.jvmitenas.ecommerce.dao;

import org.jvmitenas.ecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "countries", path = "countries")
public interface CountryRespository extends JpaRepository<Country, Integer> {

}

package org.jvmitenas.ecommerce.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jvmitenas.ecommerce.entity.Country;
import org.jvmitenas.ecommerce.entity.Product;
import org.jvmitenas.ecommerce.entity.ProductCategory;
import org.jvmitenas.ecommerce.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import jakarta.persistence.EntityManager;
import jakarta.persistence.metamodel.EntityType;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	private EntityManager entityManager;
	
	@Autowired
	public MyDataRestConfig(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		RepositoryRestConfigurer.super.configureRepositoryRestConfiguration(config, cors);
		HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
		
		// disable method HTTP untuk Product: POST, PUT, dan DELETE
		config.getExposureConfiguration()
		.forDomainType(Product.class)
        .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
        .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		// disable method HTTP untuk ProductCategory: POST, PUT, dan DELETE
		config.getExposureConfiguration()
		.forDomainType(ProductCategory.class)
        .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
        .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		// disable method HTTP untuk Country: POST, PUT, dan DELETE
		config.getExposureConfiguration()
		.forDomainType(Country.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		// disable method HTTP untuk State: POST, PUT, dan DELETE
		config.getExposureConfiguration()
		.forDomainType(State.class)
		.withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
		
		//panggil helper method
		exposeId(config);
	}
	
	@SuppressWarnings("rawtypes")
	private void exposeId(RepositoryRestConfiguration config) {
		//ambil semua entity class dari entity manager
		Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
		
		//buat array dari entity type
		List<Class> entityClasses = new ArrayList<>();
		
		//ambil entity type dari entities
		for (EntityType tempEntityType : entities) {
			entityClasses.add(tempEntityType.getJavaType());
		}
		
		//ekspos entity id untuk domain tertentu
		Class[] domainTypes = entityClasses.toArray(new Class[0]);
		config.exposeIdsFor(domainTypes);
	}
	
}

package org.wecancodeit.cities.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.cities.model.City;

public interface CityRepository extends CrudRepository<City, Long> {

	City findByCityNameIgnoreCase(String name);

}

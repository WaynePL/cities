package org.wecancodeit.cities.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.cities.model.State;

public interface StateRepository extends CrudRepository<State, Long> {

	State findByAbbreviationIgnoreCase(String abbr);

	State findByNameIgnoreCase(String state);

}

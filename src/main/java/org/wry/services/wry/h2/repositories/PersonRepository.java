/**
 *@author reeno 2018
 */
package org.wry.services.wry.h2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wry.services.wry.h2.entities.Person;

/**
 * @author reeno 2018
 */
public interface PersonRepository extends CrudRepository<Person, Integer>{

}

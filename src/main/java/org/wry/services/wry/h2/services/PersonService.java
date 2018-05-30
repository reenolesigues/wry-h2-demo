/**
 *@author reeno 2018
 */
package org.wry.services.wry.h2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wry.services.wry.h2.entities.Person;
import org.wry.services.wry.h2.repositories.PersonRepository;

/**
 * @author reeno 2018
 */
@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Integer addPerson(Person p) {
		return personRepository.save(p).getId();
	}
	
	public Person getPerson(Integer id) {
		return personRepository.findById(id).get();
	}
}

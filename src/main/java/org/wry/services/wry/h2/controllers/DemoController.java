/**
 *@author reeno 2018
 */
package org.wry.services.wry.h2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.wry.services.wry.h2.entities.Person;
import org.wry.services.wry.h2.services.PersonService;

/**
 * @author reeno
 */
@RestController
public class DemoController {

	@Autowired
	private PersonService personService;
	
	@GetMapping(value="/get/{id}")
	public Person getPerson(@PathVariable(name="id") Integer id) {
		return personService.getPerson(id);
	}
	
	@PostMapping(value="/add", consumes=MediaType.APPLICATION_JSON_VALUE)
	public Integer addPerson(@RequestBody Person p) {
		return personService.addPerson(p);
	}
	
}

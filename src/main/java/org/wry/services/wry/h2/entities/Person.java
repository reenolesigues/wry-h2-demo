/**
 *@author reeno
 */
package org.wry.services.wry.h2.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author reeno
 *
 */
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY, generator="WRYSEQGEN")
	@SequenceGenerator(name="WRYSEQGEN", sequenceName="WRY_SEQ")
	private Integer id;
	
	private String name;
	
	private Date birthday;
	
	public Person() {
		super();
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthday=" + birthday + "]";
	}
	
}

package com.hotel.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rachana Sharma
 * Model Class Hotel
 */
@Entity
@Table
public class Hotel {
	/**
	 * the Id
	 */
	@Id
	@Column
	private int id;
	/**
	 * The Name
	 */
	@Column
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
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
}

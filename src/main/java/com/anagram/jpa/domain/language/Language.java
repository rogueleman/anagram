package com.anagram.jpa.domain.language;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.emailvision.data.jpa.domain.IEntity;

@Entity(name = "Language")
@Table(name = "language")
@Access(AccessType.FIELD)
public class Language implements IEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2149650084140561393L;

	@Id
	@Column(unique=true, nullable=false)
	private Long id;
	
	@Column(name="LAST_NAME", columnDefinition="NVARCHAR(32)", nullable=false)
	private String lastName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
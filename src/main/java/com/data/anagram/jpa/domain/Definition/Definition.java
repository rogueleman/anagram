package com.data.anagram.jpa.domain.Definition;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.emailvision.data.jpa.domain.IEntity;

/*
 * Generate automatically method 
 * by lombok
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"lexicon", "id"})
@ToString

@Entity(name = "Definition")
@Table(name = "DefinitionOk")
@Access(AccessType.FIELD)
public class Definition implements IEntity<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2090450220419309231L;

	@Id
	@Column(unique=true, nullable=false)
	private Integer id;

	@Column(unique=true, nullable=false)
	private Integer userId;
	
	@Column(unique=true, nullable=false)
	private Integer sourceId;

	@Column(columnDefinition="VARCHAR(100)", nullable=false)
	private String lexicon;
	
	@Column(unique=true, nullable=false)
	private Integer displayed;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the sourceId
	 */
	public Integer getSourceId() {
		return sourceId;
	}
	/**
	 * @param sourceId the sourceId to set
	 */
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	/**
	 * @return the lexicon
	 */
	public String getLexicon() {
		return lexicon;
	}
	/**
	 * @param lexicon the lexicon to set
	 */
	public void setLexicon(String lexicon) {
		this.lexicon = lexicon;
	}
	/**
	 * @return the displayed
	 */
	public Integer getDisplayed() {
		return displayed;
	}
	/**
	 * @param displayed the displayed to set
	 */
	public void setDisplayed(Integer displayed) {
		this.displayed = displayed;
	}
}
package com.anagram.jpa.domain.words;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.emailvision.data.jpa.domain.IEntity;

@Entity(name = "Words")
@Table(name = "Words")
@Access(AccessType.FIELD)
public class Words implements IEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -256213996070380805L;

	@Id
	@Column(unique=true, nullable=false)
	private Long id;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.EAGER)
	@JoinColumn(name = "id")
	private Language lang;
	
	@Column(columnDefinition="NVARCHAR(100)", nullable=false)
	private String word;
	
	@Column(columnDefinition="NVARCHAR(100)", nullable=false)
	private String sortedWordChars;
	
	@Column(columnDefinition="NVARCHAR(100)", nullable=false)
	private String wordWithoutDiacritics;
		
	@Column(columnDefinition="NVARCHAR(100)", nullable=false)
	private String sortedWordCharsWithoutDiacritics;

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
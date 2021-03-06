package com.data.anagram.jpa.domain.words;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.emailvision.data.jpa.domain.IEntity;
import com.lib.anagram.Language;

/*
 * Generate automatically method 
 * by lombok
 */
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@EqualsAndHashCode(of = {"lang", "id", "word"})
@ToString

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

	@XmlElement(name = "lang", required = true)
	private Language lang;
	
	@Column(columnDefinition="NVARCHAR(100)", nullable=false)
	private String word;
	
	@Column(columnDefinition="NVARCHAR(100)")
	private String sortedWordChars;
	
	@Column(columnDefinition="NVARCHAR(100)")
	private String wordWithoutDiacritics;
		
	@Column(columnDefinition="NVARCHAR(100)")
	private String sortedWordCharsWithoutDiacritics;
	
	@Column()
	private Integer wordLength;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the lang
	 */
	public Language getLang() {
		return lang;
	}
	/**
	 * @param lang the lang to set
	 */
	public void setLang(Language lang) {
		this.lang = lang;
	}
	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}
	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}
	/**
	 * @return the sortedWordChars
	 */
	public String getSortedWordChars() {
		return sortedWordChars;
	}
	/**
	 * @param sortedWordChars the sortedWordChars to set
	 */
	public void setSortedWordChars(String sortedWordChars) {
		this.sortedWordChars = sortedWordChars;
	}
	/**
	 * @return the wordWithoutDiacritics
	 */
	public String getWordWithoutDiacritics() {
		return wordWithoutDiacritics;
	}
	/**
	 * @param wordWithoutDiacritics the wordWithoutDiacritics to set
	 */
	public void setWordWithoutDiacritics(String wordWithoutDiacritics) {
		this.wordWithoutDiacritics = wordWithoutDiacritics;
	}
	/**
	 * @return the sortedWordCharsWithoutDiacritics
	 */
	public String getSortedWordCharsWithoutDiacritics() {
		return sortedWordCharsWithoutDiacritics;
	}
	/**
	 * @param sortedWordCharsWithoutDiacritics the sortedWordCharsWithoutDiacritics to set
	 */
	public void setSortedWordCharsWithoutDiacritics(String sortedWordCharsWithoutDiacritics) {
		this.sortedWordCharsWithoutDiacritics = sortedWordCharsWithoutDiacritics;
	}
	/**
	 * @return the wordLength
	 */
	public Integer getWordLength() {
		return wordLength;
	}
	/**
	 * @param wordLength the wordLength to set
	 */
	public void setWordLength(Integer wordLength) {
		this.wordLength = wordLength;
	}

}
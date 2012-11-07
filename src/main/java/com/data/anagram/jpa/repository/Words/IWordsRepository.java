package com.data.anagram.jpa.repository.Words;

import java.util.List;

import com.data.anagram.jpa.domain.words.Words;
import com.emailvision.data.jpa.repository.IGenericRepository;

public interface IWordsRepository extends IGenericRepository<Words, Long> {

	public List<Words> getWords();
	
}

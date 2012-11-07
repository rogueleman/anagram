package com.data.anagram.jpa.repository.Definition;

import java.util.List;

import com.data.anagram.jpa.domain.Definition.Definition;
import com.emailvision.data.jpa.repository.IGenericRepository;

public interface IDefinitionRepository extends IGenericRepository<Definition, Integer> {

	public List<Definition> getDefinitions();
	
}

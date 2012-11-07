package com.data.anagram.jpa.repository.Definition;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import com.data.anagram.jpa.Anagram;
import com.data.anagram.jpa.domain.Definition.Definition;
import com.data.anagram.jpa.domain.Definition.Definition_;
import com.emailvision.data.jpa.repository.AbstractGenericRepository;

@Repository("definitionRepository")
public class DefinitionRepository extends AbstractGenericRepository<Definition, Integer> implements IDefinitionRepository {

	@PersistenceContext(type=PersistenceContextType.TRANSACTION, unitName=Anagram.PERSISTENCE_UNIT_NAME)
	@Required
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Definition> getDefinitions() {
    	final CriteriaBuilder criteriaBuilder = getCriteriaBuilder();
    	final CriteriaQuery<Definition> criteriaQuery = criteriaBuilder.createQuery(Definition.class);
    	final Root<Definition> fromUser = criteriaQuery.from(Definition.class);
    	return findByCriteriaQuery(criteriaQuery.orderBy(criteriaBuilder.asc(fromUser.get(Definition_.id))));
	}
}

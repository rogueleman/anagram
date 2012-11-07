package com.data.anagram.jpa.domain.Definition;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Definition.class)
public abstract class Definition_ {

	public static volatile SingularAttribute<Definition, Integer> id;
	public static volatile SingularAttribute<Definition, String> lexicon;
	public static volatile SingularAttribute<Definition, Integer> displayed;
	public static volatile SingularAttribute<Definition, Integer> userId;
	public static volatile SingularAttribute<Definition, Integer> sourceId;

}


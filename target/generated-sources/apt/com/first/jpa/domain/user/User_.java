package com.first.jpa.domain.user;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import com.data.anagram.jpa.domain.dumpIds.DumpIds;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DumpIds.class)
public abstract class User_ {

	public static volatile SingularAttribute<DumpIds, Long> id;
	public static volatile SingularAttribute<DumpIds, String> lastName;
	public static volatile SingularAttribute<DumpIds, String> firstName;

}


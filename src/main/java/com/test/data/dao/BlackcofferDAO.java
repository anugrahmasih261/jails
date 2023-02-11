package com.test.data.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.data.entity.Blackcoffer;


@Repository
public class BlackcofferDAO {

	@Autowired
    private EntityManager entityManager;
	
	@Transactional
	public List<Blackcoffer> findAll()
	{
		Session currentSession=entityManager.unwrap(Session.class);
		
		
		
		Query<Blackcoffer> theQuery=currentSession.createQuery("from Blackcoffer order by id",Blackcoffer.class);
		
		
		List<Blackcoffer> blackcoffer=theQuery.getResultList();
		
		

		return blackcoffer;

		
		
	}
	
	
	
	
}

package com.niit.entertainment_backend.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.entertainment_backend.dao.Categorydao;
import com.niit.entertainment_backend.model.Categorymodel;

@Repository
public class Categorydaoimpl implements Categorydao {
	@Autowired
	SessionFactory sessionFactory;
	
/*	public Categorydaoimpl(SessionFactory sessionFactory )
	{
		this.sessionFactory=sessionFactory;
		
	}*/

	public List<Categorymodel> getAllCategoryDetails() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<Categorymodel> category=null;
		session.beginTransaction();
		category=session.createQuery("from Categorymodel").list();
		session.getTransaction().commit();
	
		
		return category ;
	}

	public Categorymodel getCategoryDetails(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCategoryDetails(Categorymodel obj) {
		// TODO Auto-generated method stub
		
	}

	public void addCategoryDetails(Categorymodel obj) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(obj);
		s.getTransaction().commit();
		s.close();
		
	}

}

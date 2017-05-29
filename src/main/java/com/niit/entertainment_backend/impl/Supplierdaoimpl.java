package com.niit.entertainment_backend.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.entertainment_backend.dao.Supplierdao;
import com.niit.entertainment_backend.model.Suppliermodel;
@Repository
public class Supplierdaoimpl implements Supplierdao {
	@Autowired
	SessionFactory sessionFactory;
	
	public List<Suppliermodel> getAllSupplierDetails() {
		
			Session s=sessionFactory.openSession();
			s.beginTransaction();
			List<Suppliermodel> list=s.createQuery("from Suppliermodel").list();
			s.getTransaction().commit();
			return list;
		}
		
	

	public Suppliermodel getSupplierDetails(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateSupplierDetails(Suppliermodel obj) {
		// TODO Auto-generated method stub
		
	}


	public void addSupplierDetails(Suppliermodel obj) {
		// TODO Auto-generated method stub
		Session s=sessionFactory.openSession();
		s.beginTransaction();
		s.save(obj);
		s.getTransaction().commit();
		s.close();
		
	}

	
}

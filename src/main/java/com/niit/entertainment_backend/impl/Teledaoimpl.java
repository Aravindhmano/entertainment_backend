package com.niit.entertainment_backend.impl;



import java.util.List;

import com.niit.entertainment_backend.dao.Teledao;
import com.niit.entertainment_backend.model.Telemodel;




public class Teledaoimpl implements Teledao
{

	public List<Telemodel> getAllProductDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	public Telemodel getProductDetail(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateProductDetails(Telemodel obj) {
		// TODO Auto-generated method stub
		
	}
	public void addProduct(Telemodel obj) {
		// TODO Auto-generated method stub
		
	}
/*	private Session currentSession;
	private Transaction currentTransaction;
	
	
	public Teledaoimpl() {
		
	}
	
	public Session openCurrentSession() {
	    currentSession = getSessionFactory().openSession();
	    return currentSession;
    }
	
	public Session openCurrentSessionwithTransaction() {
			currentSession = getSessionFactory().openSession();
			currentTransaction = currentSession.beginTransaction();
			return currentSession;
	}

    public void closeCurrentSession() {
    		currentSession.close();
    }
    
     public void closeCurrentSessionwithTransaction() {
         	currentTransaction.commit();
         	currentSession.close();
     }
     
	 private static SessionFactory getSessionFactory() {
		     
             Configuration configuration = new Configuration().configure();
             StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
             SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
             return sessionFactory;
     }
	
	    public Session getCurrentSession() {
		 	return currentSession;
     }

    public void setCurrentSession(Session currentSession) {
        	this.currentSession = currentSession;
     }

    public Transaction getCurrentTransaction() {
             return currentTransaction;
     }

     public void setCurrentTransaction(Transaction currentTransaction) {
    	 	this.currentTransaction = currentTransaction;
    }

	//Getting Product details from Model
	public List<Telemodel> getAllProductDetails()
	{
		List<Telemodel> products = (List<Telemodel>) getCurrentSession().createQuery("from ProductDetails").list();

        return products;
	}
	
	public Telemodel getProductDetail(String id)
	{
		Telemodel product = (Telemodel) getCurrentSession().get(Telemodel.class, id);

        return product;
	}
	
	public void updateProductDetails(Telemodel obj)
	{
		getCurrentSession().update(obj);
	
	}
	public void addProduct(Telemodel obj)
	{
		getCurrentSession().save(obj);
	}
*/
	
}

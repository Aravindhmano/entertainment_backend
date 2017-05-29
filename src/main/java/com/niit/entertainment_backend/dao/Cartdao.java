package com.niit.entertainment_backend.dao;

import java.util.List;

import com.niit.entertainment_backend.model.Cartmodel;


public interface Cartdao {

	List<Cartmodel> getAllCartDetails();
    Cartmodel getCartDetails(String id);
	void updateCartDetails(Cartmodel obj);
	void addCartDetails(Cartmodel obj);
}

package com.niit.entertainment_backend.dao;

import com.niit.entertainment_backend.model.Telemodel;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface Teledao
{
	List<Telemodel> getAllProductDetails();
    Telemodel getProductDetail(int id);
	void updateProductDetails(Telemodel obj);
	void addProduct(Telemodel obj);
}



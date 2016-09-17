package io.swagger.dao;

import java.util.List;

import io.swagger.model.Product;

public interface ProductDAO {

	void persist(Product product);

	List<Product> getProductsByDescription(String searchText);
}

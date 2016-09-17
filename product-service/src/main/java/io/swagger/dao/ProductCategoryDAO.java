package io.swagger.dao;

import io.swagger.model.ProductCategory;

import java.util.List;

public interface ProductCategoryDAO {

	void create(ProductCategory category);

	List<ProductCategory> getAll();
}

package io.swagger.service;

import io.swagger.model.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
	void create(ProductCategory category);

	List<ProductCategory> getAll();
}

package io.swagger.dao;

import io.swagger.model.ProductCategory;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProductCategoryDAOImpl extends AbstractDAO implements
		ProductCategoryDAO {

	@Override
	public void create(ProductCategory category) {
		entityManager.persist(category);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ProductCategory> getAll() {

		return entityManager.createQuery(" from ProductCategory")
				.getResultList();
	}

}

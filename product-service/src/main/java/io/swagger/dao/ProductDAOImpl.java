package io.swagger.dao;

import io.swagger.model.Product;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProductDAOImpl extends AbstractDAO implements ProductDAO {

	@Override
	public void persist(Product product) {
		entityManager.persist(product);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductsByDescription(String searchText) {

		return entityManager
				.createQuery(
						" from Product p WHERE p.description like :pattern")
				.setParameter("pattern", "%" + searchText.trim() + "%")
				.getResultList();

	}

}

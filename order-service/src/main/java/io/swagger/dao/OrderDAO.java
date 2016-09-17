package io.swagger.dao;

import io.swagger.model.Order;

import java.util.List;

public interface OrderDAO {

	void persist(Order order);

	List<Order> getByEmailId(String email);

	List<Order> getByEmailIdAndStatus(String email, String status);
}

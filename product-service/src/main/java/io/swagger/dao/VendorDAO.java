package io.swagger.dao;

import io.swagger.model.Vendor;

import java.util.List;

public interface VendorDAO {

	void create(Vendor vendor);

	List<Vendor> getAllVendorList();
}

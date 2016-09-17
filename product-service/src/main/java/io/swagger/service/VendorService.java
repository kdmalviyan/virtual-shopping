package io.swagger.service;

import io.swagger.model.Vendor;

import java.util.List;

public interface VendorService {
	void create(Vendor vendor);

	List<Vendor> getAllVendorList();
}

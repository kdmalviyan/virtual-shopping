package io.swagger.service;

import io.swagger.dao.VendorDAO;
import io.swagger.model.Vendor;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("vendorService")
@Transactional
public class VendorServiceImpl implements VendorService{

	VendorDAO vendorDAO;
	
	@Override
	public void create(Vendor vendor) {
		vendorDAO.create(vendor);
		
	}

	@Override
	public List<Vendor> getAllVendorList() {
		return vendorDAO.getAllVendorList();
	}

}

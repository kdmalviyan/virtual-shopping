package io.swagger.api;

import io.swagger.dao.VendorDAO;
import io.swagger.model.Vendor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-11T08:53:10.271Z")
@Controller
public class VendorListApiController implements VendorListApi {

	@Autowired
	private VendorDAO vendorDAO;

	public ResponseEntity<List<Vendor>> vendorListGet() {
		return new ResponseEntity<List<Vendor>>(vendorDAO.getAllVendorList(),
				HttpStatus.OK);
	}

}

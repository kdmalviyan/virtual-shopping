package io.swagger.api;

import io.swagger.annotations.ApiParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-10T09:53:45.928Z")
@Controller
public class CreateVendorApiController implements CreateVendorApi {

	public ResponseEntity<Integer> createVendorPut(
			@ApiParam(value = "Create Vendor with Name", required = true) @RequestParam(value = "vendorName", required = true) String vendorName) {

		System.out.println("Vendor Created " + vendorName);
		return new ResponseEntity<Integer>(HttpStatus.OK);
	}

}

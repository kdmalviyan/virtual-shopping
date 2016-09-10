package io.swagger.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-09-10T07:33:11.471Z")
@Controller
public class VendorListApiController implements VendorListApi {

	public ResponseEntity<List<String>> vendorListGet() {

		List<String> vendorList = new ArrayList<String>();

		vendorList.add("Flipkart");
		vendorList.add("Amazon");
		vendorList.add("SnapDeal");

		return new ResponseEntity<List<String>>(vendorList, HttpStatus.OK);
	}

}
